package com.lyne.chapter3_1;

public class Car {
	/**
	 * filed:类的属性
	 */
	String color;
	int numberOfDoors;
	
	/**
	 * method:类的方法
	 */
	void startEngine{
		// some code goes here
	}
	
	void stopEngine{
		int tempCounter = 0;
		// some code goes here
	}
	
	public static void main(String[] argv) {
		JamesBondCar car1 = new JamesBondCar();
		JamesBondCar car2 = new JamesBondCar();
	}
}

/**
 * JamesBondCar继承Car
 * @author nn_liu
 *
 */
class JamesBondCar extends Car{
	
	int currentSubmergeDepth;
	boolean isGunOnBoard=true;
	final String MANUFACTURER;
	
	void submerge{
		currentSubmergeDepth = 50;
		// some code goes here 
	}
	
	void surface{
		// some code goes here
	}
}