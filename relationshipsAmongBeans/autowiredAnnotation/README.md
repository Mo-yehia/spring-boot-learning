# Wiring the beans using the @Autowired annotation  
### (Injecting Beans with `@Autowired`)
This directory demonstrates different ways to inject dependencies between Spring beans using the `@Autowired` annotation
Dependency Injection (DI) allows Spring to automatically manage and wire beans at runtime.

You will find examples of the main techniques used for dependency injection with `@Autowired`.

Take a look at the `myBeans` package and the parent classes to explore how the beans are defined and how dependency injection is applied across different components.

---

##  1. Field Injection
Pros:

Simple and concise.

No need to write constructors or setters.

Cons:

Makes unit testing harder (reflection needed to inject mocks).

Violates immutability principles.

Not recommended for large or test-heavy applications.

## 2. Constructor Injection
Pros:

Preferred by Spring, especially for required dependencies.

Promotes immutability and easier unit testing.


Cons:

Requires more code than field injection

## 3. Setter Injection
Pros:

Useful for optional dependencies.

Allows for changing the dependency after object creation.

Cons:

Slightly more code.

Still less preferred than constructor injection for required dependencies.

## Best Practice
Use constructor injection as the default approach, especially for mandatory dependencies. Use setter injection when the dependency is optional, and avoid field injection unless simplicity is a higher priority than testability.


## Summary

Below is a comparison of the different ways to inject beans using `@Autowired` in Spring.


| Injection Type         | Recommended For             | Testability | Immutability | Simplicity     |
|------------------------|-----------------------------|-------------|--------------|----------------|
| Field Injection        | Quick demos or simple apps  | ❌ Hard      | ❌ No         | ✅ Simple       |
| Constructor Injection  | Most cases (preferred)      | ✅ Easy      | ✅ Yes        | ⚠️ Moderate     |
| Setter Injection       | Optional dependencies       | ⚠️ Moderate  | ❌ No         | ⚠️ Moderate     |
