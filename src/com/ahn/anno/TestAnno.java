package com.ahn.anno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnno {

    @Test
    public void testDemo(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
/*        User user= (User) applicationContext.getBean("user");
        System.out.println(user);
        user.add();*/

        UserService us= (UserService) applicationContext.getBean("userService");
        us.test();
    }
}
