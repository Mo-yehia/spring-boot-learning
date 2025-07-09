package org.beanScopesAndLifeCycle.config;

import org.beanScopesAndLifeCycle.myBeans.myBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class projectConfig {
    @Bean
    myBean myEagerBean(){  // the name of the method becomes the bean's name in the spring context
        return new myBean("Eager");   // "myBean" this is the bean type in the spring context
        // This bean will be created eagerly when the application context is initialized
    }

    @Bean
    @Lazy
    myBean myLazyBean(){  // the name of the method becomes the bean's name in the spring context
        return new myBean("Lazy");   // "myBean" this is the bean type in the spring context
        // This bean will be created lazily — it won't be instantiated until it is first requested
    }
}