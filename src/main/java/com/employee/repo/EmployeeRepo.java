package com.employee.repo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.employee.model.Employee;

@Repository
public class EmployeeRepo {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void save(Employee e) {

		jdbcTemplate.update("INSERT INTO EMP VALUES (?, ?, ?, ?)", e.getEmpNo(), e.getName(), e.getSal(),
				e.getDeptNo());
	}

	public void findById(int empNo) {

		Map<String, Object> maplst = jdbcTemplate.queryForMap("select * from emp where empNo =?", empNo);

		maplst.forEach((t, u) -> System.out.println(t + " : " + u));

	}

	public void updateById(int empNo, String name) {

		jdbcTemplate.update("update emp set name =? where empNo=?", name, empNo);

	}

	/*
	 * public void updateDepNo(int empNo, int deptNo) {
	 * 
	 * jdbcTemplate.update("update emp set deptno =? where empNo=?", empNo,deptNo);
	 * 
	 * }
	 */

	public void displayDeptNoMatchesDetails(int deptNo) {

		List<Map<String, Object>> lst = jdbcTemplate.queryForList("select * from emp where deptNo =?", deptNo);

		lst.forEach(t -> System.out.println(t));

	}

	public void displayName(int deptNo) {

		String name = jdbcTemplate.queryForObject("select name from emp where deptNo =?", String.class, deptNo);

		System.out.println("Employee name :: " + name);
	}

	public void deleteData(int empNo) {

		jdbcTemplate.update("delete from emp where empNo = ?", empNo);

	}
}
