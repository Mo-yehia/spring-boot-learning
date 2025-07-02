package org.addBeansToSpringContext.config;

import org.addBeansToSpringContext.myBeans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
        //@Primary    the primary bean is simply Spring’s default choice
        // Of course, you can only define one bean of a type as primary.
    MyBean myBean1(){
        MyBean b = new MyBean();
        b.setName("bean 1");
        return b;
    }

    //Adding multiple beans of the same type to the Spring context
    @Bean
    MyBean myBean2(){
        MyBean b = new MyBean();
        b.setName("bean 2");
        return b;
    }
    @Bean
    MyBean myBean3(){
        MyBean b = new MyBean();
        b.setName("bean 3");
        return b;
    }

    //Adding two more beans to the context
    //add a string
    @Bean
    String Hello(){
        return "Hello from the Spring context";
    }

    //add an integer
    @Bean
    Integer Ten(){
        return 10;
    }

}