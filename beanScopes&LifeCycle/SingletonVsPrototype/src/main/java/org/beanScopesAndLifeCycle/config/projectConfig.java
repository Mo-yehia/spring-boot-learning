package org.beanScopesAndLifeCycle.config;

import org.beanScopesAndLifeCycle.myBeans.myBean;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class projectConfig {
    @Bean
    @Scope(BeanDefinition.SCOPE_SINGLETON) // == @Scope("singleton")
    myBean mySingletonBean(){  // the name of the method becomes the bean's name
        return new myBean();   // "myBean" this is the bean type in the spring context
    }

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE) // == @Scope("prototype")
    myBean myPrototypeBean(){  // the name of the method becomes the bean's name
        return new myBean();   // "myBean" this is the bean type in the spring context
    }
}