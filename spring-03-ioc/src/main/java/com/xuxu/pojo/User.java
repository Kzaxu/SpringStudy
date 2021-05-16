package com.xuxu.pojo;

public class User {
    private String name;

//    User(){
//        System.out.println("调用无参构造！");
//    }

    public User(String name) {
        this.name = name;
    }

    public void setName(String x) {
        this.name = x;
    }

    public String getName() {
        return this.name;
    }

    public void show() {
        System.out.println("name=" + this.name);
    }
}
