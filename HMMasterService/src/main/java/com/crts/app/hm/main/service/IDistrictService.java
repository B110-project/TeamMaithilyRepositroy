package com.crts.app.hm.main.service;

import java.util.List;

import com.crts.app.hm.main.dto.DistrictDto;

public interface IDistrictService {

	public void saveDistrict(DistrictDto districtDto);

	public List<DistrictDto> getAllDistricts();

	public DistrictDto getDistrictById(int districtId);

	public DistrictDto getDistrictByName(String districtName);

	public void deleteAllDistricts();

	public void deleteDistrictById(int districtId);

	public void updateDistrictById(DistrictDto districtDto);

	public DistrictDto editDistrictById(int districtId);

}
