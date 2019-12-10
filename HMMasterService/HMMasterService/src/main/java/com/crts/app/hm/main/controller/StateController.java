package com.crts.app.hm.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.hm.main.dto.StateDto;

import com.crts.app.hm.main.service.IstateService;

@RestController
public class StateController 
{
	@Autowired
	IstateService ser;
	
	@RequestMapping(value = "/regState", method = RequestMethod.POST,produces = "application/json" )
	public StateDto saveState(@RequestBody StateDto s)
	{
		StateDto ss=ser.saveState(s);
		return ss;
	
	}
	
	@RequestMapping(value = "/getStateById/{stateId}" )
	public StateDto getStateById(@PathVariable int stateId)
	{
		
		StateDto lst=ser.getStateById(stateId);
		return lst;
		
	}
	
	@RequestMapping(value="/getAllState", method = RequestMethod.GET, consumes = "application/json")
	public List<StateDto> getAllState()
	{
		List<StateDto> lst= ser.getAllState();
		return lst;
	}
	
	@RequestMapping(value = "/deleteStateById/{stateId}", method=RequestMethod.DELETE)
	public List<StateDto> deleteStateById(@PathVariable int stateId)
	{	
		ser.deleteStateById(stateId);
		List<StateDto> lst=ser.getAllState();
		return lst;
	}
	
	@RequestMapping(value = "/getStateByName/{stateName}" )
	public StateDto getStateByName(@PathVariable String stateName)
	{
		
		StateDto lst=(StateDto) ser.getStateByName(stateName);
		return lst;
		
	}
	
	@RequestMapping(value = "/deleteAllState", method=RequestMethod.DELETE)
	public List<StateDto> deleteAllState()
	{
		ser.deleteAllState();
		List<StateDto> lst=ser.getAllState();
		return lst;
	}
	
	@RequestMapping (value = "/editStateById/{stateId}")
	public StateDto editStateById(@PathVariable int stateId )
	{
		StateDto edit=ser.editStateById(stateId);
		
		return edit;
		
	}
	
	@RequestMapping(value = "/updateStateById")
	public StateDto updateStateById(@RequestBody StateDto st )
	{
		StateDto sf = ser.saveState(st);
		return sf;
		
		
	}
	
}
