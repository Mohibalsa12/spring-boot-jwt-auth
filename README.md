<h1 align="center"> Spring Boot JWT Authentication </h1>
A complete JSON Web Token (JWT) authentication implementation built with Spring Boot 3, Spring Security, and Spring Data JPA. This project demonstrates secure user authentication with token-based authorisation.

## Features
-> User registration and login with JWT tokens

-> Spring Security configuration with stateless authentication

-> Protected endpoints requiring valid JWT tokens

-> Token revocation and logout functionality

-> H2 in-memory database for development

-> Swagger/OpenAPI documentation

-> Password encryption with BCrypt

-> Role-based access control

## Technology Stack
```bash
Java 17
Spring Boot 3.3.4
Spring Security 6
Spring Data JPA
JJWT 0.12.5 (JSON Web Token library)
H2 Database (in-memory)
Lombok (reduces boilerplate code)
Maven (build tool)
SpringDoc OpenAPI (API documentation)
```

## Project Structure
<pre>
  src/main/java/com/aditya/jwt_demo/
├── config/
│   ├── ApplicationConfig.java
│   ├── JwtAuthenticationFilter.java
│   ├── SecurityConfig.java
│   └── WebConfig.java
├── controller/
│   ├── AuthController.java
│   └── TestController.java
├── dto/
│   ├── AuthRequest.java
│   ├── AuthResponse.java
│   └── RegisterRequest.java
├── entity/
│   ├── Role.java
│   ├── Token.java
│   ├── TokenType.java
│   └── User.java
├── repository/
│   ├── TokenRepository.java
│   └── UserRepository.java
├── service/
│   ├── AuthenticationService.java
│   ├── JwtService.java
│   ├── LogoutService.java
│   └── UserService.java
└── JwtAuthApplication.java
</pre>

## API Endpoints
-> Authentication Endpoints
```bash
POST /api/v1/auth/register - Register a new user
POST /api/v1/auth/authenticate - Authenticate user and receive JWT token
POST /api/v1/auth/logout - Logout user and revoke token
```
-> Protected Endpoints
```bash
GET /api/v1/demo - Example protected endpoint (requires valid JWT)
```
## Installation and Running
1. Clone the repository:
```bash
git clone https://github.com/your-username/jwt-auth-demo.git
cd jwt-auth-demo
```
2. Build and run the application:
```bash
mvn clean spring-boot:run
```
3. The application will start on http://localhost:8080

## Access Points
```bash
Application API: http://localhost:8080
Swagger Documentation: http://localhost:8080/swagger-ui.html
H2 Database Console: http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password: password
```
## Usage Examples
-> Register a User 
```bash
curl -X POST http://localhost:8080/api/v1/auth/register \
  -H "Content-Type: application/json" \
  -d '{
    "firstname": "John",
    "lastname": "Doe",
    "email": "john@example.com",
    "password": "password123"
  }'
```
-> Authenticate and Get Token
```bash
curl -X POST http://localhost:8080/api/v1/auth/authenticate \
  -H "Content-Type: application/json" \
  -d '{
    "email": "john@example.com",
    "password": "password123"
  }'
```
-> Access Protected Endpoint
```bash
curl -X GET http://localhost:8080/api/v1/demo \
  -H "Authorization: Bearer YOUR_JWT_TOKEN_HERE"
```
-> Logout
```bash
curl -X POST http://localhost:8080/api/v1/auth/logout \
  -H "Authorization: Bearer YOUR_JWT_TOKEN_HERE"
```
-> Configuration
Key configuration in application.properties:
```bash
server.port=8080
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=password
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true
```

## Security Features
JWT tokens with 24-minute expiration

Password encryption using BCrypt

Stateless authentication (no sessions)

CSRF protection disabled for API usage

Role-based authorisation ready for extension

Token revocation on logout

Secure headers and CORS configuration

## Contributing
1. Fork the repository

2. Create a feature branch

3. Make your changes

4. Add tests if applicable

5. Submit a pull request

## By 
Aditya Mishra. 
Happy Coding </>.
