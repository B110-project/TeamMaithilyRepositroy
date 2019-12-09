package com.crts.app.hm.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
		
		return ser.saveDistrict(d);
		
	}
	
	@RequestMapping("/getAllDistricts")
	public List<DistrictDto> getAllDistricts() {
		
		List<DistrictDto> d1 =ser.getAllDistricts();
		return d1;
		
	}
	
	@RequestMapping("/getDistrictById/{id}")
	public DistrictDto getDistrictById(@PathVariable int id) {
		
		DistrictDto dt=ser.getDistrictById(id);
		return dt;
		
	}

	@RequestMapping("/getDistrictByName/{ame}")
	public DistrictDto getDistrictByName(@RequestParam String a) {
		DistrictDto dt=ser.getDistrictByName(a);
		return dt;
		
	}

	@RequestMapping("/deleteAllDistricts")
	public List<DistrictDto> deleteAllDistricts() {
		
		ser.deleteAllDistricts();
		List<DistrictDto> d1 =ser.getAllDistricts();
		return d1;
		
	}
	
	@RequestMapping("/deleteDistrictById/{id}")
	public List<DistrictDto> deleteDistrictById(@PathVariable int id) {
		
		ser.deleteDistrictById(id);
		List<DistrictDto> d1 =ser.getAllDistricts();
		return d1;
		
	}
	
	@RequestMapping("/editDistrictById/{id}")
	public DistrictDto editDistrictById(@PathVariable int id) {
		
		DistrictDto dt=ser.getDistrictById(id);
		return dt;
		
	}
	
	@RequestMapping("/updateDistrictById/{id}")
	public DistrictDto updateDistrictById(@RequestBody DistrictDto d) {
		
		DistrictDto dt=ser.updateDistrictById(d);
		return dt;
		
	}

	
}
