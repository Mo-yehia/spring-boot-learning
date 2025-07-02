# How to Add new Beans to the Spring Context using the @Bean annotation

- To start, we create an object instance and the empty Spring context

- Adding the dependency for Spring context:

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>6.2.2</version>
    </dependency>
</dependencies>
```

- Creating the instance of the Spring context:

```java
var context = new AnnotationConfigApplicationContext();
```

- Define a configuration class (annotated with `@Configuration`) for your project
- Add a method to the configuration class that returns the object instance you want to add to the context and annotate the method with the `@Bean` annotation
- Make Spring use the configuration class defined:

```java
var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
```

- Referring to the instance from the context:

```java
MyBean b = context.getBean(MyBean.class);
```

- Printing the new bean in the console:

```java
System.out.println(b.getName());
```