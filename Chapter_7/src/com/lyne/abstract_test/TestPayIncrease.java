package com.lyne.abstract_test;

public class TestPayIncrease {
	public static void main(String[] argv) {
		
		Person workers[] = new Person[3];
		
		workers[0] = new Employee("John");
		workers[1] = new Contractor("Mary");
		workers[2] = new Employee("Steve");
		
		// 抽象类的使用
		for(Person p:workers){
			p.increasePay(30);
		}
	}
}
