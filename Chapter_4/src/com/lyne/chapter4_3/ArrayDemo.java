package com.lyne.chapter4_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Java集合使用示例
 * 
 * @author Administrator
 *
 */

public class ArrayDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		EmpManage em = new EmpManage();

		// 定义一个输入流缓冲区
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("请输入您的选择：");
			System.out.println("1、添加一个雇员");
			System.out.println("2、更新雇员薪资");
			System.out.println("3、删除一个雇员");
			System.out.println("4、查询雇员列表");

			int choice = Integer.parseInt(bReader.readLine());

			switch (choice) {
			case 1:
				System.out.println("请输入员工信息：");
				System.out.print("员工编号：");
				String empNo1 = bReader.readLine();
				System.out.print("员工姓名：");
				String name1 = bReader.readLine();
				System.out.print("员工薪资：");
				String sal1 = bReader.readLine();
				Emp emp = new Emp(empNo1, name1, sal1);
				em.addEmp(emp);
				break;
			case 2:
				System.out.println("请输入员工编号：");
				String empNo2 = bReader.readLine();
				System.out.println("请输入员工薪资：");
				String sal2 = bReader.readLine();
				em.updateEmp(empNo2, sal2);
				break;
			case 3:
				System.out.println("请输入员工编号：");
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

	// 添加新员工
	public void addEmp(Emp emp) {
		al.add(emp);
	}

	// 更新员工信息
	public void updateEmp(String empNo, String sal) {

		boolean result = false;

		for (int i = 0; i < al.size(); i++) {
			Emp emp = al.get(i);
			if (emp.getEmpNo().equals(empNo)) {
				System.out.println("员工编号:" + emp.getEmpNo());
				System.out.println("员工姓名:" + emp.getName());
				System.out.println("员工薪资:" + emp.getSal());

				result = true;
			}
		}

		if (result == false) {
			System.out.println("未找到员工编号为：" + empNo + "的相关信息！");
		}
	}

	// 删除员工信息
	public void delEmp(String empNo) {

		boolean result = false;

		for (int i = 0; i < al.size(); i++) {
			Emp emp = al.get(i);
			if (emp.getEmpNo().equals(empNo)) {
				al.remove(emp);
			}
		}

		if (result == false) {
			System.out.println("未找到员工编号为：" + empNo + "的相关信息！");
		}
	}
	
	public void showEMInfo() {
		for (int i = 0; i < al.size(); i++) {
			Emp emp = al.get(i);
			System.out.println("员工编号:" + emp.getEmpNo());
			System.out.println("员工姓名:" + emp.getName());
			System.out.println("员工薪资:" + emp.getSal());
		}

	}
	
}

class Emp {
	// 雇员编号、姓名、薪资
	private String empNo;
	private String name;
	private String sal;

	// 初始化员工信息
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