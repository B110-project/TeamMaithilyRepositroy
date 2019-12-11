package com.crts .app.hm.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BranchType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int branchTypeId;;
	private String regional;
	private String headOffice;
	private int branchTypeStatus;

	public int getBranchTypeId() {
		return branchTypeId;
	}

	public void setBranchTypeId(int branchTypeId) {
		this.branchTypeId = branchTypeId;
	}

	public String getRegional() {
		return regional;
	}

	public void setRegional(String regional) {
		this.regional = regional;
	}

	public String getHeadOffice() {
		return headOffice;
	}

	public void setHeadOffice(String headOffice) {
		this.headOffice = headOffice;
	}

	public int getBranchTypeStatus() {
		return branchTypeStatus;
	}

	public void setBranchTypeStatus(int branchTypeStatus) {
		this.branchTypeStatus = branchTypeStatus;
	}

	@Override
	public String toString() {
		return "BranchType [branchTypeId=" + branchTypeId + ", regional=" + regional + ", headOffice=" + headOffice
				+ ", branchTypeStatus=" + branchTypeStatus + "]";
	}

	

}
