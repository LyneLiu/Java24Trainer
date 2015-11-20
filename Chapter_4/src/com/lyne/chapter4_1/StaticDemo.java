package com.lyne.chapter4_1;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BaseTest基类设置static变量值
		BaseTest.setName("test");
		BaseTest baseTest = new BaseTest();
		//创建一个BaseTest的子类实例
		SubTest test1 = new SubTest();
		SubTest test2 = new SubTest();
		SubTest test3 = new SubTest();
		
		System.out.println(test1.name);		// 结果：test
		System.out.println(BaseTest.name);	// 结果：test
		System.out.println(SubTest.name);	// 结果：test
		System.out.println(BaseTest.num);
	}

}

// 基类
class BaseTest{
	public static String name;
	public static int num = 0;

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		BaseTest.name = name;
	}
	
}

// 继承类
class SubTest extends BaseTest{
	public SubTest() {
		// TODO Auto-generated constructor stub
		this.num++;
	}
}