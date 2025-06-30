package com.example.paymentservice.service;

import com.example.paymentservice.model.Payment;
import com.example.paymentservice.repository.PaymentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Transactional
    public Payment processPayment(Payment payment) {
        payment.setPaymentTime(LocalDateTime.now());
        payment.setPaymentStatus("PENDING");

        boolean isPaymentSuccessful = processWithGateway(payment);
        payment.setPaymentStatus(isPaymentSuccessful ? "SUCCESS" : "FAILED");

        return paymentRepository.save(payment);
    }

    public List<Payment> getPaymentsByUserId(Long userId) {
        return paymentRepository.findByUserId(userId);
    }

    public Payment getPaymentById(Long id) {
        return paymentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Payment not found with ID: " + id));
    }

    private boolean processWithGateway(Payment payment) {
        return Math.random() > 0.1;
    }
}