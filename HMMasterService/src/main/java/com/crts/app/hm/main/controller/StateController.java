package com.crts.app.hm.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.hm.main.dto.StateDto;
import com.crts.app.hm.main.service.IStateService;

@RestController
public class StateController {
	@Autowired
	IStateService ser;

	@RequestMapping(value = "/saveState", method = RequestMethod.POST, produces = "application/json")
	public String saveState(@RequestBody StateDto stateDto) {
		ser.saveState(stateDto);
		return "State Saved Successfully";

	}

	@RequestMapping(value = "/getStateById/{stateId}")
	public StateDto getStateById(@PathVariable int stateId) {
		StateDto stateDto = ser.getStateById(stateId);
		return stateDto;
	}

	@RequestMapping(value = "/getAllStates", method = RequestMethod.GET, consumes = "application/json")
	public List<StateDto> getAllStates() {
		List<StateDto> stateDtoList = ser.getAllStates();
		return stateDtoList;
	}

	@RequestMapping(value = "/deleteStateById/{stateId}", method = RequestMethod.DELETE)
	public List<StateDto> deleteStateById(@PathVariable int stateId) {
		ser.deleteStateById(stateId);
		List<StateDto> stateDtoList = ser.getAllStates();
		return stateDtoList;
	}

	@RequestMapping(value = "/getStateByName/{stateName}")
	public StateDto getStateByName(@PathVariable String stateName) {
		StateDto stateDto = ser.getStateByName(stateName);
		return stateDto;
	}

	@RequestMapping(value = "/deleteAllStates", method = RequestMethod.DELETE)
	public String deleteAllStates() {
		ser.deleteAllStates();
		return "All States Deleted Successfully";
	}

	@RequestMapping(value = "/editStateById/{stateId}")
	public StateDto editStateById(@PathVariable int stateId) {
		StateDto stateDto = ser.getStateById(stateId);
		return stateDto;
	}

	@RequestMapping(value = "/updateState")
	public List<StateDto> updateState(@RequestBody StateDto stateDto) {
		ser.saveState(stateDto);
		List<StateDto> stateDtoList = ser.getAllStates();
		return stateDtoList;

	}

}
