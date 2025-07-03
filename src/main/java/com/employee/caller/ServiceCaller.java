package com.employee.caller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@Component
@Order(2)
public class ServiceCaller implements ApplicationRunner {

	@Autowired
	EmployeeService employeeService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Employee employee = new Employee(1006, "John", 2500, 43);
		
		employeeService.saveEmployee(employee);

		System.out.println();

		employeeService.getById(1001);
		System.out.println();
		employeeService.updateDetails(1006, "Bikari");

		System.out.println();
		employeeService.displayDeptMatchesDetails(20);

		System.out.println();
		employeeService.displaySingleName(43);

		System.out.println();
		employeeService.deleteData(1006);

	}

}
