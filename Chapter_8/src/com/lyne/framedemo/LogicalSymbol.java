package com.lyne.framedemo;

/**
 * 逻辑运算符的区别：
 * 1、&和&&（短路）
 * 2、|和||（短路）
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
