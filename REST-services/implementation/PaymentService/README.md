# Payment Service

This is a Spring Boot microservice that simulates a simple payment processing system. It accepts payment requests, validates them, and returns a response with a generated payment ID.

## Overview

- Accepts payment requests via `/payment` endpoint.
- Validates payment amount.
- Simulates account balance check.
- Returns a unique ID for each processed payment.
- Handles errors gracefully (e.g., insufficient funds).


Service will be running at: http://localhost:8080

## Endpoint
### POST `/payment`

Request Headers:

- requestId: A unique identifier (sent by caller service)

Request Body:
``` json
{
  "amount": 500.0
}
```

### Responses:

✅ 202 Accepted: If payment is processed successfully, returns a generated id.

❌ 400 Bad Request: If amount > the account balance (in this case 1000.0), returns:

``` json
{
  "message": "Not enough money to make the payment."
}
```

### Notes
This is a demo service with static balance check (1000.0) — no real account system.

Designed to be called by another services.

