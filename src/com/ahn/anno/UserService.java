package com.ahn.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//��������
@Service(value = "userService")
public class UserService {

    //1���ȴ���service��dao����
    //2���õ�dao����������dao����ʹ��ע�ⷽʽ����Ҫʵ��set������
    //��dao��������ʹ��ע�ⷽʽ�õ�dao����
    //�Զ��䱸
/*    @Autowired
    private UserDao userDao;*/

    //�ڶ���ע��
    @Resource(name="userDao")
    private UserDao userDao;
    public void test(){
        System.out.println("userService====");
        userDao.test();
    }
}
