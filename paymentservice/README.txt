# Payment Service

## Overview
The Payment Service processes payments for ticket bookings in the Show Booking System. It ensures secure payment transactions and manages payment confirmations, status checks, and refunds.

## API Endpoints

- **Process Payment**
  - **Endpoint:** `POST /payments`
  - **Description:** Processes a payment transaction for a booking.
  - **Request Body:** JSON with payment details (amount, payment method, booking ID, etc.).
  - **Response:** Returns payment confirmation and transaction details.

- **Get Payment Status**
  - **Endpoint:** `GET /payments/{transactionId}`
  - **Description:** Retrieves the status of a specific payment transaction.
  - **Response:** Returns the payment status details.

- **Refund Payment**
  - **Endpoint:** `POST /payments/refund`
  - **Description:** Initiates a refund for a specific payment transaction.
  - **Request Body:** JSON with refund details.
  - **Response:** Returns confirmation of the refund and updated transaction details.

## Technologies Used
- Java (Spring Boot)
- REST APIs
- Integration with external payment gateways