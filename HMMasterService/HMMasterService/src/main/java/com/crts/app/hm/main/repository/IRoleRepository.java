package com.crts.app.hm.main.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.hm.main.dto.RoleDto;
import com.crts.app.hm.main.model.Role;

@Repository
public interface IRoleRepository extends CrudRepository<Role, Integer> {

	@Query ("select r from  Role r where r.roleName=?1") 
	public RoleDto getRoleByName(String roleName);
}
