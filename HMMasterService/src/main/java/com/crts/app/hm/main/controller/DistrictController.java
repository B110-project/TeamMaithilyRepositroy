package com.crts.app.hm.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.hm.main.dto.DistrictDto;
import com.crts.app.hm.main.service.IDistrictService;

@CrossOrigin
@RestController
public class DistrictController {
	
	@Autowired
	IDistrictService ser;
	
	@RequestMapping("/saveDistrict")
	public String saveDistrict(@RequestBody DistrictDto districtDto) {
		ser.saveDistrict(districtDto);
		return "District Saved Successfully";	
	}
	
	@RequestMapping("/getAllDistricts")
	public List<DistrictDto> getAllDistricts() {
		List<DistrictDto> districtDtoList =ser.getAllDistricts();
		return districtDtoList;	
	}
	
	@RequestMapping("/getDistrictById/{districtId}")
	public DistrictDto getDistrictById(@PathVariable int districtId) {
		DistrictDto districtDto = ser.getDistrictById(districtId);
		return districtDto;
	}

	@RequestMapping("/getDistrictByName/{districtName}")
	public DistrictDto getDistrictByName(@PathVariable String districtName) {
		DistrictDto districtDto = ser.getDistrictByName(districtName);
		return districtDto;	
	}

	@RequestMapping("/deleteAllDistricts")
	public String deleteAllDistricts() {
		ser.deleteAllDistricts();
		return "All Districts Deleted";		
	}
	
	@RequestMapping("/deleteDistrictById/{districtId}")
	public List<DistrictDto> deleteDistrictById(@PathVariable int districtId) {
		ser.deleteDistrictById(districtId);
		List<DistrictDto> districtDtoList = ser.getAllDistricts();
		return districtDtoList;
	}
	
	@RequestMapping("/editDistrictById/{districtId}")
	public DistrictDto editDistrictById(@PathVariable int districtId) {	
		DistrictDto districtDto = ser.getDistrictById(districtId);
		return districtDto;	
	}
	
	@RequestMapping("/updateDistrict")
	public List<DistrictDto> updateDistrictById(@RequestBody DistrictDto districtDto) {
		ser.saveDistrict(districtDto);
		List<DistrictDto> districtDtoList = ser.getAllDistricts();
		return districtDtoList;
	}

	
}
