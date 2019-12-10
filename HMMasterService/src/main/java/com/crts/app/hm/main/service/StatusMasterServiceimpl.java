package com.crts.app.hm.main.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.hm.main.dto.StatusMasterDto;
import com.crts.app.hm.main.model.StatusMaster;
import com.crts.app.hm.main.repository.IStatusMasterRepository;

@Service
public class StatusMasterServiceimpl implements IStatusMasterService {

	@Autowired
	IStatusMasterRepository repo;

	ModelMapper m = new ModelMapper();

	@Override
	public void saveStatus(StatusMasterDto statusMasterDto) {
		StatusMaster statusMaster = m.map(statusMasterDto, StatusMaster.class);
		repo.save(statusMaster);
	}

	@Override
	public List<StatusMasterDto> getAllStatus() {
		List<StatusMaster> statusMasterList = (List<StatusMaster>) repo.findAll();
		List<StatusMasterDto> statusMasterDtoList = new ArrayList<>();
		for (StatusMaster statusMaster : statusMasterList) {
			StatusMasterDto statusMasterDto = m.map(statusMaster, StatusMasterDto.class);
			statusMasterDtoList.add(statusMasterDto);
		}
		return statusMasterDtoList;
	}

	@Override
	public StatusMasterDto getStatusById(int statusId) {
		StatusMaster statusMaster = repo.findById(statusId).get();
		StatusMasterDto statusMasterDto = m.map(statusMaster, StatusMasterDto.class);
		return statusMasterDto;
	}

	@Override
	public void deleteAllStatus() {
		repo.deleteAll();
	}

	@Override
	public void deleteStatusById(int statusId) {
		repo.deleteById(statusId);
	}

	@Override
	public StatusMasterDto getStatusByName(String statusName) {

		StatusMaster statusMaster = repo.findBystatusmasterName(statusName);
		StatusMasterDto statusMasterDto = m.map(statusMaster, StatusMasterDto.class);
		return statusMasterDto;
	}

}