package com.extended.rolerepository;

import java.util.List;

import com.extended.entity.Role;

public interface RoleRepository {

	public Role InsertingOneRoleRecord(Role role);

	public List<Role> InsertingMultipleRoleRecord(List<Role> role);

	public Object[] GetOneRoleRecord(int roleId);

	public List<Role> GetAllRoleRecords();

	public String DeleteingRoleRecord(int id);

	public String UpadatingRoleRecord(Role role);

}
