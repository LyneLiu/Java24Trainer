package com.lyne.interface_test;

public class Person {

	private String name;
	
	//���캯��
	public Person(String name){
		this.name=name;
	}
	
	public String getName(){
		return "Person��s name is " + name;
	}
}
