package com.crts.app.hm.main.model;

public class PropertyDealerDetails {

	private int propertyDealerId;
	private String dealerName;
	private long dealerMobileNo;
	private String dealerEmailId;
	private String dealerAccountNo;
	private String dealerAccountType;
	private Address dealerAddress;
	private String dealerCode;
	public int getPropertyDealerId() {
		return propertyDealerId;
	}
	public void setPropertyDealerId(int propertyDealerId) {
		this.propertyDealerId = propertyDealerId;
	}
	public String getDealerName() {
		return dealerName;
	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	public long getDealerMobileNo() {
		return dealerMobileNo;
	}
	public void setDealerMobileNo(long dealerMobileNo) {
		this.dealerMobileNo = dealerMobileNo;
	}
	public String getDealerEmailId() {
		return dealerEmailId;
	}
	public void setDealerEmailId(String dealerEmailId) {
		this.dealerEmailId = dealerEmailId;
	}
	public String getDealerAccountNo() {
		return dealerAccountNo;
	}
	public void setDealerAccountNo(String dealerAccountNo) {
		this.dealerAccountNo = dealerAccountNo;
	}
	public String getDealerAccountType() {
		return dealerAccountType;
	}
	public void setDealerAccountType(String dealerAccountType) {
		this.dealerAccountType = dealerAccountType;
	}
	public Address getDealerAddress() {
		return dealerAddress;
	}
	public void setDealerAddress(Address dealerAddress) {
		this.dealerAddress = dealerAddress;
	}
	public String getDealerCode() {
		return dealerCode;
	}
	public void setDealerCode(String dealerCode) {
		this.dealerCode = dealerCode;
	}
	@Override
	public String toString() {
		return "PropertyDealerDetails [propertyDealerId=" + propertyDealerId + ", dealerName=" + dealerName
				+ ", dealerMobileNo=" + dealerMobileNo + ", dealerEmailId=" + dealerEmailId + ", dealerAccountNo="
				+ dealerAccountNo + ", dealerAccountType=" + dealerAccountType + ", dealerAddress=" + dealerAddress
				+ ", dealerCode=" + dealerCode + "]";
	}
	
	
}
