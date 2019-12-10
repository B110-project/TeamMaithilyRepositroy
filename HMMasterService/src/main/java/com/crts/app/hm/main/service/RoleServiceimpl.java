package com.crts.app.hm.main.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.hm.main.dto.RoleDto;
import com.crts.app.hm.main.model.Role;
import com.crts.app.hm.main.repository.IRoleRepository;

@Service
public class RoleServiceimpl implements IRoleService {

	@Autowired
	IRoleRepository repo;

	ModelMapper mm = new ModelMapper();

	@Override
	public void saveRole(RoleDto roleDto) {
		Role role = mm.map(roleDto, Role.class);
		repo.save(role);
	}
	
	@Override
	public List<RoleDto> getAllRoles() {
		List<Role> roleList = (List<Role>) repo.findAll();
		List<RoleDto> roleDtoList = new ArrayList<RoleDto>();
		for (Role role : roleList) {
			RoleDto roleDto = mm.map(role, RoleDto.class);
			roleDtoList.add(roleDto);
		}
		return roleDtoList;
	}

	@Override
	public RoleDto getRoleById(int roleId) {
		Role role = repo.findById(roleId).get();
		RoleDto roleDto = mm.map(role, RoleDto.class);
		return roleDto;
	}

	@Override
	public RoleDto getRoleByName(String roleName) {
		Role role = repo.getRoleByName(roleName);
		RoleDto roleDto = mm.map(role, RoleDto.class);
		return roleDto;
	}

	@Override
	public void deleteRole(int roleId) {
		repo.deleteById(roleId);
	}

	@Override
	public void deleteAllRoles() {
		repo.deleteAll();
	}

	@Override
	public void udateRole(RoleDto roleDto) {
		Role role = mm.map(roleDto, Role.class);
		repo.save(role);
	}
	
	

}
