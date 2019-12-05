package com.crts.app.hm.main.model;

public class BusinessDetails 
{
	private int businessDetailsId;
	private double annualIncome;
	private String firmName;
	private double otherIncome;
	private String registrationNo;
	private String firmType;
	private Address firmAddress;
	
	
	public int getBusinessDetailsId() {
		return businessDetailsId;
	}
	public void setBusinessDetailsId(int businessDetailsId) {
		this.businessDetailsId = businessDetailsId;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getFirmName() {
		return firmName;
	}
	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}
	public double getOtherIncome() {
		return otherIncome;
	}
	public void setOtherIncome(double otherIncome) {
		this.otherIncome = otherIncome;
	}
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getFirmType() {
		return firmType;
	}
	public void setFirmType(String firmType) {
		this.firmType = firmType;
	}
	public Address getFirmAddress() {
		return firmAddress;
	}
	public void setFirmAddress(Address firmAddress) {
		this.firmAddress = firmAddress;
	}
	@Override
	public String toString() {
		return "BusinessDetails [businessDetailsId=" + businessDetailsId + ", annualIncome=" + annualIncome
				+ ", firmName=" + firmName + ", otherIncome=" + otherIncome + ", registrationNo=" + registrationNo
				+ ", firmType=" + firmType + ", firmAddress=" + firmAddress + "]";
	}
	
	//only checking
	
}
