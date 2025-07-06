package org.springContextUsingAbstractions.proxies.impel;

import org.springContextUsingAbstractions.model.Comment;
import org.springContextUsingAbstractions.proxies.commentNotificationProxy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// When the Spring context has more beans created with multiple implementations of the same abstraction,
// to instruct Spring which bean to inject, you can
//— use the @Primary annotation to mark one of them as default, or
//— use the @Qua1ifier annotation to name the bean and then instruct Spring to inject that bean by name.

@Component
@Qualifier("PUSH")
public class commentPushNotificationProxy implements commentNotificationProxy {
    @Override
    public void sendNotification(Comment comment) {
        System.out.println("sending push notification for comment :" + comment.getText());
    }
}
