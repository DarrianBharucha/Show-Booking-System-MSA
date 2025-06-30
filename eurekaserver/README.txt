# Eureka Server

## Overview
The Eureka Server acts as the service registry for the Show Booking System. It allows microservices to register themselves and discover other services, playing a crucial role in load balancing and fault tolerance.

## Key Features & Endpoints

- **Eureka Dashboard**
  - **Endpoint:** `GET /` or `GET /eureka/`
  - **Description:** Provides a web interface to monitor all registered services and their statuses.

- **Service Registration & Discovery**
  - **Functionality:** Microservices automatically register with Eureka and discover each other using this server.

## Technologies Used
- Java (Spring Boot)
- Netflix Eureka Server
- REST APIs for internal service communication