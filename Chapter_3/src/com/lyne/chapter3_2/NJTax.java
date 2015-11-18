package com.lyne.chapter3_2;

/**
 * Tax is the superclass
 * NJTax is the subclass
 * @author nn_liu
 *
 */
class NJTax extends Tax {
	
	
	
	double adjustForStudents(double stateTax)
	{
		double adjustedTax = stateTax - 500;
		return adjustedTax;
	}
	
	public static void main(String[] argv) {
		NJTax tax = new NJTax();
		double yourTax = tax.calcTax();
		double totaltax= tax.adjustForStudents(yourTax);
		
		System.out.println(totaltax);
	}
}
