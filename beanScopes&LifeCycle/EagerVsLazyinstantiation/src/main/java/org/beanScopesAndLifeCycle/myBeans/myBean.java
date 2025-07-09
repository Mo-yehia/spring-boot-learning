package org.beanScopesAndLifeCycle.myBeans;

public class myBean {

    private final String name;

    // This constructor sets the bean's name and prints a message indicating which bean has been created.
    public myBean(String name) {
        this.name = name;
        System.out.println("my " + name + " bean is created!");
    }

}
