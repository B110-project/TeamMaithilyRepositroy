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
	public RoleDto saveRole(RoleDto rr) {
		Role r=mm.map(rr, Role.class);
		Role re=repo.save(r);
		RoleDto ree=mm.map(re, RoleDto.class);
		return ree;
	}
	
	@Override
	public List<RoleDto> getAllRoles() {

		List<Role> list = (List<Role>) repo.findAll();
		List<RoleDto> roledto = new ArrayList<RoleDto>();
		for (Role l : list) {
			RoleDto role2 = mm.map(l, RoleDto.class);
			roledto.add(role2);
		}
		return roledto;
	}

	@Override
	public RoleDto getRoleById(int roleId) {
		Role roleById = repo.findById(roleId).get();
		RoleDto roleDto = mm.map(roleById, RoleDto.class);

		return roleDto;

	}

	@Override
	public RoleDto getRoleByName(String roleName) {
		repo.getRoleByName(roleName);
		RoleDto getRoleByName = mm.map(roleName, RoleDto.class);
		return getRoleByName;

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
	public void udateRoleById(RoleDto rr) {
		Role r=mm.map(rr, Role.class);
		repo.save(r);
		
	}
	
	

}
