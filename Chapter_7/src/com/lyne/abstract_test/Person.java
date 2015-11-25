package com.lyne.abstract_test;

import com.lyne.interface_test.Payable;

/**
 * ���󷽷���ʹ��ʾ��
 * @author nn_liu
 *
 */
public abstract class Person implements Payable{
	
	private String name;
	
	int INCREASE_CAP = 20;	// cap on pay increase

	public Person(){
	}
	
	public Person(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void changeAddress(String address){
		System.out.println("New address is "+address);
	}
	
	// private���������еķ�������ʹ��
	private void giveDayOff(){
		System.out.println("Giving a day off to "+ name);
	}
	
	public void promote(int percent) {
		System.out.println("Promoting a worker ...");
		giveDayOff();
		
		// calling an abastract method
		increasePay(percent);
	}
	
	// ʵ�ֽӿڷ���
	public boolean increasePay(int percent) {
		return false;
	}
}
