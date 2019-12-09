package com.crts.app.hm.main.service;

import java.util.List;

import com.crts.app.hm.main.dto.StateDto;


public interface IstateService 
{
	  public StateDto saveState(StateDto s);
	  public List<StateDto> getAllState();
	  public StateDto getStateById(int stateId); 
	  public StateDto getStateByName(String stateName); 
	  public void deleteAllState(); 
	  public void deleteState(int stateId);
	 public StateDto updateState(int stateId);
	 public StateDto editState(int stateId);

}
