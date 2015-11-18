package com.lyne.chapter3_2;

/**
 * 1、对于不同的任务，首先我们需要确定需要的class(es)
 * 2、确定class中包含的filed和method
 * @author nn_liu
 *
 */
class Tax {
	// 毛收入
	double grossIncome;
	// 生活的州郡
	String state;
	// 单位
	int dependents;
	
	// 所有的外部类可以通过calcTax的方法获取到Tax
	public double calcTax() {
		return 234.55;
	}
	
	public void PrintAnnualTaxReturn() {
		System.out.println("This is no-return test!");
	}
}
