# Programmatically adding beans to the Spring context

To add a bean to the Spring context using a programmatic approach, you just need to call the `registerBean()` method of the  
`ApplicationContext` instance.  
The `registerBean()` method has four parameters, as presented in the next code:

```java
<T> void registerBean(
    String beanName,
    Class<T> beanClass,
    Supplier<T> supplier,
    BeanDefinitionCustomizer... customizers
);