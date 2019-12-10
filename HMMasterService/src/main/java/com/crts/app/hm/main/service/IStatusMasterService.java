package com.crts.app.hm.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crts.app.hm.main.dto.StatusMasterDto;

@Service
public interface IStatusMasterService {

	public void saveStatus(StatusMasterDto statusMasterDto);

	public List<StatusMasterDto> getAllStatus();

	public StatusMasterDto getStatusById(int statusId);

	public void deleteAllStatus();

	public void deleteStatusById(int statusId);

	public StatusMasterDto getStatusByName(String statusName);

	
	 
	
}
