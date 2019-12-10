package com.crts.app.hm.main.service;

import java.util.List;

import com.crts.app.hm.main.dto.RoleDto;

public interface IRoleService {

	public void saveRole(RoleDto roleDto);
	
	public List<RoleDto> getAllRoles();

	public RoleDto getRoleById(int roleId);

	public RoleDto getRoleByName(String roleName);

	public void deleteRole(int roleId);

	public void deleteAllRoles();
	
	public void udateRole(RoleDto roleDto);
	
}
