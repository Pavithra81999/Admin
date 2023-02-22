package com.extended.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extended.entity.Employee;
import com.extended.reponse.FinalResponse;
import com.extended.rolerepository.EmployeeRepository;
import com.extended.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public FinalResponse employeeRegistration(Employee employee) {
		// TODO Auto-generated method stub
		FinalResponse finalResponse = new FinalResponse();
		employeeRepository.registerEmployee(employee);
		finalResponse.setStatus(true);
		finalResponse.setStatusCode("200");
		finalResponse.setMessage("employee registered successfully");
		finalResponse.setData(employee);
		return finalResponse;
	}

	@Override
	public FinalResponse employeeLogin(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
