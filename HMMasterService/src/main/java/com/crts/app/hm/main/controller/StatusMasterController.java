package com.crts.app.hm.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.hm.main.dto.StatusMasterDto;
import com.crts.app.hm.main.service.IStatusMasterService;

@CrossOrigin
@RestController
public class StatusMasterController {

	@Autowired
	IStatusMasterService ser;

	@RequestMapping("/saveStatus")
	public String saveStatus(@RequestBody StatusMasterDto statusMasterDto) {
		ser.saveStatus(statusMasterDto);
		return "Status Saved Successfully";
	}

	@RequestMapping("/getAllStatus")
	public List<StatusMasterDto> getAllStatus() {
		List<StatusMasterDto> statusMasterDto = ser.getAllStatus();
		return statusMasterDto;
	}

	@RequestMapping("/getStatusById/{statusId}")
	public StatusMasterDto getStatusById(@PathVariable int statusId) {
		StatusMasterDto statusMasterDto = ser.getStatusById(statusId);
		return statusMasterDto;
	}

	@RequestMapping("/deleteAllStatus")
	public String deleteAllStatus() {
		ser.deleteAllStatus();
		return "All Status Deleted Successfully";
	}

	@RequestMapping("/deleteStatusById/{statusId}")
	public List<StatusMasterDto> deleteStatusById(@PathVariable int statusId) {
		ser.deleteStatusById(statusId);
		List<StatusMasterDto> statusMasterDtoList = ser.getAllStatus();
		return statusMasterDtoList;

	}

	@RequestMapping("editStatusById/{statusId}")
	public StatusMasterDto editStatusById(@PathVariable int statusId) {
		StatusMasterDto statusMasterDto = ser.getStatusById(statusId);
		return statusMasterDto;

	}

	@RequestMapping("updateStatus")
	public List<StatusMasterDto> updateStatusMasterById(@RequestBody StatusMasterDto statusMasterDto)
	{		
		ser.saveStatus(statusMasterDto);
		 List<StatusMasterDto> statusMasterDtoList = ser.getAllStatus();
			return statusMasterDtoList;
	}

	@RequestMapping("/getStatusByName/{statusName}")
	public StatusMasterDto getDistrictByName(@PathVariable String statusName) {
		StatusMasterDto statusMasterDto = ser.getStatusByName(statusName);
		return statusMasterDto;
	}


}