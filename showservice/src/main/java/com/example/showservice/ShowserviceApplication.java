package com.example.showservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ShowserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShowserviceApplication.class, args);
	}

}
