package com.employee.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class EmployeeRunner implements ApplicationRunner {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		jdbcTemplate.execute(
				"CREATE TABLE EMP (empNo INT, name VARCHAR(20), sal DOUBLE, " + "deptNo INT, PRIMARY KEY(empNo))");

		System.out.println("Employee Runner :: EMP table is created.");

		jdbcTemplate.update("INSERT INTO EMP VALUES (1001,'LINGABABU',7000,20)");
		jdbcTemplate.update("INSERT INTO EMP VALUES (1002,'CHAND',3500,30)");
		jdbcTemplate.update("INSERT INTO EMP VALUES (1003,'VIJAY',4000,70)");
		jdbcTemplate.update("INSERT INTO EMP VALUES (1004,'GOWTHAMI',4000,10)");
		jdbcTemplate.update("INSERT INTO EMP VALUES (1005,'SUMIYA',6500,20)");
		jdbcTemplate.update("INSER INTO EMP VALUES (1008,'ANIL',1000,1)");

	}

}
