package com.extended.serviceimpl;

import java.util.InputMismatchException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.extended.entity.Role;
import com.extended.reponse.FinalResponse;
import com.extended.rolerepository.RoleRepository;
import com.extended.service.RoleService;

@Service
public class RoleServiceImplementation implements RoleService {
	private static final Logger logger = LoggerFactory.getLogger(RoleServiceImplementation.class);

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public FinalResponse InsertingOneRoleRecord(Role role) {
		logger.info("InsertingOneRoleRecord:: input:: role: " + role);
		logger.debug("InsertingOneRoleRecord:: input:: role:" + role);
		FinalResponse finalResponse = new FinalResponse();
		try {
			roleRepository.InsertingOneRoleRecord(role);

		} catch (InputMismatchException e) {
			logger.error("InputMismatchException:: input:: employee:" + e.getMessage());
		}

		if (role != null) {
			finalResponse.status = true;
			finalResponse.statusCode = "200";
			finalResponse.message = "One Record was Inserted";

		}
		return finalResponse;

	}

	@Override
	public FinalResponse InsertingMultipleRoleRecord(List<Role> role) {
		logger.info("InsertingMultipleRoleRecord:: input:: role: " + role);
		FinalResponse finalResponse = new FinalResponse();
		try {
			roleRepository.InsertingMultipleRoleRecord(role);
		} catch (InputMismatchException e) {
			logger.error("InputMismatchException:: input:: role:" + e.getMessage());
		}
		if (role != null) {
			finalResponse.status = true;
			finalResponse.statusCode = "200";
			finalResponse.message = "Records are Inserted";
			return finalResponse;

		} else {
			finalResponse.status = false;
			finalResponse.statusCode = "500";
			finalResponse.message = " Records Not Inserted";
			return finalResponse;

		}

	}

	@Override
	public FinalResponse GetOneRoleRecord(int roleId) {
		logger.info("InsertingMultipleRoleRecord:: input:: role: " + roleId);
		FinalResponse finalResponse = new FinalResponse();
		Object[] role = null;
		try {

			role = roleRepository.GetOneRoleRecord(roleId);
		} catch (InputMismatchException e) {
			logger.error("InputMismatchException:: input:: role:" + e.getMessage());
		}
		if (role != null) {
			finalResponse.status = true;
			finalResponse.statusCode = "200";
			finalResponse.message = " Record was present";
			finalResponse.data = role;
			return finalResponse;

		} else {

		}
		return finalResponse;

	}

	@Override
	public FinalResponse GetAllRoleRecords() {
		logger.info("GetAllRoleRecords:: input:: role: ");
		FinalResponse finalResponse = new FinalResponse();
		List<Role> role = null;
		try {
			role = roleRepository.GetAllRoleRecords();
		} catch (InputMismatchException e) {
			logger.error("InputMismatchException:: input:: role:" + e.getMessage());
		}

		if (role != null) {
			finalResponse.status = true;
			finalResponse.statusCode = "200";
			finalResponse.message = " All Records are present";
			finalResponse.data = role;
			return finalResponse;
		} else {

		}
		return finalResponse;

	}

	@Override
	public FinalResponse DeleteingRoleRecord(int roleId) {
		logger.info("DeleteingRoleRecord:: input:: role: " + roleId);
		FinalResponse finalResponse = new FinalResponse();
		try {
			roleRepository.DeleteingRoleRecord(roleId);
		} catch (InputMismatchException e) {
			logger.error("InputMismatchException:: input:: role:" + e.getMessage());
		}
		if (roleId > 0) {
			finalResponse.status = true;
			finalResponse.statusCode = "200";
			finalResponse.message = " Record was deleted";
			return finalResponse;

		} else {
			finalResponse.status = false;
			finalResponse.statusCode = "404";
			finalResponse.message = "roleid does not exist";

			return finalResponse;
		}
	}

	@Override
	public FinalResponse UpadatingRoleRecord(Role role) {
		logger.info("UpadatingRoleRecord:: input:: role: " + role);
		FinalResponse finalResponse = new FinalResponse();
		try {

			roleRepository.UpadatingRoleRecord(role);
		} catch (InputMismatchException e) {
			logger.error("InputMismatchException:: input:: role:" + e.getMessage());
		}
		if (role != null) {
			finalResponse.status = true;
			finalResponse.statusCode = "200";
			finalResponse.message = " Record was Updated";
			return finalResponse;
		} else {
			finalResponse.status = false;
			finalResponse.statusCode = "500";
			finalResponse.message = "One Record was Not Inserted";

			return finalResponse;

		}
	}

}
