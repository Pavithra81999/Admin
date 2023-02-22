package com.extended.repositoryimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.extended.entity.Employee;
import com.extended.rolerepository.EmployeeRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Autowired
	private EntityManager entityManager;

	@Override
	@Transactional
	public Employee registerEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Query query = entityManager
				.createNativeQuery("insert into employee(empname,email,password,roleid) values(?,?,?,?)");
		query.setParameter(1, employee.getEmployeeName());
		query.setParameter(2, employee.getEmail());
		query.setParameter(3, employee.getPassword());
		query.setParameter(4, employee.getRoleId());
		query.executeUpdate();
		return employee;
	}

	@Override
	public Employee employeeLogin(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
