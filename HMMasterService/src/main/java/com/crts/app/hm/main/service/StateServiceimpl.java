package com.crts.app.hm.main.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.hm.main.dto.StateDto;
import com.crts.app.hm.main.model.State;
import com.crts.app.hm.main.repository.IStateRepository;

@Service
public class StateServiceimpl implements IStateService {

	ModelMapper mm = new ModelMapper();

	@Autowired
	IStateRepository repo;

	@Override
	public void saveState(StateDto stateDto) {
		State state = mm.map(stateDto, State.class);
		repo.save(state);
	}

	@Override
	public List<StateDto> getAllStates() {
		List<State> stateList = (List<State>) repo.findAll();
		List<StateDto> stateDtoList = new ArrayList<StateDto>();
		for (State state : stateList) {
			StateDto stateDto = mm.map(state, StateDto.class);
			stateDtoList.add(stateDto);
		}
		return stateDtoList;
	}

	@Override
	public StateDto getStateById(int stateId) {
		State state = repo.findById(stateId).get();
		StateDto stateDto = mm.map(state, StateDto.class);
		return stateDto;
	}

	@Override
	public StateDto getStateByName(String stateName) {
		State state = repo.findByName(stateName);
		StateDto stateDto = mm.map(state, StateDto.class);
		return stateDto;
	}

	@Override
	public void deleteAllStates() {
		repo.deleteAll();
	}

	@Override
	public void deleteStateById(int stateId) {
		repo.deleteById(stateId);
	}

}
