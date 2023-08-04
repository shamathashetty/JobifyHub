# JobifyHub



Job Listing Application with Spring Boot, MongoDB Atlas, Compass, and Swagger API
This is a job listing web application built using Spring Boot and MongoDB, with MongoDB Atlas as the cloud database service. MongoDB Compass is used as the GUI tool to interact with the MongoDB database. The application also provides a Swagger API to test the API endpoints.

Prerequisites
Before running the application, ensure you have the following installed:

Java Development Kit (JDK) 8 or later
MongoDB Compass
MongoDB Atlas account (or any MongoDB instance running on localhost)
Swagger API Testing tool (optional)
Getting Started
Clone the repository: git clone <repository_url>
Navigate to the project directory: cd job-listing-application
Build the project: ./mvnw clean install
MongoDB Configuration
Sign up for a MongoDB Atlas account (or use an existing MongoDB instance running on localhost).
Create a new cluster and get the connection string.
Update the MongoDB connection settings in application.properties with your connection string.
Running the Application
To run the application, execute the following command:

arduino
Copy code
./mvnw spring-boot:run
The application will start running at http://localhost:8080.

MongoDB Compass
Install MongoDB Compass (if not already installed) and launch the application.
Connect to your MongoDB Atlas cluster using the connection string.
Use MongoDB Compass as a GUI tool to interact with the job listing database and collections.
Swagger API
The application provides a Swagger API documentation for testing the RESTful API endpoints. To access the Swagger UI:

Run the application (./mvnw spring-boot:run).
Open your web browser and navigate to: http://localhost:8080/swagger-ui.html
Use the Swagger UI to test the different API endpoints available.

API Endpoints
The application provides the following RESTful API endpoints:

POST /api/jobs - Create a new job listing
GET /api/jobs - Get all job listings
GET /api/jobs/{id} - Get a specific job listing by ID
PUT /api/jobs/{id} - Update a specific job listing by ID
DELETE /api/jobs/{id} - Delete a specific job listing by ID
Technologies Used
Spring Boot
MongoDB Atlas
MongoDB Compass
Swagger API
Contributing
If you want to contribute to this project, please follow the guidelines in the CONTRIBUTING.md file.

License
This project is licensed under the MIT License.

Acknowledgments
Thanks to the Spring Boot, MongoDB, and Swagger communities for their excellent documentation and support.
Feel free to customize this README with any additional information or instructions specific to your project. Happy coding!
