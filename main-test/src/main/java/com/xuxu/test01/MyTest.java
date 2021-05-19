package com.xuxu.test01;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyTest {

    @Test
    public void test01() throws Exception {
        Class clazz = this.getClass().getClassLoader().loadClass("com.xuxu.test01.Person");
        Method method = clazz.getMethod("speak");

        Person person = new Person("Tom", 18);
        method.invoke(person);
        Method[] methods = clazz.getMethods();
        String typeName = clazz.getName();
        System.out.println(typeName);
        for (Method m:methods) {
            System.out.println(m.getName());
        }
    }
}
