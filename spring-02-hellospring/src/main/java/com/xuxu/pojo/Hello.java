package com.xuxu.pojo;

public class Hello {
    public String name;

    public void setName(String x) {
        this.name = x;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString(){
        return "Hello " + this.name;
    }
}
