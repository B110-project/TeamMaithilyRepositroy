package com.crts.app.hm.main.service;

import java.util.List;

import com.crts.app.hm.main.dto.BranchDto;


public interface IbranchService 
{
	public BranchDto saveBranch(BranchDto b);
	 public List<BranchDto> getAllBranch();
	 public BranchDto getBranchById(int branchId);
	 public BranchDto getBranchByName(String branchName);
	 public void deleteAllBranch();
	 public void deleteBranchById(int branchId);
	 public BranchDto updateBranchById(int branchId);
	 public BranchDto edutBranchById(int branchId);

}
