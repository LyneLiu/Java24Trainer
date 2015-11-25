package com.lyne.reflect_test;

import java.lang.reflect.Field;

/**
 * ����ʹ�ó���
 * @author nn_liu
 *
 */
public class ReflectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test1 = new Test();
		test1.setName("lyne");
		test1.setAge(25);
		test1.setAddress("ShangHai");
		try
		{
			Object property1 = ReflectTest.getProperty(test1, "name");
			Object property2 = ReflectTest.getProperty(test1, "age");
			
			// ͨ��������Ի�ȡ��ʵ��������
			// Note�������ֶα���Ϊpublic�ſ��Խ��з��ʣ�����java.lang.NoSuchFieldException
			System.out.println(property1.toString());
			System.out.println(property1.equals("lyne"));

			// ����ת��Ϊint�����̻�ͦ����
			System.out.println(property2.equals(25));
			System.out.println(Integer.parseInt(property2.toString()));
		
		}catch(Exception e){
			System.out.println(e);
		}
	}

	@SuppressWarnings("all")
	public static Object getProperty(Object owner, String fieldName) throws Exception {  
	     Class ownerClass = owner.getClass();  
	     Field field = ownerClass.getField(fieldName);  
	     Object property = field.get(owner);  
	     return property;  
	}  
}

