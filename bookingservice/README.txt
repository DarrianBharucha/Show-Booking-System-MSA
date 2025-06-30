# Booking Service

## Overview
The Booking Service handles ticket booking operations for the Show Booking System. It manages the creation, retrieval, and cancellation of ticket bookings while ensuring proper seat allocation for each show.

## API Endpoints

- **Create Booking**
  - **Endpoint:** `POST /bookings`
  - **Description:** Creates a new booking for a selected show.
  - **Request Body:** JSON with booking details (user ID, show ID, selected seats, etc.).
  - **Response:** Returns booking confirmation details.

- **Get Booking Details**
  - **Endpoint:** `GET /bookings/{bookingId}`
  - **Description:** Retrieves details of a specific booking.
  - **Response:** Returns booking information.

- **List Bookings for a User**
  - **Endpoint:** `GET /users/{userId}/bookings`
  - **Description:** Retrieves all bookings made by a particular user.
  - **Response:** Returns a list of booking records.

- **Cancel Booking**
  - **Endpoint:** `DELETE /bookings/{bookingId}`
  - **Description:** Cancels an existing booking.
  - **Response:** Returns confirmation of cancellation.

## Technologies Used
- Java (Spring Boot)
- MySQL
- REST APIs