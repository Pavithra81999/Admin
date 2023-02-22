package com.extended.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.extended.entity.Role;
import com.extended.service.RoleService;

@ExtendWith(MockitoExtension.class)
public class RoleControllerTest {

	@InjectMocks
	private RoleController roleController;
	
	@Mock
	private RoleService roleService;
	
	@Test
	@DisplayName("should map insert request with service class")
	public void insertingOneRoleRecordTest() {
		Role role = new Role();
		role.setCreatedDate(null);
		role.setRoleName("Admin");
		role.setRoleType("IT");
		role.setUpdatedDate(null);
		//when(roleController.InsertingRoleRecord(any(Role.class))).thenReturn(role);
	}
}
