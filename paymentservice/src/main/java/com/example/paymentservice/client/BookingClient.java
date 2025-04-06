package com.example.paymentservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(name = "booking-service", url = "http://localhost:8082")
public interface BookingClient {
    @GetMapping("/api/bookings/details/{id}")
    Object getBookingById(@PathVariable Long id);
}
