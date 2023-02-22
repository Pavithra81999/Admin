package com.extended.entity;

import java.sql.Date;

import jakarta.validation.constraints.NotNull;

public class Role {

	private int roleId;
	@NotNull(message = "roleName Should Be Mention")
	private String roleName;
	@NotNull(message = "roleType Should Be Mention")
	private String roleType;
	private Date createdDate;

	private Date updatedDate;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", roleType=" + roleType + ", createdDate="
				+ createdDate + ", updatedDate=" + updatedDate + "]";
	}

}
