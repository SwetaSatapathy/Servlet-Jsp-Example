package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeDAO {
	int insertEmployee(Employee employee);
	Employee showEmployeeById(Integer emp_id);
	List<Employee> showAllEmployee();
	boolean deleteEmployee(Integer emp_id);
}
