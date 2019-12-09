package com.crts.app.hm.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Branch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int branchId;
	private String branchName;
	private int branchCode;
	private int stateCode;
	private int districtCode;
	@OneToOne(cascade =CascadeType.ALL )
	private StatusMaster branchStatus;
	@OneToOne(cascade = CascadeType.ALL)
	private Address branchAddress;
	private long branchContactNo;

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	public int getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(int districtCode) {
		this.districtCode = districtCode;
	}

	public StatusMaster getBranchStatus() {
		return branchStatus;
	}

	public void setBranchStatus(StatusMaster branchStatus) {
		this.branchStatus = branchStatus;
	}

	public Address getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(Address branchAddress) {
		this.branchAddress = branchAddress;
	}

	public long getBranchContactNo() {
		return branchContactNo;
	}

	public void setBranchContactNo(long branchContactNo) {
		this.branchContactNo = branchContactNo;
	}

	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", branchName=" + branchName + ", branchCode=" + branchCode
				+ ", stateCode=" + stateCode + ", districtCode=" + districtCode + ", branchStatus=" + branchStatus
				+ ", branchAddress=" + branchAddress + ", branchContactNo=" + branchContactNo + "]";
	}

}
