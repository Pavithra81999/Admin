package com.extended.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.extended.entity.Employee;
import com.extended.reponse.FinalResponse;
import com.extended.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/registration")
	public FinalResponse employeeRegistration(@RequestBody @Valid Employee employee) {
		return employeeService.employeeRegistration(employee);
	}
}
