package com.lyne.interface_test;

/**
 * ����һ���ӿ�Payable
 * @author nn_liu
 *
 */
public interface Payable {
	//�ӿ��ж���ı���Ĭ��Ϊpublic static final
	int INCREASE_CAP = 20;
	
	//����һ���������̳нӿڵ������Ҫʵ�ָ÷���
	public boolean increasePay(int percent);
}
