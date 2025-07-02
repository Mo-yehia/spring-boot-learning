package org.relationshipsAmongBeans.myBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ParentUseFieldInjection {
    private String name = "ParentUseFieldInjection 1";
    @Autowired
    private ChildBean childBean;  //note! you can't make this field final in this approach, try it and see the result!

    public String getName() {
        return name;
    }

    public ChildBean getChildBean() {
        return childBean;
    }
}
