package com.lyne.framedemo;

/**
 * �߼������������
 * 1��&��&&����·��
 * 2��|��||����·��
 * @author nn_liu
 *
 */
public class LogicalSymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		String s = null;
		if ( (s!=null) || (s.length()>0)) {
			System.out.println("if " + a);
		}else{
			System.out.println("else " + a);
		}
	}

}
