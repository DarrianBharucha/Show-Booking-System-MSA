package com.example.paymentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@SpringBootApplication
@EnableFeignClients
public class paymentserviceApplication {
	public static void main(String[] args) {
		SpringApplication.run(paymentserviceApplication.class, args);
	}
}