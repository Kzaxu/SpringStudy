package com.xuxu.demo03;

import com.xuxu.demo01.UserService;
import com.xuxu.demo01.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        UserServiceImpl userService = new UserServiceImpl();

        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);

        UserService proxy = (UserService) pih.getProxy();
        proxy.add();

    }
}
