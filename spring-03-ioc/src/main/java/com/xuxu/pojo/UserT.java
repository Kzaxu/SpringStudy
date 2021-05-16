package com.xuxu.pojo;

public class UserT {
    private String name;

    public UserT(){
        System.out.println("调用UserT无参构造！");
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
