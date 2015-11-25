package com.lyne.abstract_test;

public class Contractor extends Person {

	public Contractor(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public boolean increasePay(int percent) {
		// TODO Auto-generated method stub
		if (percent < INCREASE_CAP) {
			System.out.println("Increasing salary by "+percent+"%. "+getName());
			return true;
		}else{
			System.out.println("Sorry,can't increase hourly rate by more than "+INCREASE_CAP+"%. "+getName());
			return false;
		}
		
	}

}
