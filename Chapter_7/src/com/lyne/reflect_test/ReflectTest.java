package com.lyne.reflect_test;

import java.lang.reflect.Field;

/**
 * 反射使用场景
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
			
			// 通过反射可以获取到实例的属性
			// Note：属性字段必须为public才可以进行访问，否则，java.lang.NoSuchFieldException
			System.out.println(property1.toString());
			System.out.println(property1.equals("lyne"));

			// 对象转换为int，过程还挺繁琐
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

