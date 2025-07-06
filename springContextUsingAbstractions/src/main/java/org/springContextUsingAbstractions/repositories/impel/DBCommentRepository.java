package org.springContextUsingAbstractions.repositories.impel;

import org.springContextUsingAbstractions.model.Comment;
import org.springContextUsingAbstractions.repositories.commentRepository;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements commentRepository {
    @Override
    public void storeComment(Comment comment) {
        //this just a simulation for a connection with database
        System.out.println("storing comment : " + comment.getText());
    }
}
