package com.lyne.chapter3_2;

/**
 * 1�����ڲ�ͬ����������������Ҫȷ����Ҫ��class(es)
 * 2��ȷ��class�а�����filed��method
 * @author nn_liu
 *
 */
class Tax {
	// ë����
	double grossIncome;
	// ������ݿ�
	String state;
	// ��λ
	int dependents;
	
	// ���е��ⲿ�����ͨ��calcTax�ķ�����ȡ��Tax
	public double calcTax() {
		return 234.55;
	}
	
	public void PrintAnnualTaxReturn() {
		System.out.println("This is no-return test!");
	}
}
