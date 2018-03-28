package com.ahn.anno;

import org.springframework.stereotype.Component;

//使用注解创建对象
@Component(value = "user")//相当于<bean id="user" class=""></bean>
public class User {

    public void add(){
        System.out.println("User:add===");
    }

}
