package com.test;


public class TestStaticProxy {

    public static void main(String[] args){
        testStaticProxy();
    }
    public static void testStaticProxy() {
        //目标对象
        IUserDao target = new UserDao();
        //代理对象
        UserDaoProxy proxy = new UserDaoProxy(target);
        proxy.save();
    }
}
