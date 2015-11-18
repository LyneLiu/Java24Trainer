package com.lyne.chapter4_1;

/**
 * 构造器的使用
 * @author Administrator
 *
 */

public class BaseTax {

	double grossIncome; // class variable
	String state;
	int dependents;
	
	// 使用this()我们可以调用不同的构造函数
	// First Constructor
	public BaseTax(double grossIncome, String state, int dependents){
		this.grossIncome = grossIncome; // instance variable initialization
		this.state = state;
		this.dependents=dependents;
	}
	
	// Second Constructor
	public BaseTax(double grossIncome,int dependents){
		this(grossIncome, "NY", dependents);
	}
	
	// this指向当前类的实例的引用，同样可以被称为上下问？s
	public void verigyTax() {
		
		SomeOtherClass s = new SomeOtherClass();
		s.verifyTax(this);
		
	}
	
	public static void main(String[] argv) {
		
		BaseTax tax1 = new BaseTax(65000, "NJ", 3);
		
		System.out.println(tax1.getClass());
		
	}
}

class SmallTax extends BaseTax{
	//Constructor
	public SmallTax(double gi,String st,int depen) {
		// 使用super关键字调用父类方法
		super(gi, st, depen);
		System.out.println("Applying special tax rate for my friends.");
	}
}