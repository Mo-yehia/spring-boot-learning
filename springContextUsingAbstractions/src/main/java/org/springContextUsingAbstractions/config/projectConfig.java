package org.springContextUsingAbstractions.config;

import org.springContextUsingAbstractions.proxies.commentNotificationProxy;
import org.springContextUsingAbstractions.proxies.impel.commentPushNotificationProxy;
import org.springContextUsingAbstractions.repositories.commentRepository;
import org.springContextUsingAbstractions.repositories.impel.DBCommentRepository;
import org.springContextUsingAbstractions.services.commentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.springContextUsingAbstractions")
public class projectConfig {


// Another way to define beans without using stereotype annotations
// is by declaring them manually in a @Configuration class using the @Bean annotation.

//    @Bean
//    public commentRepository commentRepsitory(){
//
//        return new DBCommentRepository();
//    }
//
//    @Bean
//    public commentNotificationProxy commentNotificationProxy(){
//
//        return new commentPushNotificationProxy();
//    }
//
//    @Bean
//    public commentService commentService(
//            commentRepository commentRepsitory,
//            commentNotificationProxy commentNotificationProxy){
//
//        return new commentService(commentRepsitory,commentNotificationProxy);
//    }



}