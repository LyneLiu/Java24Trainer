package com.lyne.primitivedata;

public class PrimitiveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����������ֱ�Ӹ�ֵΪint
		// int x = 34.5;
		// ǿ������ת��
		int x = (int)34.5;
		// int����ֱ�Ӹ�ֵΪboolean
		// ֻ��ͨ�������жϻ�ȡbooleanֵ
		// boolean boo = x;
		// boolean boo = (boolean)x;
		
		int g =17;
		int y = g;
		y = y + 1;
		short s;
		// Type mismatch: cannot convert from int to short
		// s = y;
		byte b = 3;
		byte v = b;
		short n = 12;
		// Type mismatch: cannot convert from short to byte
		// v = n;
		// Type mismatch: cannot convert from int to byte
		// byte k = 128;
		int p = 3 * g + y;
		// Syntax error on token "public", invalid VariableDeclaratorId
		// int public = 12;
		
		// String��ͬ��ʱ�������ͬ�����
		System.out.println("string:");
		String aString = new String("abc");
		String bString = null;
		bString = "abc";
		System.out.println(aString.hashCode());
		System.out.println(bString.hashCode());
		bString = new String("abc");
		System.out.println(bString.hashCode());
		String cString = "efg";
		System.out.println(cString.hashCode());
		
		// �Զ����������
		System.out.println("object:");
		Test test1 = new Test();
		Test test2 = test1;
		System.out.println(test1.hashCode());
		System.out.println(test2.hashCode());
		test2 = new Test();
		System.out.println(test2.hashCode());
		Test test3 = new Test();
		System.out.println(test3.hashCode());
	}

}

class Test{
	
}
