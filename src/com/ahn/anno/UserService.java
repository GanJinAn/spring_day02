package com.ahn.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//创建对象
@Service(value = "userService")
public class UserService {

    //1、先创建service和dao对象
    //2、得到dao对象（先声明dao对象，使用注解方式不需要实现set方法）
    //在dao对象上面使用注解方式得到dao对象
    //自动配备
/*    @Autowired
    private UserDao userDao;*/

    //第二种注解
    @Resource(name="userDao")
    private UserDao userDao;
    public void test(){
        System.out.println("userService====");
        userDao.test();
    }
}
