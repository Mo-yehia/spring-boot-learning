package org.addBeansToSpringContext;

import org.addBeansToSpringContext.config.projectConfig;
import org.addBeansToSpringContext.myBeans.MyBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
            System.out.println("Hello and welcome!");
            //When creating the Spring context instance, send the configuration class as a parameter to instruct Spring to use it.
            var context = new AnnotationConfigApplicationContext(projectConfig.class);

            MyBean b = new MyBean();
            b.setName("bean 1"); // if you need to give it a name

            //adding beans
            //by registerBean() method you can add beans as you like based on your business logic
            context.registerBean("MyBean 1", MyBean.class);

            System.out.println(b);
            System.out.println(b.getName());

        }
}