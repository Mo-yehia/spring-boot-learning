package org.springContextUsingAbstractions.services;

import org.springContextUsingAbstractions.model.Comment;
import org.springContextUsingAbstractions.proxies.commentNotificationProxy;
import org.springContextUsingAbstractions.repositories.commentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// This class holds its dependencies without being concerned about their specific implementations.
// Spring is responsible for providing the actual instances through dependency injection.
@Component
public class commentService {
    private final commentRepository commentRepository;
    private final commentNotificationProxy commentNotificationProxy;

    @Autowired //the @Autowired annotation is optional because we have only one constructor in the class
    public commentService(commentRepository commentRepository,
    /*@Qualifier to specify the bean*/ @Qualifier("PUSH") commentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendNotification(comment);
    }
}
