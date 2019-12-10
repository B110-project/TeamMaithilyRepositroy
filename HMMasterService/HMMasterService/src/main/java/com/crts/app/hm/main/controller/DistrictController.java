package com.crts.app.hm.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.hm.main.dto.DistrictDto;
import com.crts.app.hm.main.service.IdistrictService;

@CrossOrigin
@RestController
public class DistrictController {
	
	@Autowired
	IdistrictService ser;
	
	@RequestMapping("/regDistrict")
	public DistrictDto saveDistrict(@RequestBody DistrictDto d) {
		DistrictDto dt=ser.saveDistrict(d);
		return dt;
		
	}
	
	@RequestMapping("/getAllDistricts")
	public List<DistrictDto> getAllDistricts() {
		
		List<DistrictDto> d1 =ser.getAllDistricts();
		return d1;
		
	}
	
	@RequestMapping("/getDistrictById/{districtId}")
	public DistrictDto getDistrictById(@PathVariable int districtId) {
		
		DistrictDto dt=ser.getDistrictById(districtId);
		return dt;
		
	}

	@RequestMapping("/getDistrictByName/{districtName}")
	public DistrictDto getDistrictByName(@PathVariable String districtName) {
		DistrictDto dt=ser.getDistrictByName(districtName);
		return dt;
		
	}

	@RequestMapping("/deleteAllDistricts")
	public List<DistrictDto> deleteAllDistricts() {
		
		ser.deleteAllDistricts();
		List<DistrictDto> d1 =ser.getAllDistricts();
		return d1;
		
	}
	
	@RequestMapping("/deleteDistrictById/{districtId}")
	public List<DistrictDto> deleteDistrictById(@PathVariable int districtId) {
		
		ser.deleteDistrictById(districtId);
		List<DistrictDto> d1 =ser.getAllDistricts();
		return d1;
		
	}
	
	@RequestMapping("/editDistrictById/{districtId}")
	public DistrictDto editDistrictById(@PathVariable int districtId) {
		
		DistrictDto dt=ser.getDistrictById(districtId);
		return dt;
		
	}
	
	@RequestMapping("/updateDistrict")
	public DistrictDto updateDistrictById(@RequestBody DistrictDto d) {
		
		DistrictDto dt=ser.updateDistrictById(d);
		return dt;
		
	}

	
}
