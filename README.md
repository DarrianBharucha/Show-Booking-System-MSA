# Show-Booking-System-
The folder comprises of codes of 4 Microservices that were used to develop a show booking system.
Microservices-Based Show Booking System

A Show Booking System built using microservices architecture to manage user registrations, show details, ticket bookings, payments, and service discovery.

Microservices

The system is divided into several microservices, each responsible for a specific function. Here is a brief description of each:

1. User Service
   - Manages user information, including personal details, login, and authentication.
   - Exposes REST APIs to add, update, retrieve, and delete user records.
   - Responsible for handling user registrations and managing profiles.

2. Show Service
   - Manages show details, including showtimes, available seats, and schedules.
   - Provides APIs to create, update, and retrieve show information.
   - Enables users to browse available shows and their details.

3. Booking Service
   - Handles ticket bookings for different shows.
   - Provides APIs to create, retrieve, and manage user bookings.
   - Ensures proper seat allocation and availability management.

4. Payment Service
   - Processes payments for show ticket bookings.
   - Supports various payment methods (for example, credit/debit cards, UPI, net banking).
   - Provides APIs to process payments, check transaction status, and handle refunds.

5. Eureka Server (Service Discovery)
   - Acts as a service registry for dynamically discovering microservices.
   - Helps in load balancing, failover handling, and service communication.
   - Provides an admin dashboard to monitor all registered microservices.

6. API Gateway
   - Routes client requests to the appropriate microservices.
   - Enhances security, load balancing, and request management.
   - Provides a single entry point for external users.

Technologies Used

Backend: Java (Spring Boot)
Architecture: Microservices with Spring Cloud
Service Discovery: Netflix Eureka Server
API Management: API Gateway
Communication: OpenFeign
Database: MySQL (for data storage)
Security: Spring Security
Containerization: Docker

This document provides a structured overview of the Show Booking System, explaining each microservice and the technologies used.
