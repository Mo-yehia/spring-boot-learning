package org.relationshipsAmongBeans;


import org.relationshipsAmongBeans.config.projectConfig;
import org.relationshipsAmongBeans.myBeans.ParentUseConstructorInjection;
import org.relationshipsAmongBeans.myBeans.ParentUseFieldInjection;
import org.relationshipsAmongBeans.myBeans.ParentUseSetterInjection;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
       System.out.println("Hello and welcome!");

        //Remember! in this example we used the stereotype annotations way to registering beans in the Spring context
        var context = new AnnotationConfigApplicationContext(projectConfig.class);

        //Gets a reference of beans from the Spring context
        ParentUseFieldInjection p = context.getBean(ParentUseFieldInjection.class);
        ParentUseConstructorInjection p2 = context.getBean(ParentUseConstructorInjection.class);
        ParentUseSetterInjection p3 = context.getBean(ParentUseSetterInjection.class);


        //printing beans data to see the relation between child bean & parent beans
        System.out.println("Parent name : " + p.getName());
        System.out.println("Parent child : " + p.getChildBean());
        System.out.println("-----------------------------------------------");

        System.out.println("Parent name : " + p2.getName());
        System.out.println("Parent child : " + p2.getChildBean());
        System.out.println("-----------------------------------------------");

        System.out.println("Parent name : " + p3.getName());
        System.out.println("Parent child : " + p3.getChildBean());

    }
}