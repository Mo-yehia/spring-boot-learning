# CallingEndpointsUsingRestTemplate

This Spring Boot application demonstrates how to call external REST endpoints using the classic synchronous `RestTemplate`. It acts as a simple client service that forwards payment requests to an external service [PaymentService](https://github.com/Mo-yehia/spring-boot-learning/tree/main/REST-services/implementation/PaymentService).

---

## Project Overview

- Exposes a `/payment` endpoint to receive payment requests.
- Uses `RestTemplate` to forward the request to [PaymentService](https://github.com/Mo-yehia/spring-boot-learning/tree/main/REST-services/implementation/PaymentService).
- Adds a unique `requestId` header.
- Returns the response from [PaymentService](https://github.com/Mo-yehia/spring-boot-learning/tree/main/REST-services/implementation/PaymentService) directly to the caller.

---

## Configuration

`application.properties`:

```properties
spring.application.name=callingEndpointsUsingRestTemplate
server.port=8082
payment.service.url=http://localhost:8080
```
---
## API Endpoint
### POST `/payment`
Request Body:
```json
{
  "amount": 250.0
}
```

Behavior:

- requestId header is automatically generated and sent.
- The request is forwarded to the external service: http://localhost:8080/payment.
- The response from PaymentService is returned.

---
### Example Scenario
- Send POST to http://localhost:8082/payment
- It forwards the request to http://localhost:8080/payment
- If amount ≤ 1000 → returns id and amount
- If amount > 1000 → returns error:
```json
{
  "message": "Not enough money to make the payment."
}
```
---
### Related Projects
This application is meant to work with:

- [PaymentService](https://github.com/Mo-yehia/spring-boot-learning/tree/main/REST-services/implementation/PaymentService)

- [CallingEndpointsUsingWebClient](https://github.com/Mo-yehia/spring-boot-learning/tree/main/REST-services/Consuming%20REST%20endpoints/callingEndpointsUsingWebClient) — same concept but uses non-blocking WebClient

