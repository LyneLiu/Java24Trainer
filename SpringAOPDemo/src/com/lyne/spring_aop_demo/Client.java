package com.lyne.spring_aop_demo;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
public class Client {  
  
    public static void main(String[] args) {  
        @SuppressWarnings("all")
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");  
        UserManager userManager = (UserManager)factory.getBean("userManager");  
          
        //可以查找张三  
        String user = userManager.findUserById(1);  
          
        System.out.println(user);
        System.out.println("=====我==是==分==割==线=====");  
  
        try {  
            // 查不到数据，会抛异常，异常会被AfterThrowingAdvice捕获  
            userManager.findUserById(0);  
        } catch (IllegalArgumentException e) {  
        }  
    }  
}  