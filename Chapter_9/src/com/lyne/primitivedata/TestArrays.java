package com.lyne.primitivedata;

public class TestArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] index = new int[4];
		String[] islands = new String[4];
		
		// 数组对象需要初始化
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;
		
		islands[0] = "Bermuda";
		islands[1] = "Fiji";
		islands[2] = "Azores";
		islands[3] = "Cozumel";
		
		int ref;
		int y = 0;
		while (y < 4) {
			
			ref = index[y];
			
			System.out.println("island = "+islands[ref]);
			
			y++;
		}
	}

}
