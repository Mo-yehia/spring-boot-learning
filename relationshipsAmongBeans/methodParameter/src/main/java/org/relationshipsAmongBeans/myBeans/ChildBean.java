package org.relationshipsAmongBeans.myBeans;

public class ChildBean {

private  String name;


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