package org.relationshipsAmongBeans.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.relationshipsAmongBeans.myBeans") // careful with the basePackages
public class projectConfig {
}
