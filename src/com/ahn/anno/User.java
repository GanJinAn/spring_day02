package com.ahn.anno;

import org.springframework.stereotype.Component;

//ʹ��ע�ⴴ������
@Component(value = "user")//�൱��<bean id="user" class=""></bean>
public class User {

    public void add(){
        System.out.println("User:add===");
    }

}
