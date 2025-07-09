package org.beanScopesAndLifeCycle;

import org.beanScopesAndLifeCycle.config.projectConfig;
import org.beanScopesAndLifeCycle.myBeans.myBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        var context = new AnnotationConfigApplicationContext(projectConfig.class);

        // To test the eager bean: simply run the application.
        // The eager bean will be instantiated automatically when the context is initialized.
        // No need to explicitly retrieve it from the context.


        // testing the lazy instantiation
        boolean getLazyBean = false; //Change this boolean to true to see the difference.
        if(getLazyBean){
            // The lazy bean will only be instantiated when we explicitly request it from the context.
            var bean1 = context.getBean("myLazyBean", myBean.class);
        }

    }
}