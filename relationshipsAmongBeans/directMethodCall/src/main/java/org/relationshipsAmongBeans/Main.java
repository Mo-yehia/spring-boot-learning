package org.relationshipsAmongBeans;


import org.relationshipsAmongBeans.config.projectConfig;
import org.relationshipsAmongBeans.myBeans.ParentBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //Remember! in this example we used the @Bean annotation way to registering beans in the Spring context
        System.out.println("Hello and welcome!");
        var context = new AnnotationConfigApplicationContext(projectConfig.class);

        //Gets a reference of a bean of type ParentBean from the Spring context
        ParentBean p = context.getBean(ParentBean.class);

        //printing bean data to see the relation between child bean & parent bean
        System.out.println("Parent name : " + p.getName());
        System.out.println("Parent child : " + p.getChildBean());
    }

}