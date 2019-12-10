package com.crts.app.hm.main.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.hm.main.model.Branch;

@Repository
public interface IBranchRepository extends CrudRepository<Branch, Integer>
{
	@Query("select b from Branch b where b.branchName=?1")
	public Branch findByName(String branchName);


}
