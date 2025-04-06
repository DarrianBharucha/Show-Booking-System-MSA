# Show Service

## Overview
The Show Service manages details about shows, including show schedules, available seats, and show-specific information for the Show Booking System. It enables users to browse available shows and get detailed information about each.

## API Endpoints

- **Create Show**
  - **Endpoint:** `POST /shows`
  - **Description:** Creates a new show with details such as title, description, date, time, and available seats.
  - **Request Body:** JSON with show details.
  - **Response:** Returns the created show information.

- **Get Show Details**
  - **Endpoint:** `GET /shows/{showId}`
  - **Description:** Retrieves information about a specific show.
  - **Response:** Returns show details.

- **Update Show**
  - **Endpoint:** `PUT /shows/{showId}`
  - **Description:** Updates details of an existing show.
  - **Request Body:** JSON with updated show information.
  - **Response:** Returns the updated show information.

- **Delete Show**
  - **Endpoint:** `DELETE /shows/{showId}`
  - **Description:** Deletes a show from the system.
  - **Response:** Returns confirmation of deletion.

- **List All Shows**
  - **Endpoint:** `GET /shows`
  - **Description:** Retrieves a list of all available shows.
  - **Response:** Returns an array of show objects.

## Technologies Used
- Java (Spring Boot)
- MySQL (or a similar relational database)
- REST APIs