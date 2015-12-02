package com.lyne.spring_aop_demo;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
public class Client {  
  
    public static void main(String[] args) {  
        @SuppressWarnings("all")
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");  
        UserManager userManager = (UserManager)factory.getBean("userManager");  
          
        //���Բ�������  
        String user = userManager.findUserById(1);  
          
        System.out.println(user);
        System.out.println("=====��==��==��==��==��=====");  
  
        try {  
            // �鲻�����ݣ������쳣���쳣�ᱻAfterThrowingAdvice����  
            userManager.findUserById(0);  
        } catch (IllegalArgumentException e) {  
        }  
    }  
}  