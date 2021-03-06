package com.crts .app.hm.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BranchType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
		return "BranchType [branchTypeId=" + branchTypeId + ", branchTypeName=" + branchTypeName + "]";
	}
	
}
