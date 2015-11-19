package com.lyne.chapter4_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Java����ʹ��ʾ��
 * 
 * @author Administrator
 *
 */

public class ArrayDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		EmpManage em = new EmpManage();

		// ����һ��������������
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("����������ѡ��");
			System.out.println("1�����һ����Ա");
			System.out.println("2�����¹�Աн��");
			System.out.println("3��ɾ��һ����Ա");
			System.out.println("4����ѯ��Ա�б�");

			int choice = Integer.parseInt(bReader.readLine());

			switch (choice) {
			case 1:
				System.out.println("������Ա����Ϣ��");
				System.out.print("Ա����ţ�");
				String empNo1 = bReader.readLine();
				System.out.print("Ա��������");
				String name1 = bReader.readLine();
				System.out.print("Ա��н�ʣ�");
				String sal1 = bReader.readLine();
				Emp emp = new Emp(empNo1, name1, sal1);
				em.addEmp(emp);
				break;
			case 2:
				System.out.println("������Ա����ţ�");
				String empNo2 = bReader.readLine();
				System.out.println("������Ա��н�ʣ�");
				String sal2 = bReader.readLine();
				em.updateEmp(empNo2, sal2);
				break;
			case 3:
				System.out.println("������Ա����ţ�");
				String empNo3 = bReader.readLine();
				em.delEmp(empNo3);
				break;
			case 4:
				em.showEMInfo();
				break;
			default:
				break;
			}
		}

	}

}

class EmpManage {
	private ArrayList<Emp> al = null;

	public EmpManage() {
		// TODO Auto-generated constructor stub
		al = new ArrayList<Emp>();
	}

	// �����Ա��
	public void addEmp(Emp emp) {
		al.add(emp);
	}

	// ����Ա����Ϣ
	public void updateEmp(String empNo, String sal) {

		boolean result = false;

		for (int i = 0; i < al.size(); i++) {
			Emp emp = al.get(i);
			if (emp.getEmpNo().equals(empNo)) {
				System.out.println("Ա�����:" + emp.getEmpNo());
				System.out.println("Ա������:" + emp.getName());
				System.out.println("Ա��н��:" + emp.getSal());

				result = true;
			}
		}

		if (result == false) {
			System.out.println("δ�ҵ�Ա�����Ϊ��" + empNo + "�������Ϣ��");
		}
	}

	// ɾ��Ա����Ϣ
	public void delEmp(String empNo) {

		boolean result = false;

		for (int i = 0; i < al.size(); i++) {
			Emp emp = al.get(i);
			if (emp.getEmpNo().equals(empNo)) {
				al.remove(emp);
			}
		}

		if (result == false) {
			System.out.println("δ�ҵ�Ա�����Ϊ��" + empNo + "�������Ϣ��");
		}
	}
	
	public void showEMInfo() {
		for (int i = 0; i < al.size(); i++) {
			Emp emp = al.get(i);
			System.out.println("Ա�����:" + emp.getEmpNo());
			System.out.println("Ա������:" + emp.getName());
			System.out.println("Ա��н��:" + emp.getSal());
		}

	}
	
}

class Emp {
	// ��Ա��š�������н��
	private String empNo;
	private String name;
	private String sal;

	// ��ʼ��Ա����Ϣ
	public Emp(String empNo, String name, String sal) {
		// TODO Auto-generated constructor stub
		this.empNo = empNo;
		this.name = name;
		this.sal = sal;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

}