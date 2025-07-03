package com.employee.model;

public class Employee {

	private int empNo;
	private String name;
	private double sal;
	private int deptNo;
	
	public Employee() {
		
	}

	public Employee(int empNo, String name, double sal, int deptNo) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.sal = sal;
		this.deptNo = deptNo;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", sal=" + sal + ", deptNo=" + deptNo + "]";
	}

}
