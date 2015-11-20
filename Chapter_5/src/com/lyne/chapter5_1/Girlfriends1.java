package com.lyne.chapter5_1;

import java.io.BufferedReader;

public class Girlfriends1 {

	public static void main(String[] argv) {
		// 数组的使用
		// 1、直接定义一个数组
		String[] friends = new String[20];
		// 2、定义一个数组并初始化
//		String [] friendsTest =new String[]{"Masha", "Matilda", "Rosa", "Sharon"};
		
		friends[0] = "Masha";
		friends[1] = "Matilda";
		friends[2] = "Rosa";
		// ...
		friends[18] = "Hillary";
		friends[19] = "Natasha";
		
		System.out.println("The third girl's name is "+friends[2]);
		System.out.println("The twentieth girl's name is "+friends[19]);
		
		// for loop
		for (int i = 0; i < friends.length; i++) {
			System.out.println(friends[i]);
		}
		
		// for-each loop
		for(String girl:friends)
		{
			System.out.println("the girl is "+girl);
		}
		
		//while loop
		int totalElements = friends.length;
		int i = 0;
		while (i < totalElements) {
			System.out.println("the girl is "+friends[i]);
			i++;
		}
		
		// keyword break
		i = 0;
		while(i<totalElements)
		{
			if (friends[i] == null) {
				System.out.println("The element "+(i+1)+" is null");
				break;
			}
			
			System.out.println("the girl is "+friends[i]);
			i++;
		}
		
		// keyword continue
		i = 0;
		while(i<totalElements)
		{
			if (friends[i] == null) {
				System.out.println("The element "+(i+1)+" is null");
				i++;
				continue;
			}else
			{
				System.out.println("the girl is "+friends[i]);
				i++;
			}
		}
		
		
		// condition operator
		int salary = 5000;
		int bonus = salary > 9000 ? 300:200;
		System.out.println(bonus);
	}
	
}
