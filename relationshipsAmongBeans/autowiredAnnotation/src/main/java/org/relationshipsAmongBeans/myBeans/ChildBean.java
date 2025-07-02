package org.relationshipsAmongBeans.myBeans;

import org.springframework.stereotype.Component;

//we will inject this bean in all other parent beans
@Component
public class ChildBean {
    // We didn't use getters and setters here because they're not really needed in this case.
    // I set the value manually as a way to simplify the code.
    private String name = "child 1";


    //To display the bean data in readable way
    @Override
    public String toString(){
        return "ChildBean : " + this.name;
    }

}
