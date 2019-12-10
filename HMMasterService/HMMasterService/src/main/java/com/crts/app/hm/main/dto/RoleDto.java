package com.crts.app.hm.main.dto;

public class RoleDto {

	private int roleId;
	private String roleName;
	private int roleStatus;
	
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
	public int getRoleStatus() {
		return roleStatus;
	}
	public void setRoleStatus(int roleStatus) {
		this.roleStatus = roleStatus;
	}
	@Override
	public String toString() {
		return "RoleDto [roleId=" + roleId + ", roleName=" + roleName + ", roleStatus=" + roleStatus + "]";
	}
	
	
}
