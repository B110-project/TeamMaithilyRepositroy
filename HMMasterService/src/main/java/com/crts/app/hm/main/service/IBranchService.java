package com.crts.app.hm.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crts.app.hm.main.dto.BranchDto;

@Service
public interface IBranchService 
{
	 public void saveBranch(BranchDto branchDto);
	 public List<BranchDto> getAllBranches();
	 public BranchDto getBranchById(int branchId);
	 public BranchDto getBranchByName(String branchName);
	 public void deleteAllBranches();
	 public void deleteBranchById(int branchId);
	 public BranchDto editBranchById(int branchId);
	 public BranchDto updateBranchById(int branchId);
}
