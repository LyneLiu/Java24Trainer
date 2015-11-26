package com.lyne.spring_demo;

public class HelloBean {
	
	private String helloworld="Hello!World!";
	
	private HelloImp hello; // 添加一个私有对象（接口）
	    
    public String getHelloworld() {
        return helloworld;
    }
    
    public void setHelloworld(String helloworld) {
        this.helloworld = helloworld;
    }
    
    // 私有对象hello的方法
    public void setHello(HelloImp hello) {
		this.hello = hello;
	}
    
    public void get() {
		this.hello.getName();
	}
}
