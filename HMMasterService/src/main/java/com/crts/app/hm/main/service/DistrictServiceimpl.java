package com.crts.app.hm.main.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.hm.main.dto.DistrictDto;
import com.crts.app.hm.main.model.District;
import com.crts.app.hm.main.repository.IdistrictRepository;

@Service
public class DistrictServiceimpl implements IdistrictService {

	@Autowired
	IdistrictRepository repo;
	
	ModelMapper m=new ModelMapper();
	
	@Override
	public DistrictDto saveDistrict(DistrictDto d) {
		District dd=m.map(d, District.class);
		District ddd=repo.save(dd);
		DistrictDto dt=m.map(ddd, DistrictDto.class);
		return dt;
	}
	
	@Override
	public List<DistrictDto> getAllDistricts() {
		List<District> ld=(List<District>) repo.findAll();
		List<DistrictDto> ldd=new ArrayList<DistrictDto>();
		for (District o : ld) {
			DistrictDto ad= m.map(o, DistrictDto.class);
			ldd.add(ad);
		}
		return ldd;
	}

	@Override
	public DistrictDto getDistrictById(int districtId) {

		District d=repo.findById(districtId).get();
		DistrictDto dt=m.map(d, DistrictDto.class);
		return dt;
	}

	@Override
	public DistrictDto getDistrictByName(String districtName) {
		District d=repo.findBydistrictName(districtName);
		DistrictDto dt=m.map(d, DistrictDto.class);
		return dt;
	}

	@Override
	public void deleteAllDistricts() {
		repo.deleteAll();
		
	}

	@Override
	public void deleteDistrictById(int districtId) {
		repo.deleteById(districtId);
		
	}

	@Override
	public DistrictDto updateDistrictById(DistrictDto d) {
		District dd=m.map(d, District.class);
		District ddd=repo.save(dd);
		DistrictDto dt=m.map(ddd, DistrictDto.class);
		
		return dt;
	}

	@Override
	public DistrictDto editDistrictById(int districtId) {
		return null;
	}

}
