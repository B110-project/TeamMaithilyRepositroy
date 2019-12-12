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
	IBranchRepository repo;

	@Override
	public void saveBranch(BranchDto branchDto) {
		Branch branch = mm1.map(branchDto, Branch.class);
		repo.save(branch);

	}

	@Override
	public List<BranchDto> getAllBranches() {
		List<Branch> branchlist = (List<Branch>) repo.findAll();
		List<BranchDto> list = new ArrayList<BranchDto>();
		for (Branch branch : branchlist) {
			BranchDto branchDto = mm1.map(branch, BranchDto.class);
			list.add(branchDto);
		}
		return list;
	}

	@Override
	public BranchDto getBranchById(int branchId) {
		Branch branch = repo.findById(branchId).get();
		BranchDto branchDto2 = mm1.map(branch, BranchDto.class);
		return branchDto2;
	}

	@Override
	public BranchDto getBranchByName(String branchName) {
		Branch branch = repo.findByName(branchName);
		BranchDto branchdto = mm1.map(branch, BranchDto.class);
		return branchdto;
	}

	@Override
	public void deleteAllBranches() {
		repo.deleteAll();
	}

	@Override
	public void deleteBranchById(int branchId) {
		repo.deleteById(branchId);
	}

}
