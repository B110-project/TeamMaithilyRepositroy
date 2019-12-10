package com.crts.app.hm.main.service;

import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crts.app.hm.main.dto.StatusMasterDto;
import com.crts.app.hm.main.model.StatusMaster;
import com.crts.app.hm.main.repository.IstatusmasterRepository;

@Service
public class StatusMasterServiceImpl implements IstatusmasterService {

	@Autowired
	IstatusmasterRepository ism;

	ModelMapper m = new ModelMapper();

	@Override
	public StatusMasterDto saveStatusMaster(StatusMasterDto s) {
		StatusMaster ss = m.map(s, StatusMaster.class);
		StatusMaster ddd = ism.save(ss);
		StatusMasterDto dt = m.map(ddd, StatusMasterDto.class);

		return dt;
	}

	@Override
	public List<StatusMasterDto> getAllStatusMaster() {
		// TODO Auto-generated method stub

		List<StatusMaster> sm1 = (List<StatusMaster>) ism.findAll();
		List<StatusMasterDto> smd = new ArrayList<>();

		for (StatusMaster sm : sm1) {
			StatusMasterDto smd2 = m.map(sm, StatusMasterDto.class);
			smd.add(smd2);

		}
		return smd;
	}

	@Override
	public StatusMasterDto getStatusMasterById(int statusId) {

		StatusMaster sm = ism.findById(statusId).get();

		StatusMasterDto smd = m.map(sm, StatusMasterDto.class);

		return smd;
	}

	@Override
	public void deleteAllStatusMaster() {
		// TODO Auto-generated method stub
		ism.deleteAll();
	}

	@Override
	public void deleteStatusMasterById(int statusId) {

		ism.deleteById(statusId);

	}

	@Override
	public void updateStatusMasterById(StatusMasterDto d) {

		StatusMaster sm = m.map(d, StatusMaster.class);

		ism.save(sm);

	}

	@Override
	public StatusMasterDto editStatusMasterById(int statusId) {

		return null;
	}

	@Override
	public StatusMasterDto getStatusMasterByName(String statusName) {
	
		StatusMaster sm = ism.findBystatusmasterName(statusName);
		StatusMasterDto smd = m.map(sm, StatusMasterDto.class);

		return smd;

	}

}