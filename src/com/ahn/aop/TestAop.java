package com.ahn.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Target;

public class TestAop {

    @Test
    public void testA(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean2aop.xml");
        Book book= (Book) applicationContext.getBean("book");
        //先调用Mybook类的方法，再执行book类的方法
        book.test();
    }
}
