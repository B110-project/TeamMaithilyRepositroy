package com.crts.app.hm.main.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.hm.main.dto.StateDto;
import com.crts.app.hm.main.model.State;
import com.crts.app.hm.main.repository.IstateRepository;

@Service
public class StateServiceimpl implements IstateService {

	ModelMapper mm = new ModelMapper();

	@Autowired
	IstateRepository sr;

	@Override
	public StateDto saveState(StateDto stateName) {
		State s=mm.map(stateName, State.class);
		State si=sr.save(s);
		StateDto sd=mm.map(si, StateDto.class);
		return sd;
	}

	@Override
	public List<StateDto> getAllState() {

		List<State> sd = (List<State>) sr.findAll();
		List<StateDto> lsd = new ArrayList<StateDto>();
		for (State s : sd) {
			StateDto d = mm.map(s, StateDto.class);
			lsd.add(d);
		}

		return lsd;

	}

	@Override
	public StateDto getStateById(int stateId) {

		State state = sr.findById(stateId).get();
		StateDto sd = mm.map(state, StateDto.class);
		return sd;

//		return sr.findById(stateId).get();

	}

	@Override
	public StateDto getStateByName(String stateName) {

		State state = sr.findByName(stateName);
		StateDto sd1 = mm.map(state, StateDto.class);
		return sd1;

	}

	@Override
	public void deleteAllState() {

		sr.deleteAll();

	}

	@Override
	public void deleteState(int stateId) {

		sr.deleteById(stateId);
	}

	@Override
	public StateDto updateState(int stateId) {

		State s = mm.map(stateId, State.class);
		State s1 = sr.save(s);

		StateDto s3 = mm.map(s1, StateDto.class);

		return s3;

	}

	@Override
	public StateDto editState(int stateId) {
		State s = sr.findById(stateId).get();

		StateDto s2 = mm.map(s, StateDto.class);

		return s2;

	}

}
