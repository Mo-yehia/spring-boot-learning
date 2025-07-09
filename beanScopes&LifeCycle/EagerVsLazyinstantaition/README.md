# Singleton Vs Prototype

This project demonstrates the difference between **Singleton Scope** and **Prototype Scope** in managing Beans within the Spring container.

How Spring behaves when defining Beans with different scopes?

1. **Singleton Scope** (default):
    - Spring creates only one instance of the Bean and shares it every time the Bean is requested.

2. **Prototype Scope:**
    - Spring creates a new instance of the Bean every time the Bean is requested.

# Singleton vs Prototype in Spring

| Feature               | Singleton Scope                                                | Prototype Scope                                             |
|-----------------------|----------------------------------------------------------------|-------------------------------------------------------------|
| **Definition**        | Only one instance of the Bean is created and shared across the entire Spring container. | A new instance of the Bean is created every time it is requested. |
| **Default Scope?**    | Yes (singleton is the default in Spring)                       | No                                                          |
| **Bean Lifecycle**    | Created at the time of context initialization (eager by default) | Created each time the Bean is requested                     |
| **Memory Usage**      | Lower (one instance)                                            | Higher (multiple instances)                                 |
| **Example Usage**     | Shared resources (e.g., service classes)                        | Non-shared, stateful objects                                 |
| **Annotation**        | `@Scope("singleton")` *(or no scope specified)*                | `@Scope("prototype")`                                        |
| **Instance Equality** | Always the same instance (`bean1 == bean2` ➔ `true`)            | Different instances (`bean1 == bean2` ➔ `false`)             |
| **Managed By Spring?**| Spring manages full lifecycle (creation & destruction)          | Spring only manages creation, not destruction                |

---

This table summarizes the key differences between **Singleton** and **Prototype** bean scopes in **Spring Framework**.

For more details, check out:
- [Spring Bean Scopes Documentation](https://docs.spring.io/spring-framework/reference/core/beans/factory-scopes.html)
- [Baeldung: Spring Bean Scopes](https://www.baeldung.com/spring-bean-scopes)
