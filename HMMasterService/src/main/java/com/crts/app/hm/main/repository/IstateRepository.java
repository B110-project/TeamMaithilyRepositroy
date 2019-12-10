package com.crts.app.hm.main.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.hm.main.model.State;

@Repository
public interface IstateRepository extends CrudRepository<State, Integer>
{
	
	@Query("select s from State s where s.stateName=?1")
	public State findByName(String stateName);

}
