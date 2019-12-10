package com.crts.app.hm.main.service;

import java.util.List;

import com.crts.app.hm.main.dto.StateDto;

public interface IstateService {
	
	  public StateDto saveState(StateDto s);
	  
	  public List<StateDto> getAllState();
	  
	  public StateDto getStateById(int stateId); 
	  
	  public StateDto getStateByName(String stateName); 
	  
	  public void deleteAllState(); 
	  
	  public void deleteStateById(int stateId);
	  
	  public StateDto updateStateById(int stateId);
	 
	  public StateDto editStateById(int stateId);

}
