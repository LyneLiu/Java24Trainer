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
		
		int chairs = 12;
		boolean cancelJob = false;
		double nationalIncome = 23863494965745.78;
		static float hourlyRate = 12.50f;
		final long tatalCars = 463728368392L;
		
		for (int i = 0; i < argv.length; i++) {
			int temp = i;
		}
		
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
	// ʹ��final���峣�����ͣ�
	final String MANUFACTURER = "J.B. Limited";
	
	void submerge{
		currentSubmergeDepth = 50;
		// some code goes here 
	}
	
	void surface{
		// some code goes here
	}
}