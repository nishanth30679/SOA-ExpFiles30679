# SOA Restaurant Service

Spring Boot REST service for the Food Delivery SOA experiment.

## Project settings
- Group: `com.fooddelivery`
- Artifact: `SOA_restaurant-service`
- Packaging: Jar
- Java: 21
- Port: 8081

## Run in Spring Tool Suite
1. Extract this ZIP.
2. In STS: **File > Import > Maven > Existing Maven Projects**.
3. Select the extracted project folder.
4. Finish the import.
5. Right-click `SoaRestaurantSerivceApplication.java`.
6. Select **Run As > Spring Boot App**.

## Postman endpoints

### POST
`http://localhost:8081/restaurants`

Body:
```json
{
  "name": "Food Palace",
  "address": "Main Road",
  "phone": "9876543210"
}
```

### GET all
`http://localhost:8081/restaurants`

### GET by ID
`http://localhost:8081/restaurants/1`

### PUT
`http://localhost:8081/restaurants/1`

Body:
```json
{
  "name": "Food Palace Restaurant",
  "address": "Kukatpally Main Road",
  "phone": "9999999999"
}
```

### DELETE
`http://localhost:8081/restaurants/1`

H2 console:
`http://localhost:8081/h2-console`

JDBC URL:
`jdbc:h2:mem:restaurantdb`
