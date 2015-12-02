package com.lyne.framedemo;

/**
 * Java 7 的新特性，可以使用字符串作为switch的key
 * @author nn_liu
 *
 */
public class SwiftTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aString = "test";
		switch (aString) {
			case "release":
				System.out.println("String is release.");
				break;
			case "test":
				System.out.println("String is test.");
				break;
			default:
				break;
		}
	}

}
