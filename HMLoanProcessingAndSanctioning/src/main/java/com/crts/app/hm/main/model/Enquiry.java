package com.crts.app.hm.main.model;

public class Enquiry
{
	private int enquiryId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String panNo;
	private String aadhaarNo;
	private long mobileNo;
	private String emailId;
	private String gender;
	private String leadNo;
	private int leadStatus;
	private String branchCode;
	private double loanAmount;
	private String loanType;
	private String employmentType;
	private Address address;
	private SalariedDetails salaried;
	private BusinessDetails business;
	public int getEnquiryId() {
		return enquiryId;
	}
	public void setEnquiryId(int enquiryId) {
		this.enquiryId = enquiryId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getAadhaarNo() {
		return aadhaarNo;
	}
	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLeadNo() {
		return leadNo;
	}
	public void setLeadNo(String leadNo) {
		this.leadNo = leadNo;
	}
	public int getLeadStatus() {
		return leadStatus;
	}
	public void setLeadStatus(int leadStatus) {
		this.leadStatus = leadStatus;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getEmploymentType() {
		return employmentType;
	}
	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public SalariedDetails getSalaried() {
		return salaried;
	}
	public void setSalaried(SalariedDetails salaried) {
		this.salaried = salaried;
	}
	public BusinessDetails getBusiness() {
		return business;
	}
	public void setBusiness(BusinessDetails business) {
		this.business = business;
	}
	@Override
	public String toString() {
		return "Enquiry [enquiryId=" + enquiryId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", panNo=" + panNo + ", aadhaarNo=" + aadhaarNo + ", mobileNo=" + mobileNo
				+ ", emailId=" + emailId + ", gender=" + gender + ", leadNo=" + leadNo + ", leadStatus=" + leadStatus
				+ ", branchCode=" + branchCode + ", loanAmount=" + loanAmount + ", loanType=" + loanType
				+ ", employmentType=" + employmentType + ", address=" + address + ", salaried=" + salaried
				+ ", business=" + business + "]";
	}
	
    	

}
