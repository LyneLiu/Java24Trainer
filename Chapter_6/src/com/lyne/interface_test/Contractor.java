package com.lyne.interface_test;

public class Contractor extends Person implements Payable {

	public Contractor(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean increasePay(int percent) {
		// TODO Auto-generated method stub
		if (percent >= Payable.INCREASE_CAP) {
			System.out.println("your increase rate can't more than 20 percent.Person's name "+getName());
			return false;
		}
		else {
			System.out.println("Increasing salary by " + percent + "%. "+ getName());
			return true;
		}
	}

}
