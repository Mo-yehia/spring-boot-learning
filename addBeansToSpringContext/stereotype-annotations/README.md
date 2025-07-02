# How to Add new Beans to the Spring Context using stereotype annotations
The steps we need to follow in the process are as follows:

1. Using the `@Component` annotation, mark the classes for which you want Spring to add an instance to its context (in our case `MyBean`).

2. Using `@ComponentScan` annotation over the configuration class, instruct Spring on where to find the classes you marked.
