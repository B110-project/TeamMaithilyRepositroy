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

	@RequestMapping("/saveRole")
	public String saveRole(@RequestBody RoleDto roleDtO) {
		ser.saveRole(roleDtO);
		return "Role Saved Successfully";
	}
	
	@RequestMapping("/getAllRoles")
	public List<RoleDto> getAllRoles() {
		List<RoleDto> roleDtoList = ser.getAllRoles();
		return roleDtoList;
	}

	@RequestMapping("/getRoleById/{roleId}")
	public RoleDto getRoleById(@PathVariable int roleId) {
		RoleDto roleDto = ser.getRoleById(roleId);
		return roleDto;
	}

	@RequestMapping("/getRoleByName/{roleName}")
	public RoleDto getRoleByName(@PathVariable String roleName) {
		RoleDto roleDto = ser.getRoleByName(roleName);
		return roleDto;
	}

	@RequestMapping("/deleteRole/{roleId}")
	public  List<RoleDto> deleteRole(@PathVariable int roleId) {
		ser.deleteRole(roleId);
		List<RoleDto> roleDtoList = ser.getAllRoles();
		return roleDtoList;
	}

	@RequestMapping("/deleteAllRoles")
	public String deleteAllRoles() {
		ser.deleteAllRoles();
		return "All Role Deleted Sucessfully";
	}

	@RequestMapping("/editRole/{roleId}")
	public RoleDto editRole(@PathVariable int roleId) {
		RoleDto roledto = ser.getRoleById(roleId);
		return roledto;
	}
	
	@RequestMapping("/udateRole")
	public List<RoleDto> udateRole(@RequestBody RoleDto roleDto) {
		ser.saveRole(roleDto);
		List<RoleDto> roleDtoList = ser.getAllRoles();
		return roleDtoList;
	}
	
}
