package com.lyne.spring_aop_demo;

public class UserManagerImpl implements UserManager {  
	  
    public String findUserById(int userId) {  
        System.out.println("---------UserManagerImpl.findUserById()--------");  
        if (userId <= 0) {  
            throw new IllegalArgumentException("该用户不存在!");   
        }  
        return "张三";  
    }  
}  