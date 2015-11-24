package com.lyne.interface_test;

public class Person {

	private String name;
	
	//¹¹Ôìº¯Êý
	public Person(String name){
		this.name=name;
	}
	
	public String getName(){
		return "Person¡¯s name is " + name;
	}
}
