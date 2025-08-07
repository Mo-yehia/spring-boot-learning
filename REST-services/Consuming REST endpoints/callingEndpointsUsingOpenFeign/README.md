# callingEndpointsUsingOpenFeign

This Spring Boot microservice demonstrates how to call an external **Payment Service** using **OpenFeign**.  
It sends a `POST` request to the `/payment` endpoint of the [payment service](https://github.com/Mo-yehia/spring-boot-learning/tree/main/REST-services/implementation/PaymentService), including a unique `requestId` in the headers for tracing.

---

## Project Summary

- **Application Name:** `callingEndpointsUsingOpenFeign`
- **Port:** `8081`
- **Technology Used:** Spring Boot + Spring Cloud OpenFeign
- **Target Service:** [Payment Service](https://github.com/Mo-yehia/spring-boot-learning/tree/main/REST-services/implementation/PaymentService)

---

## Features

- Uses `OpenFeign` client (`PaymentsProxy`) to send a POST request to the Payment API.
- Automatically generates a unique `requestId` for each request.
- Simple controller with a single endpoint:  
  `POST /payment`

---

## Sample Request

**URL:** `http://localhost:8081/payment`  
**Method:** `POST`  
**Headers:** `Content-Type: application/json`  
**Body:**

```json
{
  "amount": 500.0
}
```

### Expected behavior:
The service will forward this data to the Payment Service at http://localhost:8080/payment, adding a generated requestId in the headers.

### Configuration 
`application.properties`
```properties
spring.application.name=callingEndpointsUsingOpenFeign
server.port=8081
payment.service.url=http://localhost:8080
```
---
## Notes
- OpenFeign automatically handles serialization, HTTP calls, and header passing.
- The use of requestId is a good practice for tracing and logging across services.
