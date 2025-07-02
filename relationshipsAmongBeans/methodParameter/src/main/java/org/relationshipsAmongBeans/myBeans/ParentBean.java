package org.relationshipsAmongBeans.myBeans;

public class ParentBean {
    private String name;
    private ChildBean childBean;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChildBean getChildBean() {
        return childBean;
    }

    public void setChildBean(ChildBean childBean) {
        this.childBean = childBean;
    }
}