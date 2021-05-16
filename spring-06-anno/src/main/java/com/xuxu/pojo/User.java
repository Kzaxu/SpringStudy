package com.xuxu.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 等价于 <bean id="user" class="com.xuxu.pojo.User"/>
@Component
@Scope("prototype")
public class User {

    // 等价于<property name="name" value="Jerry"/>
    @Value("Jerry")
    public String name = "Tom";
}
