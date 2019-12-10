package com.crts.app.hm.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.hm.main.dto.StatusMasterDto;
import com.crts.app.hm.main.service.IstatusmasterService;

@CrossOrigin
@RestController
public class StatusMasterController {

	@Autowired
	IstatusmasterService sm;

	@RequestMapping("/saveStatusMaster")
	public StatusMasterDto saveStatusMaster(@RequestBody StatusMasterDto s) {
		StatusMasterDto sd = sm.saveStatusMaster(s);
		return sd;
	}

	@RequestMapping("/getAllStatusMaster")
	public List<StatusMasterDto> getAllStatusMaster() {

		List<StatusMasterDto> d1 = sm.getAllStatusMaster();

		return d1;

	}

	@RequestMapping("/getStatusMasterById/{statusId}")
	public StatusMasterDto getStatusMasterById(@PathVariable int statusId) {

		StatusMasterDto smd = sm.getStatusMasterById(statusId);

		return smd;

	}

	@RequestMapping("/deleteAllsm")
	public List<StatusMasterDto> deleteAllStatusMaster() {
		sm.deleteAllStatusMaster();
		List<StatusMasterDto> sm1 = sm.getAllStatusMaster();

		return sm1;
	}

	@RequestMapping("/deleteSmById/{statusId}")
	public List<StatusMasterDto> deleteStatusMasterById(@PathVariable int statusId) {

		sm.deleteStatusMasterById(statusId);

		List<StatusMasterDto> d1 = sm.getAllStatusMaster();
		return d1;

	}

	@RequestMapping("editsmById/{statusId}")
	public StatusMasterDto editStatusMasterById(@PathVariable int statusId) {

		StatusMasterDto smd = sm.getStatusMasterById(statusId);

		return smd;

	}

	@RequestMapping("updateById")
	public List<StatusMasterDto> updateStatusMasterById(@RequestBody StatusMasterDto d)

	{
		
		 sm.updateStatusMasterById(d);
		 List<StatusMasterDto> d1 = sm.getAllStatusMaster();
			return d1;
	}

	@RequestMapping("/getSmByName/{statusName}")
	public StatusMasterDto getDistrictByName(@PathVariable String statusName) {
		StatusMasterDto dt = sm.getStatusMasterByName(statusName);
		return dt;

	}


}