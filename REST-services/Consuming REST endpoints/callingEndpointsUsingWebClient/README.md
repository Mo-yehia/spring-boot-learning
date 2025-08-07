# Calling Endpoints Using WebClient

This is a Spring Boot application that acts as a client/gateway to another microservice (PaymentService) using Spring's reactive `WebClient`. It receives payment requests, generates a unique request ID, and forwards the request to the actual payment processing service.

---
## Project Overview

- Exposes a `/payment` endpoint to accept payment data.
- Uses `WebClient` to forward requests to a backend payment service (`PaymentService`).
- Adds a unique `requestId` header for each request.
- Waits for a reactive response (`Mono<Payment>`) and returns it to the original caller.

---

## Technologies Used

- Spring WebFlux
- WebClient

---

## Configuration

Edit the `application.properties` file to set the external service URL and server port:

```properties
spring.application.name=callingEndpointsUsingWebClient
server.port=8083
payment.service.url=http://localhost:8080
```

## API Endpoint
### POST /payment
Request Body Example:

```json
{
  "amount": 250.0
}
```

### Behavior:

- A random UUID is generated as requestId
- The request is forwarded to PaymentService on http://localhost:8080/payment
- The response from PaymentService is returned to the caller

### Example Flow
- Send a POST request to: `http://localhost:8083/payment`

- The request will be forwarded to: `http://localhost:8080/payment`
If amount ≤ 1000.0 → ✅ accepted, returns:

```json
{
  "id": "generated-id",
  "amount": 250.0
}
```
- If amount > 1000.0 →  rejected, returns:

```json
{
  "message": "Not enough money to make the payment."
}
```

---
### Related Project
This application works together with:

[PaymentService](https://github.com/Mo-yehia/spring-boot-learning/tree/main/REST-services/implementation/PaymentService) — the backend service that actually processes payments.

---
## Notes
- This project demonstrates how to use WebClient for microservice communication.
- WebClient is non-blocking and reactive, suitable for high-concurrency systems.
- The example is simplified and meant for educational/demo purposes.
