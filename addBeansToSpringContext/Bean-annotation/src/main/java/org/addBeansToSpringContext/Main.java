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
        //which is the instance you want to use!.
        //here we choose myBean1, and you can use @Primary in config class to select default bean if you need
        MyBean b = context.getBean("myBean1", MyBean.class);
        System.out.println(b.getName());

        //Getting and printing the other beans in the console
        // here we don't specify a bean because there is only one bean of this type
        String s = context.getBean(String.class);
        System.out.println(s);

        Integer n = context.getBean(Integer.class);
        System.out.println(n);

    }
}