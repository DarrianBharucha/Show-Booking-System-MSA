package com.example.bookingservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(name = "user-service", url = "http://localhost:8081/api/users")
public interface UserClient {
    @GetMapping("/{userId}")
    String getUser(@PathVariable Long userId);
}
