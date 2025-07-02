package org.addBeansToSpringContext;

import org.addBeansToSpringContext.config.ProjectConfig;
import org.addBeansToSpringContext.myBeans.MyBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        //When creating the Spring context instance, send the configuration class as a parameter to instruct Spring to use it.
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //Gets a reference of a bean of type MyBean from the Spring context
        MyBean b = context.getBean(MyBean.class);

        b.setName("bean 1"); // if you need to give it a name

        System.out.println(b);
        System.out.println(b.getName());

    }
}