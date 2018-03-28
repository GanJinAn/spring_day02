package com.ahn.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyBook {

    //ʹ��aop��ΪBook���test�������ӹ���
    public void testBefore(){
        System.out.println("MyBook-ǰ����ǿtest=====");
    }

    public void testAfter(){
        System.out.println("MyBook-������ǿtest=====");
    }

    //����֪ͨ���ڷ���ִ��֮ǰִ�У��ڷ���ִ��֮��ִ�У�
    public void testAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("MyBook-����ִ��֮ǰtest=====");
        //ִ����ǿ�ķ���
        //ͨ�����������ִ����ǿ�ķ���
        proceedingJoinPoint.proceed();

        System.out.println("MyBook-����ִ��֮��test=====");
    }
}
