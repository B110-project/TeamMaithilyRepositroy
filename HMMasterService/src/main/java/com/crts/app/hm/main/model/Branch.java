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
	private long branchContactNo;
	private int branchStatus;
	@OneToOne(cascade = CascadeType.ALL)
	private District district;
	@OneToOne(cascade = CascadeType.ALL)
	private Address branchAddress;
	@OneToOne(cascade = CascadeType.ALL)
	private BranchType branchType;
	
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
	public long getBranchContactNo() {
		return branchContactNo;
	}
	public void setBranchContactNo(long branchContactNo) {
		this.branchContactNo = branchContactNo;
	}
	public int getBranchStatus() {
		return branchStatus;
	}
	public void setBranchStatus(int branchStatus) {
		this.branchStatus = branchStatus;
	}
	public District getDistrict() {
		return district;
	}
	public void setDistrict(District district) {
		this.district = district;
	}
	public Address getBranchAddress() {
		return branchAddress;
	}
	public void setBranchAddress(Address branchAddress) {
		this.branchAddress = branchAddress;
	}
	public BranchType getBranchType() {
		return branchType;
	}
	public void setBranchType(BranchType branchType) {
		this.branchType = branchType;
	}
	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", branchName=" + branchName + ", branchCode=" + branchCode
				+ ", branchContactNo=" + branchContactNo + ", branchStatus=" + branchStatus + ", district=" + district
				+ ", branchAddress=" + branchAddress + ", branchType=" + branchType + "]";
	}
	
}
