package com.ahn.anno;

import org.springframework.stereotype.Component;

//创建对象
@Component(value = "userDao")
public class UserDao {

    public void test(){
        System.out.println("userDao====");
    }
}
