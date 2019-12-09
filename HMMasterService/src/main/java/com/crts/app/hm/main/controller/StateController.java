package com.crts.app.hm.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.hm.main.dto.StateDto;

import com.crts.app.hm.main.service.IstateService;

@RestController
public class StateController 
{
	@Autowired
	IstateService ss;
	
	@RequestMapping(value = "/regState", method = RequestMethod.POST,produces = "application/json" )
	public StateDto saveStateName(@RequestBody StateDto s)
	{
		ss.saveState(s);
		return null;
	
	}
	
	@RequestMapping(value="/allState", method = RequestMethod.GET, consumes = "application/json")
	public List<StateDto> getData()
	{
		List<StateDto> lst= ss.getAllState();
		return lst;
	}
	
	@RequestMapping(value = "/deleteAll", method=RequestMethod.DELETE)
	public List<StateDto> deleteAllState()
	{
		ss.deleteAllState();
		List<StateDto> lst=ss.getAllState();
		return lst;
	}
	
	@RequestMapping(value = "/delete/{stateId}", method=RequestMethod.DELETE)
	public List<StateDto> deleteState(@RequestParam int stateId)
	{
		getData();
		
		ss.deleteState(stateId);
		List<StateDto> lst=ss.getAllState();
		return lst;
	}
	
	@RequestMapping(value = "/getStateById/{stateId}" )
	public StateDto getStateById(@PathVariable int stateId)
	{
		
		StateDto lst=ss.getStateById(stateId);
		return lst;
		
	}
	
	@RequestMapping(value = "/getStateByName" )
	public StateDto getStateByName(@RequestParam String stateName)
	{
		
		StateDto lst=(StateDto) ss.getStateByName(stateName);
		return lst;
		
	}

	@RequestMapping (value = "/editStateById/{stateId}")
	public StateDto editState(@PathVariable int stateId )
	{
		StateDto edit=ss.editState(stateId);
		
		return edit;
		
	}
	
	@RequestMapping(value = "/updateStateById")
	public StateDto update(@RequestBody StateDto st )
	{
		StateDto sf = ss.saveState(st);
		return sf;
		
		
	}
	
}
