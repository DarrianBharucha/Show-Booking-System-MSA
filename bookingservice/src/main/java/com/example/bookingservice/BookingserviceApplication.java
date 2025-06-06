package com.example.bookingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients  // Enable OpenFeign for inter-service communication
public class BookingserviceApplication {
	public static void main(String[] args) {
		SpringApplication.run(BookingserviceApplication.class, args);
	}
}
