# Omega Backend - Movie Review Application

**Omega** is a full-stack movie review application with a Spring Boot backend that handles movie data and reviews. This backend is designed to work seamlessly with the React.js frontend, utilizing MongoDB for data storage and management.

## Technologies Used
- **Spring Boot**: Framework for building the REST API.
- **MongoDB**: NoSQL database for storing movie data and reviews.
- **MongoDB Compass**: GUI for MongoDB management.
- **Axios**: HTTP client used in the frontend to communicate with this API.
- **ngrok**: Tool for exposing the backend API during development.
- **Maven**: Build tool for managing dependencies and building the project.
- **Lombok**: Library to reduce boilerplate code in Java.

## Features
- RESTful APIs for managing movies and reviews.
- Integration with MongoDB for data storage and retrieval.
- Real-time data exposure using ngrok during development.

## Project Structure
- **`src/main/java/com/omega/`**: Main source code directory.
  - **`controller/`**: REST API controllers.
  - **`model/`**: Data models (e.g., Movie, Review).
  - **`repository/`**: MongoDB repositories for data access.
  - **`service/`**: Business logic and service layer.
  - **`OmegaApplication.java`**: Main Spring Boot application class.
- **`src/main/resources/`**: Configuration files (e.g., `application.properties`).
