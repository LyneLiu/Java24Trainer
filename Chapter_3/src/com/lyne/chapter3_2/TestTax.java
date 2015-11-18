package com.lyne.chapter3_2;

public class TestTax extends Tax {

	@Override
	public double calcTax(){
		double stateTax = 0;
		if(grossIncome < 30000)
		{
			stateTax = grossIncome * 0.05;
		}else {
			stateTax = grossIncome * 0.06;
		}
		
		return stateTax;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tax tax = new TestTax(); // create an instance
		tax.grossIncome = 5000; // assiging the values
		tax.dependents = 2;
		tax.state = "NJ";
		
		double yourTax = tax.calcTax(); // calculating tax
		
		// Printing the result
		System.out.println("Your tax is " + yourTax);
	}

}
