package org.relationshipsAmongBeans.config;

import org.relationshipsAmongBeans.myBeans.ChildBean;
import org.relationshipsAmongBeans.myBeans.ParentBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class projectConfig {

    @Bean
    public ChildBean childBean() {
        ChildBean child = new ChildBean();
        child.setName("child 1");
        return child;
    }

    //Wiring the beans using a direct method call between the @Bean methods
    @Bean
    public ParentBean parentBean() {
        ParentBean parent = new ParentBean();
        parent.setName("parent 1");
        parent.setChildBean(childBean()); //spring calls the childBean() method and return the bean
        return parent;
    }
}
  /*
    nice not!!!
    doesn’t this mean that we create two instances of childBean
    —one instance Spring creates and adds into its context
    and another one when the parentBean() method makes the direct call to
    the childBean() method?
    No, we actually have only one childBean instance in this application overall
    It might look strange at first, but Spring is smart enough to understand that
    by calling the childBean() method, you want to refer to the childBean in its context.
    When we use the @Bean annotation to define beans into the Spring context,
    Spring controls how the methods are called and can apply logic above the method call
    (learn more about how Spring intercepts methods).
    remember that when the parentBean() method calls the childBean() method,
    Spring will apply logic, If the childBean bean already exists in the context,
    then instead of calling the childBean() method, Spring will directly take the instance
    from its context. If the childBean does not yet exist in the context,
    Spring calls the childBean() method and returns the bean.
    it's actually easy to test this behavior.
    just add a no-args constructor to the child bean class and print a message "child bean created"
    if the behavior is correct, you'll see the message only once
   */
