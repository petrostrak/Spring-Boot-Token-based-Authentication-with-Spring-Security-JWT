Spring Boot Sample Application that supports Token based Authentication with JWT.

    -> Appropriate Flow for User Signup & User Login with JWT Authentication
    -> Spring Boot Application Architecture with Spring Security
    -> How to configure Spring Security to work with JWT
    -> How to define Data Models and association for Authentication and Authorization
    -> Way to use Spring Data JPA to interact with PostgreSQL/MySQL Database
    
React JWT Authentication example with LocalStorage, React Router, Axios and Bootstrap.

    JWT Authentication Flow for User Signup & User Login
    Project Structure for React JWT Authentication (without Redux) with LocalStorage, React Router & Axios
    Creating React Components with Form Validation
    React Components for accessing protected Resources (Authorization)
    Dynamic Navigation Bar in React App    

Calls from Postman needed
   
   //Sign up as a user
   POST http://localhost:8080/api/auth/signup
   {
    "username":"exampleName",
    "email":"exampleEmail@gmail.com",
    "password":"12345678",
    "role":["exampleName", "user"]
   }
   
   //Sign up as an admin
   POST http://localhost:8080/api/auth/signup
   {
    "username":"exampleName",
    "email":"exampleEmail@gmail.com",
    "password":"12345678",
    "role":["exampleName", "admin"]
   }   
   
   //Sign up as a moderator
   POST http://localhost:8080/api/auth/signup
   {
    "username":"exampleName",
    "email":"exampleEmail@gmail.com",
    "password":"12345678",
    "role":["exampleName", "moderator"]
   }    
   
   // Sign in
   POST http://localhost:8080/api/auth/signin
   {
    "username":"exampleName",
    "password":"12345678"
   }
