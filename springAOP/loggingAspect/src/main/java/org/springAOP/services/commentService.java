package org.springAOP.services;


import org.springAOP.model.comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;


@Service
public class commentService {
    private final Logger logger =
    Logger.getLogger(commentService.class.getName());

    public void publishComment(comment comment){
        logger.info("Author: " +comment.getAuthor() + " // publishing comment: " + comment.getText());
    }
}
