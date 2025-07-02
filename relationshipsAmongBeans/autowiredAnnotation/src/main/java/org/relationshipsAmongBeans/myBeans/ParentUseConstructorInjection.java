package org.relationshipsAmongBeans.myBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ParentUseConstructorInjection {
    private String name = "ParentUseConstructorInjection 1";
    private final ChildBean childBean; //note! this field final Search why?

    @Autowired
    public ParentUseConstructorInjection(ChildBean childBean){
        this.childBean = childBean;
    }

    public String getName() {
        return name;
    }

    public ChildBean getChildBean() {
        return childBean;
    }
}
