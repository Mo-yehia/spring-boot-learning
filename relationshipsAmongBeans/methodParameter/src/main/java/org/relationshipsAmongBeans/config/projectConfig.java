package org.relationshipsAmongBeans.config;

import org.relationshipsAmongBeans.myBeans.ChildBean;
import org.relationshipsAmongBeans.myBeans.ParentBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class projectConfig {
    @Bean
    public ChildBean childBean() {
        ChildBean child = new ChildBean();
        child.setName("child 1");
        return child;
    }

    //Wiring the beans using the @Bean annotated method's parameters
    @Bean
    public ParentBean parentBean(ChildBean childBean) { //we instruct spring to provide a bean from its context by defining a parameter for the method
        ParentBean parent = new ParentBean();
        parent.setName("parent 1");
        parent.setChildBean(childBean); //we set the value of the parent attribute with the reference spring provided
        return parent;
    }
}
