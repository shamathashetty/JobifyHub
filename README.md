# JobifyHub

# **Job Listing Application with Spring Boot, MongoDB Atlas, Compass, and Swagger API**

This is a job listing web application built using Spring Boot and MongoDB, with MongoDB Atlas as the cloud database service. MongoDB Compass is used as the GUI tool to interact with the MongoDB database. The application also provides a Swagger API to test the API endpoints.

## **Prerequisites**

Before running the application, ensure you have the following installed:

- Java Development Kit (JDK) 8 or later
- MongoDB Compass
- MongoDB Atlas account (or any MongoDB instance running on localhost)
- Swagger API Testing tool (optional)
- Intellij

## **Getting Started**

1. Clone the repository: `git clone <repository_url>`
2. Navigate to the project directory: `cd job-listing-application`
3. Build the project: `./mvnw clean install`

## **MongoDB Configuration**

1. Sign up for a MongoDB Atlas account (or use an existing MongoDB instance running on localhost).
2. Create a new cluster and get the connection string.
3. Update the MongoDB connection settings in `application.properties` with your connection string.

## **Running the Application**

To run the application, execute the following command:

The application will start running at `http://localhost:8080`.

## **MongoDB Compass**

1. Install MongoDB Compass (if not already installed) and launch the application.
2. Connect to your MongoDB Atlas cluster using the connection string.
3. Use MongoDB Compass as a GUI tool to interact with the job listing database and collections.

## **Swagger API**

The application provides a Swagger API documentation for testing the RESTful API endpoints. To access the Swagger UI:

1. Run the application (`./mvnw spring-boot:run`).
2. Open your web browser and navigate to: `http://localhost:8080/swagger-ui.html`

Use the Swagger UI to test the different API endpoints available.

## **API Endpoints**

The application provides the following RESTful API endpoints:

- `POST /api/jobs` - Create a new job listing
- `GET /api/jobs` - Get all job listings
- `GET /api/jobs/{id}` - Get a specific job listing by ID
- `PUT /api/jobs/{id}` - Update a specific job listing by ID
- `DELETE /api/jobs/{id}` - Delete a specific job listing by ID

## **Technologies Used**

- Spring Boot
- MongoDB Atlas
- MongoDB Compass
- Swagger API

## **Contributing**

If you want to contribute to this project, please follow the guidelines in the `CONTRIBUTING.md` file.



## **Acknowledgments**

- Thanks to the Spring Boot, MongoDB, and Swagger communities for their excellent documentation and support.

Feel free to customize this README with any additional information or instructions specific to your project. Happy coding!
