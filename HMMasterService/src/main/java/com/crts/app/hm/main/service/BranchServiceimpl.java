package com.crts.app.hm.main.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.hm.main.dto.BranchDto;
import com.crts.app.hm.main.model.Branch;
import com.crts.app.hm.main.repository.IBranchRepository;

@Service
public class BranchServiceimpl implements IBranchService {
	ModelMapper mm1 = new ModelMapper();

	@Autowired
	IBranchRepository br;

	@Override
	public void saveBranch(BranchDto branchName) {
		Branch b = mm1.map(branchName, Branch.class);
		br.save(b);

	}

	@Override
	public List<BranchDto> getAllBranches() {
		List<Branch> bd = (List<Branch>) br.findAll();
		List<BranchDto> list = new ArrayList<BranchDto>();
		for (Branch b : bd) {
			BranchDto b1 = mm1.map(b, BranchDto.class);
			list.add(b1);
		}
		return list;
	}

	@Override
	public BranchDto getBranchById(int branchId) {
		Branch branch = br.findById(branchId).get();
		BranchDto bd2 = mm1.map(branch, BranchDto.class);
		return bd2;
	}

	@Override
	public BranchDto getBranchByName(String branchName) {
		Branch branch = br.findByName(branchName);
		BranchDto branchdto = mm1.map(branch, BranchDto.class);
		return branchdto;
	}

	@Override
	public void deleteAllBranches() {
		br.deleteAll();
	}

	@Override
	public void deleteBranchById(int branchId) {
		br.deleteById(branchId);
	}

	@Override
	public BranchDto editBranchById(int branchId) {
		Branch branch = br.findById(branchId).get();
		BranchDto branchDto = mm1.map(branch, BranchDto.class);

		return branchDto;
	}

	@Override
	public BranchDto updateBranchById(int branchId) {
		Branch branch = mm1.map(branchId, Branch.class);
		Branch branch1 = br.save(branch);
		BranchDto branchdto = mm1.map(branch1, BranchDto.class);
		return branchdto;
	}

}
