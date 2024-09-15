# Omega - Movie Review Application

**Omega** is a full-stack web application designed to allow users to browse movies from a database, submit reviews, and view them in real-time. The application is built using **React.js** for the frontend and **Spring Boot** for the backend, with **MongoDB** as the database. The backend provides RESTful APIs and is integrated with **ngrok** for exposing local development to the web.

## Technologies Used
- **Frontend**: React.js
- **Backend**: Spring Boot (REST API)
- **Database**: MongoDB (using MongoDB Compass for database management)
- **API Communication**: Axios (to communicate between frontend and backend)
- **Local Tunneling**: ngrok (for exposing Spring Boot API to the web)
- **Development Tools**: Maven, Spring Boot DevTools, MongoDB Compass

## Features
- Users can browse movies from the database.
- Users can submit reviews for individual movies.
- Reviews are stored in MongoDB and fetched using RESTful APIs.
- Real-time display of reviews using the GET API on the frontend.
- Responsive design for seamless browsing across devices.

## Project Architecture
The project follows a standard Model-View-Controller (MVC) architecture:
1. **Frontend (View)**: React.js is used to build a dynamic and responsive user interface.
2. **Backend (Controller)**: Spring Boot provides a REST API to handle requests and responses between the frontend and database.
3. **Database (Model)**: MongoDB is used to store movie data and user reviews.

### Key Components
- **Movie Listing**: Users can view all available movies.
- **Review Submission**: Users can submit reviews for any movie.
- **Review Display**: Users can view all reviews for a specific movie, with reviews fetched via a GET API.

