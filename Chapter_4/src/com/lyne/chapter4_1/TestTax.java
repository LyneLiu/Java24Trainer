package com.lyne.chapter4_1;

public class TestTax {
	public static void main(String[] argv) {
		double grossIncome;
		String state;
		int dependents;
		
		grossIncome = 50000;
		dependents = 2;
		state = "NJ";
		
		// ����BaseTaxʵ��ʱ�����ݲ������������ǻᴴ������grossIncome copies
		// һ����TestTax�У���һ����BaseTax��
		
		BaseTax t = new BaseTax(grossIncome,state,dependents);
	}
}
