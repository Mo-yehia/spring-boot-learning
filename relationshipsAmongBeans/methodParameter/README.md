# Wiring the beans using method's parameters   
### (Injecting Beans by passing them as parameters to `@Bean` methods.)
## What is It?

Instead of using annotations like `@Autowired`, Spring can inject beans by calling `@Bean` methods and automatically resolving their dependencies via **method parameters**.

---

This example demonstrates how to wire beans manually in a Java configuration class by passing them as parameters to `@Bean` methods. 

This approach is used in **Java-based Spring configuration** and allows Spring to **resolve and inject dependencies** based on method parameters.

---

Pros:

Clear and explicit wiring between beans.

Full control over the creation logic.

No need for @Autowired.

Great for unit testing and manual bean setup.

Cons:

Slightly more verbose than annotation-based wiring.

Can be harder to manage in very large configurations.

## When to Use It?

| Use Case                                         | Recommended? |
|--------------------------------------------------|--------------|
| Pure Java configuration (no XML or component scan) | ✅ Yes      |
| Small to medium-sized applications               | ✅ Yes        |
| Very large applications with deep hierarchies    | ⚠️ Maybe      |
| Mixing with `@Component` and `@Autowired`        | ⚠️ Possible   |
