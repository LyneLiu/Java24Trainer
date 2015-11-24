package com.lyne.interface_test;

/**
 * 定义一个接口Payable
 * @author nn_liu
 *
 */
public interface Payable {
	//接口中定义的变量默认为public static final
	int INCREASE_CAP = 20;
	
	//声明一个方法，继承接口的类均需要实现该方法
	public boolean increasePay(int percent);
}
