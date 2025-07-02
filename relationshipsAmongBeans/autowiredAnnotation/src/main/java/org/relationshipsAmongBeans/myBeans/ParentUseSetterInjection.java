package org.relationshipsAmongBeans.myBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ParentUseSetterInjection {
    private String name = "ParentUseSetterInjection 1";
    private ChildBean childBean;  //note! you can't make this field final in this approach, try it and see the result!

    @Autowired
    public void setChildBean(ChildBean childBean) {
        this.childBean = childBean;
    }


    public String getName() {
        return name;
    }

    public ChildBean getChildBean() {
        return childBean;
    }
}
