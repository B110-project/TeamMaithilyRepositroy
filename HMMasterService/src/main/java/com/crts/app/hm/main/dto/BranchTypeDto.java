package com.crts.app.hm.main.dto;

public class BranchTypeDto {
	private int branchTypeId;
	private String branchTypeName;
	
	public int getBranchTypeId() {
		return branchTypeId;
	}
	public void setBranchTypeId(int branchTypeId) {
		this.branchTypeId = branchTypeId;
	}
	public String getBranchTypeName() {
		return branchTypeName;
	}
	public void setBranchTypeName(String branchTypeName) {
		this.branchTypeName = branchTypeName;
	}
	@Override
	public String toString() {
		return "BranchTypeDto [branchTypeId=" + branchTypeId + ", branchTypeName=" + branchTypeName + "]";
	}
}
