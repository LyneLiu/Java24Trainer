package com.lyne.spring_demo;

public class HelloBean {
	
	private String helloworld="Hello!World!";
	
	private HelloImp hello; // ���һ��˽�ж��󣨽ӿڣ�
	    
    public String getHelloworld() {
        return helloworld;
    }
    
    public void setHelloworld(String helloworld) {
        this.helloworld = helloworld;
    }
    
    // ˽�ж���hello�ķ���
    public void setHello(HelloImp hello) {
		this.hello = hello;
	}
    
    public void get() {
		this.hello.getName();
	}
}
