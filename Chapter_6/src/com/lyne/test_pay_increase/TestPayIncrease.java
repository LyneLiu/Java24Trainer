package com.lyne.test_pay_increase;

import java.util.Iterator;

import com.lyne.interface_test.Contractor;
import com.lyne.interface_test.Employee;
import com.lyne.interface_test.Payable;
import com.lyne.interface_test.Person;

public class TestPayIncrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Employee myEmployee = new Employee("lyne");
		
		Person workers[] = new Person[3];
		workers[0] = new Employee("John");
		workers[1] = new Contractor("Mary");
		workers[2] = new Employee("Steve");
		
		// 接口与抽象方法使用的不同，均是通过多态的特性实现
		for(Person p:workers)
		{
			((Payable)p).increasePay(30);
		}
		
		
		Employee currentEmployee;
		Contractor currentContractor;
		
		// 实现接口的class可以使用instanceof判断当前实例是否是某个class的实例
		for (Person p: workers){
			if (p instanceof Employee){
				currentEmployee = (Employee) p;
				currentEmployee.increasePay(30);
			}else if (p instanceof Contractor){
				currentContractor = (Contractor) p;
				currentContractor.increasePay(30);
			}
		}
	}

}
