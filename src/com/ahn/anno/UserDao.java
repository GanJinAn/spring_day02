package com.ahn.anno;

import org.springframework.stereotype.Component;

//��������
@Component(value = "userDao")
public class UserDao {

    public void test(){
        System.out.println("userDao====");
    }
}
