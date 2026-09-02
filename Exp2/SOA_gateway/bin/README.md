# SOA Gateway - E-Commerce API Gateway

This project implements the SOA Experiment 2 API Gateway using Spring Cloud Gateway.

## Project details
- Project Name: SOA_gateway
- Group: com.example.demo
- Artifact: SOA_gateway
- Packaging: Jar
- Java: 17
- Spring Boot: 3.5.15
- Spring Cloud: 2025.0.3
- Port: 8080

## Import into Spring Tools for Eclipse

1. Extract `SOA_gateway.zip`.
2. Open Spring Tools for Eclipse.
3. Go to **File -> Import**.
4. Select **Maven -> Existing Maven Projects**.
5. Browse to the extracted `SOA_gateway` folder.
6. Select `pom.xml`.
7. Click **Finish**.
8. Right-click the project -> **Maven -> Update Project**.
9. Right-click `SoaGatewayApplication.java`.
10. Select **Run As -> Spring Boot App**.

The console should show:
`Started SoaGatewayApplication`

## Postman tests

### Product API
GET:
http://localhost:8080/products/1

GET:
http://localhost:8080/products/2

### Cart API
GET:
http://localhost:8080/carts/1

GET:
http://localhost:8080/carts/2

### Invalid route
GET:
http://localhost:8080/orders/1

This should return a 404 because no `/orders/**` gateway route is configured.

### Health check
GET:
http://localhost:8080/actuator/health

The health endpoint should report the gateway status.

## Route mapping

/products/** -> https://dummyjson.com

/carts/** -> https://dummyjson.com
