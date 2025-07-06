package org.springContextUsingAbstractions.proxies;

import org.springContextUsingAbstractions.model.Comment;

//This interface defines an abstraction layer to separate implementation details from the code that uses it.
// We only specify *what* needs to happen,
// while each class implementing this interface defines *how* it should happen.
public interface commentNotificationProxy {
    void sendNotification(Comment comment);
}
