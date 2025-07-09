# Eager Vs Lazy instantiation

This is a simple Spring project to demonstrate:

- The difference between **Eager** and **Lazy** beans in Spring.
- How bean instantiation works based on configuration.
- How to track the creation of beans in the console.

# Eager vs Lazy Instantiation

This simple Spring project demonstrates the difference between **Eager** and **Lazy** bean instantiation using Spring's `@Bean` and `@Lazy` annotations.

---

## What This Project Shows

- **Eager Bean** ➔ Instantiated immediately when the Spring application context is initialized.
- **Lazy Bean** ➔ Instantiated **only when explicitly requested** from the application context.

---

## How It Works

- The project defines two beans inside the `projectConfig` class:

```java
@Bean
myBean myEagerBean() {
    return new myBean("Eager");
}

@Bean
@Lazy
myBean myLazyBean() {
    return new myBean("Lazy");
}
```
In the Main class:

The eager bean is created automatically when the context is loaded.
The lazy bean is only created when this line runs:

```java
var bean1 = context.getBean("myLazyBean", myBean.class);
```
You can toggle lazy bean creation using:

```java
boolean getLazyBean = true; // or false
```

## Key Differences

| Aspect                | Eager Instantiation                                | Lazy Instantiation                               |
|-----------------------|----------------------------------------------------|--------------------------------------------------|
| **Creation Time**      | At context startup                                 | When explicitly requested (first access)         |
| **Annotation**         | `@Bean`                                            | `@Bean @Lazy`                                    |
| **Performance Impact** | May increase startup time if many beans are eager  | Reduces startup time for rarely used beans       |
