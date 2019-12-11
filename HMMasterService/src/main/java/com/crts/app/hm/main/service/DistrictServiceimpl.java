package com.crts.app.hm.main.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.hm.main.dto.DistrictDto;
import com.crts.app.hm.main.model.District;
import com.crts.app.hm.main.repository.IDistrictRepository;

@Service
public class DistrictServiceimpl implements IDistrictService {

	@Autowired
	IDistrictRepository repo;
	
	ModelMapper m = new ModelMapper();
	
	@Override
	public void saveDistrict(DistrictDto distriactDto) {
		District district = m.map(distriactDto, District.class);
		repo.save(district);
	}
	
	@Override
	public List<DistrictDto> getAllDistricts() {
		List<District> districtList=(List<District>) repo.findAll();
		List<DistrictDto> districtDtoList= new ArrayList<DistrictDto>();
		for (District district : districtList) {
			DistrictDto districtDto= m.map(district, DistrictDto.class);
			districtDtoList.add(districtDto);
		}
		return districtDtoList;
	}

	@Override
	public DistrictDto getDistrictById(int districtId) {
		District district=repo.findById(districtId).get();
		DistrictDto districtDto=m.map(district, DistrictDto.class);
		return districtDto;
	}

	@Override
	public DistrictDto getDistrictByName(String districtName) {
		District district=repo.findBydistrictName(districtName);
		DistrictDto districtDto=m.map(district, DistrictDto.class);
		return districtDto;
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
	public void updateDistrictById(DistrictDto districtDto) {
		District district = m.map(districtDto, District.class);
		repo.save(district);
	}

	@Override
	public DistrictDto editDistrictById(int districtId) {
		District district=repo.findById(districtId).get();
		DistrictDto districtDto=m.map(district, DistrictDto.class);
		return districtDto;
	}

}
