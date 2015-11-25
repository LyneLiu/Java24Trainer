package com.lyne.abstract_test;

public class Employee extends Person {

	public Employee(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public boolean increasePay(int percent) {
		// TODO Auto-generated method stub
		System.out.println("Increasing salary by "+percent+"%. "+getName());
		
		return true;
	}

}
