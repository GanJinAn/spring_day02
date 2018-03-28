package com.ahn.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyBook {

    //使用aop来为Book类的test方法增加功能
    public void testBefore(){
        System.out.println("MyBook-前置增强test=====");
    }

    public void testAfter(){
        System.out.println("MyBook-后置增强test=====");
    }

    //环绕通知（在方法执行之前执行，在方法执行之后执行）
    public void testAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("MyBook-方法执行之前test=====");
        //执行增强的方法
        //通过这个对象能执行增强的方法
        proceedingJoinPoint.proceed();

        System.out.println("MyBook-方法执行之后test=====");
    }
}
