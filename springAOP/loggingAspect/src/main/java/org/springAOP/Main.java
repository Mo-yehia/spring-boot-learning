package org.springAOP;

import org.springAOP.config.projectConfig;
import org.springAOP.model.comment;
import org.springAOP.services.commentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        var context = new AnnotationConfigApplicationContext(projectConfig.class);

        comment c = new comment("mohamed","this is my first comment!");

        var service = context.getBean(commentService.class);
        System.out.println("Notice the bean type of the commentService.");
        System.out.println(service.getClass());

        System.out.println("Notice the execution order of the advices.");
        service.publishComment(c);

    }
}