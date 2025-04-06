package com.example.bookingservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "show-service", url = "http://localhost:8082/api/shows")
public interface ShowClient {
    @GetMapping("/{showId}")
    String getShow(@PathVariable Long showId);
}