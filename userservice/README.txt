# User Service

## Overview
The User Service manages user registration, authentication, and profile management for the Show Booking System. It handles operations like creating, retrieving, updating, and deleting user records.

## API Endpoints

- **Register User**
  - **Endpoint:** `POST /users`
  - **Description:** Registers a new user with the required details.
  - **Request Body:** JSON with user information (name, email, password, etc.).
  - **Response:** Returns the newly created user details.

- **Get User**
  - **Endpoint:** `GET /users/{userId}`
  - **Description:** Retrieves details of a specific user.
  - **Response:** Returns user information.

- **Update User**
  - **Endpoint:** `PUT /users/{userId}`
  - **Description:** Updates details of an existing user.
  - **Request Body:** JSON with updated user information.
  - **Response:** Returns the updated user details.

- **Delete User**
  - **Endpoint:** `DELETE /users/{userId}`
  - **Description:** Deletes a user from the system.
  - **Response:** Returns confirmation of deletion.

## Technologies Used
- Java (Spring Boot)
- MySQL (or another relational database)
- REST APIs