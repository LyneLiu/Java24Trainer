package com.lyne.chapter4_1;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BaseTest��������static����ֵ
		BaseTest.setName("test");
		BaseTest baseTest = new BaseTest();
		//����һ��BaseTest������ʵ��
		SubTest test1 = new SubTest();
		SubTest test2 = new SubTest();
		SubTest test3 = new SubTest();
		
		System.out.println(test1.name);		// �����test
		System.out.println(BaseTest.name);	// �����test
		System.out.println(SubTest.name);	// �����test
		System.out.println(BaseTest.num);
	}

}

// ����
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

// �̳���
class SubTest extends BaseTest{
	public SubTest() {
		// TODO Auto-generated constructor stub
		this.num++;
	}
}