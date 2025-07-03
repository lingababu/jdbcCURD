package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employee.model.Employee;
import com.employee.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;

	public void saveEmployee(Employee e) {

		System.out.println("Welcome to employee service save method.");

		employeeRepo.save(e);

		System.out.println("Employee data saved successfully with empno: " + e.getEmpNo() + " name: " + e.getName()
				+ " sal: " + e.getSal() + " deptNo: " + e.getDeptNo());
	}

	public void getById(int empNo) {

		System.out.println("Employee avilable with EMPNO: " + empNo);

		employeeRepo.findById(empNo);

	}

	public void updateDetails(int empNo, String name) {

		employeeRepo.updateById(empNo, name);

		System.out.println("Employee details updated successfully.");

	}

	public void displayDeptMatchesDetails(int deptNo) {

		employeeRepo.displayDeptNoMatchesDetails(deptNo);

		System.out.println("Display :: multiple rows.");

	}

	public void displaySingleName(int deptNo) {

		employeeRepo.displayName(deptNo);

		System.out.println("Display :: single value");
	}

	/*
	 * public void updateDeptNo(int empId, int deptNo) {
	 * employeeRepo.updateDepNo(empId, deptNo); }
	 */

	public void deleteData(int empNo) {
		employeeRepo.deleteData(empNo);
		System.out.println("Employee deleted successfully.");
	}

}
