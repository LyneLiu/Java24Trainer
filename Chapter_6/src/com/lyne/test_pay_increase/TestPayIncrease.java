package com.lyne.test_pay_increase;

import com.lyne.interface_test.Contractor;
import com.lyne.interface_test.Employee;
import com.lyne.interface_test.Person;

public class TestPayIncrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Employee myEmployee = new Employee("lyne");
		
		Person workers[] = new Person[3];
		workers[0] = new Employee("John");
		workers[1] = new Contractor("Mary");
		workers[2] = new Employee("Steve");
		
		Employee currentEmployee;
		Contractor currentContractor;
		
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
