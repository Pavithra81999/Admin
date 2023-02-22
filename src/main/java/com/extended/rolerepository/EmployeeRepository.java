package com.extended.rolerepository;

import com.extended.entity.Employee;

public interface EmployeeRepository {
	public Employee registerEmployee(Employee employee);

	public Employee employeeLogin(Employee employee);
}
