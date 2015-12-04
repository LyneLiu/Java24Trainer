package com.lyne.primitivedata;

/**
 * 对象数组（引用对象）的使用
 * @author Administrator
 *
 */
public class Hobbits {
	
	String name;
	
	public static void main(String[] argv) {
		Hobbits[] hobbits = new Hobbits[3];
		
		int z = 0;
		
//		while (z < 4) {
			// 数组访问越界
//			z = z+1;
		while (z < 3) {
			hobbits[z] = new Hobbits();
			hobbits[z].name = "billo";
			if (z == 1) {
				hobbits[z].name = "frodo";
			}
			if (z == 2) {
				hobbits[z].name = "sam";
			}
			
			System.out.println(hobbits[z].name + " is a good Hobbit name." );
			z = z + 1;
		}
	}
}
