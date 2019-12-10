package com.crts.app.hm.main.service;

import java.util.List;

import com.crts.app.hm.main.dto.DistrictDto;

public interface IdistrictService {

	public DistrictDto saveDistrict(DistrictDto d);

	public List<DistrictDto> getAllDistricts();

	public DistrictDto getDistrictById(int districtId);

	public DistrictDto getDistrictByName(String districtName);

	public void deleteAllDistricts();

	public void deleteDistrictById(int districtId);

	public DistrictDto updateDistrictById(DistrictDto d);

	public DistrictDto editDistrictById(int districtId);

}
