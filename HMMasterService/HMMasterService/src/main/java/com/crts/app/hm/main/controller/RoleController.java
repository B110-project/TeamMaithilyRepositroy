package com.crts.app.hm.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.hm.main.dto.RoleDto;
import com.crts.app.hm.main.service.IRoleService;

@RestController
public class RoleController {

	@Autowired
	IRoleService ser;

	@RequestMapping("/regRole")
	public RoleDto saveRole(@RequestBody RoleDto r) {

		RoleDto role = ser.saveRole(r);
		return role;
	}
	
	@RequestMapping("/getAllRoles")
	public List<RoleDto> getAllRoles() {

		List<RoleDto> role = ser.getAllRoles();
		return role;
	}

	@RequestMapping("/getRoleById/{roleId}")
	public RoleDto getRoleById(@PathVariable int roleId) {

		RoleDto getRoleById = ser.getRoleById(roleId);

		return getRoleById;
	}

	@RequestMapping("/getRoleByName/{roleName}")
	public RoleDto getRoleByName(@PathVariable String roleName) {
		RoleDto getRoleByName = ser.getRoleByName(roleName);
		return getRoleByName;

	}

	@RequestMapping("/deleteRole/{roleId}")
	public String deleteRole(@PathVariable int roleId) {

		ser.deleteRole(roleId);
		return "deleted Sucessfull";

	}

	@RequestMapping("/deleteAllRoles")
	public String deleteAllRoles() {
		ser.deleteAllRoles();
		return "all Role are deleted Sucessfull";

	}

	@RequestMapping("/editRole/{roleId}")
	public RoleDto editRole(@PathVariable int roleId) {

		RoleDto roledto = ser.getRoleById(roleId);
		return roledto;

	}
	
	@RequestMapping("/udateRoleById")
	public List<RoleDto> udateRoleById(@RequestBody RoleDto r) {

		ser.saveRole(r);
		List<RoleDto> role = ser.getAllRoles();
		return role;
	}
	
}
