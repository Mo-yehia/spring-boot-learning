package org.relationshipsAmongBeans.myBeans;

public class ChildBean {
    private  String name;

    //check the note in projectConfig class to know why we use this constructor!!
    public ChildBean(){
        System.out.println("Child Bean cerated !");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //To display the bean data in readable way
    @Override
    public String toString(){
        return "ChildBean : " + name;
    }
}
