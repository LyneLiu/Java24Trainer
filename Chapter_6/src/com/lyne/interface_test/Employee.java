package com.lyne.interface_test;

public class Employee extends Person implements Payable{

	// 构造函数（调用父类构造函数）
	public Employee(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean increasePay(int percent) {
		// TODO Auto-generated method stub
		System.out.println("Increasing salary by " + percent + "%. "+ getName());
		return true;
	}

}
