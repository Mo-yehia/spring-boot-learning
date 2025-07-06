package org.springContextUsingAbstractions;

import org.springContextUsingAbstractions.config.projectConfig;
import org.springContextUsingAbstractions.model.Comment;
import org.springContextUsingAbstractions.proxies.impel.EmailCommentNotificationProxy;
import org.springContextUsingAbstractions.repositories.impel.DBCommentRepository;
import org.springContextUsingAbstractions.services.commentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

//   Without using Spring context, we would need to create an instance manually like this:
//       var commentRepository = new DBCommentRepository();
//       var commentNotificationProxy = new EmailCommentNotificationProxy();
//       var commentService = new commentService(commentRepository,commentNotificationProxy);


        // Create the Spring application context using the specified configuration class.
        var context = new AnnotationConfigApplicationContext(projectConfig.class);

        // Retrieve an instance of the commentService bean from the Spring context.
        var commentService = context.getBean(commentService.class);


        // Create a new Comment object to hold the comment data.
        var comment = new Comment();
        comment.setAuthor("mohamed");
        comment.setText("the first comment!");

        // Call the service to publish the comment.
        commentService.publishComment(comment);
    }
}