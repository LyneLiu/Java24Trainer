package com.lyne.chapter4_1;

public class TestTax {
	public static void main(String[] argv) {
		double grossIncome;
		String state;
		int dependents;
		
		grossIncome = 50000;
		dependents = 2;
		state = "NJ";
		
		// 创建BaseTax实例时，传递参数过程中我们会创建两个grossIncome copies
		// 一个在TestTax中，另一个在BaseTax中
		
		BaseTax t = new BaseTax(grossIncome,state,dependents);
	}
}
