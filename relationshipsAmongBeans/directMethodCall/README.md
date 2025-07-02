# Wiring the beans Using Direct Method Call  
### (Injecting Beans manually and calls its methods directly)

---

### What is Direct Method Call?

Instead of letting Spring inject dependencies for you, **Direct Method Call** means one bean creates or references another manually and calls its methods directly.

This is common in basic Java applications or in cases where you want **full control** over object creation and flow.

---
Pros:

Full control over object creation and lifecycle.

Doesn’t rely on Spring framework mechanisms.

Cons:

Breaks Inversion of Control (IoC) principle.

Makes testing harder (tight coupling).

Objects are not managed by Spring container.

No benefits of dependency injection (like proxying, scoping, configuration, etc.).

---

### When to Use It?

| Use Case                               | Recommended? |
|----------------------------------------|--------------|
| Learning pure Java basics              | ✅ Yes        |
| Using Spring and want DI features      | ❌ No         |
| Need full control over instantiation   | ⚠️ Maybe      |
| Writing testable, decoupled code       | ❌ No         |
