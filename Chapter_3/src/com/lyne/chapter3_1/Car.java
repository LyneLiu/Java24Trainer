package com.lyne.chapter3_1;

public class Car {
	/**
	 * filed:�������
	 */
	String color;
	int numberOfDoors;
	
	/**
	 * method:��ķ���
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
 * JamesBondCar�̳�Car
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