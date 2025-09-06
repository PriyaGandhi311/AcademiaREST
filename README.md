# AcademiaREST

AcademiaREST is a RESTful web service built with Java and Maven, designed to provide a backend for managing course data. It implements common CRUD (Create, Read, Update, Delete) operations via REST API endpoints.

![Bonded Context](academiaREST\src\main\resources\static\bonded-context.png)

## Features
- **OpenAPI** annotations (Swagger) for automatic API documentation
- **REST API** to manage academic data about courses, professors and students enrolled 
- CRUD operations available for managing entities.
- Built with **Spring Boot** for efficient and scalable development.
- Simple and easy to understand code structure for easy integration and extension.

## Technologies Used
- **Java 8+**
- **Spring Boot** (if applicable)
- **Maven** for project management
- **RESTful API design**

## OpenAPI / Swagger
If springdoc or Swagger UI is configured, the API docs are usually available at:
- /swagger-ui.html or /swagger-ui/index.html
- OpenAPI JSON: /v3/api-docs
- Yaml: /api-docs.yaml

## Endpoints
![Student Management](academiaREST\src\main\resources\static\student-management.png)
![Course Management](academiaREST\src\main\resources\static\course-management.png)
![Professor Management](academiaREST\src\main\resources\static\professor-management.png)

## Development notes
- Services are in-memory. Replace with repository/DB for persistence.
- IDs in sample code use numeric literals; prefer using explicit long literals (e.g., 1L).
- Use constructor injection for services (already used in some classes).


