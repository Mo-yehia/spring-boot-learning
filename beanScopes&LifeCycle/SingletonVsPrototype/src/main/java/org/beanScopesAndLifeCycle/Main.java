package org.beanScopesAndLifeCycle;

import org.beanScopesAndLifeCycle.config.projectConfig;
import org.beanScopesAndLifeCycle.myBeans.myBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        var context = new AnnotationConfigApplicationContext(projectConfig.class);

        // testing the singleton scope
        var bean1 = context.getBean("mySingletonBean", myBean.class);
        var bean2 = context.getBean("mySingletonBean", myBean.class);

        boolean isEqual = bean1 == bean2;
        System.out.println(isEqual);

        System.out.println("------------------------------------------------------------");

        // testing the prototype scope
        var bean3 = context.getBean("myPrototypeBean", myBean.class);
        var bean4 = context.getBean("myPrototypeBean", myBean.class);

        boolean isEqual2 = bean3 == bean4;
        System.out.println(isEqual2);
    }
}