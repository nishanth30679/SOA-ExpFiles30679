# SOA User Registration Service

Spring Boot user registration service using PostgreSQL.

## Project details
- Name: SOA_user-registration
- Group: com.example.demo
- Artifact: SOA_user-registration
- Packaging: Jar
- Java: 17
- Server port: 8081

## Before running

1. Open pgAdmin.
2. Connect to PostgreSQL.
3. Create a database named:
   user_registration
4. Open:
   src/main/resources/application.properties
5. Replace:
   YOUR_POSTGRES_PASSWORD
   with your PostgreSQL password.

## Import into Spring Tools for Eclipse

File -> Import -> Maven -> Existing Maven Projects

Select the extracted SOA_user-registration folder and finish.

Then:
Right-click project -> Maven -> Update Project

Run:
SoaUserRegistrationApplication.java
-> Run As -> Spring Boot App

## Register API

POST
http://localhost:8081/users/register

Body -> raw -> JSON

{
  "username": "vaishu",
  "email": "vaishu@gmail.com",
  "password": "123456"
}

Expected response:
User registered successfully

## Login API

POST
http://localhost:8081/users/login

Body -> raw -> JSON

{
  "username": "vaishu",
  "password": "123456"
}

Expected response:
Login successful
