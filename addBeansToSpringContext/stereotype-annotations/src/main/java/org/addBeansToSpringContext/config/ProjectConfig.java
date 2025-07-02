package org.addBeansToSpringContext.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.addBeansToSpringContext.myBeans") // careful with the basePackages
public class ProjectConfig {

}