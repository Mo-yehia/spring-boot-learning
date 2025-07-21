# Spring AOP Logging Aspect Demo

This project demonstrates how to use **Spring AOP (Aspect-Oriented Programming)** to log method execution behavior in a Spring application using `@Before`, `@After`, and `@Around` advices.

---

## What This Project Does

- A simple `commentService` publishes a comment.
- An `Aspect` called `loggingAspect` intercepts the service method and logs:
    - Before the method is called.
    - After the method is called.
    - Around the method (both before and after execution).

---


## Explanation of Components

### `comment.java`
A simple model class with two fields: `author` and `text`.

### `commentService.java`
A Spring `@Service` that simulates publishing a comment and logs its author and text.

### `loggingAspect.java`
An `@Aspect` class with the following advices:
- `@Before` — Logs before the service method executes.
- `@After` — Logs after the method finishes.
- `@Around` — Logs both before and after, and can also control method execution.

### `projectConfig.java`
Spring configuration class enabling component scanning and AOP with:
```java
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "org.springAOP")
