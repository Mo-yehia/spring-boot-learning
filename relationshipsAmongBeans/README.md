# Bean Relationships in Spring

This module (`relationshipsAmongBeans`) demonstrates **three common ways to establish relationships between beans** in a Spring application. Each subfolder contains a self-contained example of a different method used to wire beans together.

---

## Structure Overview

| Folder Name             | Description                                                                 |
|-------------------------|-----------------------------------------------------------------------------|
| `autowiredAnnotation`   | Demonstrates how to use the `@Autowired` annotation to inject dependencies automatically. Includes field, constructor, and setter injection examples. |
| `directMethodCall`      | Shows how one bean directly creates and calls another bean manually, without relying on Spring’s dependency injection. |
| `methodParameter`       | Demonstrates how Spring wires beans by using method parameters in a `@Configuration` class. This is known as Java-based configuration with `@Bean` methods. |

---

## Goal

Help you understand different techniques to manage and inject dependencies between Spring beans. Each folder contains focused code examples and configuration to illustrate the pros, cons, and proper use cases for each approach.

---

## How to Explore

Open each subfolder to:
- Read its dedicated `README.md`.
- Explore the code.
- See how bean relationships are defined and managed using that specific technique.

---

## ✅ Recommendation

- Use **constructor injection** (under `autowiredAnnotation`) as the default approach.
- Use **method parameters** (under `methodParameter`) if you prefer Java config without component scanning.
- Avoid **direct method calls** in Spring apps unless you need full manual control.

---
