package com.crts.app.hm.main.service;

import java.util.List;

import com.crts.app.hm.main.dto.StateDto;

public interface IStateService {
	
	  public void saveState(StateDto stateDto);
	  
	  public List<StateDto> getAllStates();
	  
	  public StateDto getStateById(int stateId); 
	  
	  public StateDto getStateByName(String stateName); 
	  
	  public void deleteAllStates(); 
	  
	  public void deleteStateById(int stateId);
}
