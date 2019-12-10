package com.crts.app.hm.main.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.hm.main.model.District;

@Repository
public interface IDistrictRepository extends CrudRepository<District, Integer> {

	@Query("select d from District d where d.districtName=?1")
	public District findBydistrictName(String districtName);

}
