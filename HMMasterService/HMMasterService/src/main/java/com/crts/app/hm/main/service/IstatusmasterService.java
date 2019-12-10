package com.crts.app.hm.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crts.app.hm.main.dto.StatusMasterDto;

@Service
public interface IstatusmasterService {

	public StatusMasterDto saveStatusMaster(StatusMasterDto smd);

	public List<StatusMasterDto> getAllStatusMaster();

	public StatusMasterDto getStatusMasterById(int statusId);

	public void deleteAllStatusMaster();

	public void deleteStatusMasterById(int statusId);

	public StatusMasterDto editStatusMasterById(int statusId);

	public void updateStatusMasterById(StatusMasterDto d);

	public StatusMasterDto getStatusMasterByName(String statusName);

	
	 
	
}
