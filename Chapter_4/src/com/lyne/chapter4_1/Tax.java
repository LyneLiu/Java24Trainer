package com.lyne.chapter4_1;

/**
 * ��������ʹ��
 * @author Administrator
 *
 */

public class BaseTax {

	double grossIncome; // class variable
	String state;
	int dependents;
	
	// ʹ��this()���ǿ��Ե��ò�ͬ�Ĺ��캯��
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
	
	// thisָ��ǰ���ʵ�������ã�ͬ�����Ա���Ϊ�����ʣ�s
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
		// ʹ��super�ؼ��ֵ��ø��෽��
		super(gi, st, depen);
		System.out.println("Applying special tax rate for my friends.");
	}
}