# SOA Banking API

Token-Based Authentication for Banking API using Spring Boot, Spring Security and JWT.

Import: File -> Import -> Maven -> Existing Maven Projects -> select this folder -> Finish.
Then Maven -> Update Project and run SoaBankingApiApplication.java as Spring Boot App.

POST http://localhost:8082/login
Body -> raw -> JSON:
{"username":"admin","password":"admin123"}

Copy the token from the response.

GET http://localhost:8082/account/details
Header: Authorization: Bearer <JWT_TOKEN>

Expected: Account Details for admin: Balance = ₹50,000
