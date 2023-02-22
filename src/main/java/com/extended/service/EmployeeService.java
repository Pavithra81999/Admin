package com.extended.service;

import com.extended.entity.Employee;
import com.extended.reponse.FinalResponse;

public interface EmployeeService {
	public FinalResponse employeeRegistration(Employee employee);

	public FinalResponse employeeLogin(Employee employee);
}
