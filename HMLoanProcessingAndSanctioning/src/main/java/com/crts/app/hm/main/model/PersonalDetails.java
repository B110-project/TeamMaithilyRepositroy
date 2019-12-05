package com.crts.app.hm.main.model;

import java.util.List;

public class PersonalDetails {
	private int personalDetailsId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String nameOfFather;
	private String nameOfMother;
	private String dob;
	private String gender;
	private String highestQualification;
	private String religion;
	private String nationality;
	private String aadhaarNo;
	private String panNo;
	private String maritalStatus;
	private String nameOfSpouse;
	private int numberOfChildren;
	private String employmentType;
	private String purposeOfLoan;
	private Address customerAddress;
	private List<PreviousLoanDetails> previousLoans;

	public int getPersonalDetailsId() {
		return personalDetailsId;
	}

	public void setPersonalDetailsId(int personalDetailsId) {
		this.personalDetailsId = personalDetailsId;
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

	public String getNameOfFather() {
		return nameOfFather;
	}

	public void setNameOfFather(String nameOfFather) {
		this.nameOfFather = nameOfFather;
	}

	public String getNameOfMother() {
		return nameOfMother;
	}

	public void setNameOfMother(String nameOfMother) {
		this.nameOfMother = nameOfMother;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHighestQualification() {
		return highestQualification;
	}

	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAadhaarNo() {
		return aadhaarNo;
	}

	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getNameOfSpouse() {
		return nameOfSpouse;
	}

	public void setNameOfSpouse(String nameOfSpouse) {
		this.nameOfSpouse = nameOfSpouse;
	}

	public int getNumberOfChildren() {
		return numberOfChildren;
	}

	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public String getPurposeOfLoan() {
		return purposeOfLoan;
	}

	public void setPurposeOfLoan(String purposeOfLoan) {
		this.purposeOfLoan = purposeOfLoan;
	}

	public Address getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}

	public List<PreviousLoanDetails> getPreviousLoans() {
		return previousLoans;
	}

	public void setPreviousLoans(List<PreviousLoanDetails> previousLoans) {
		this.previousLoans = previousLoans;
	}

	@Override
	public String toString() {
		return "PersonalDetails [personalDetailsId=" + personalDetailsId + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", nameOfFather=" + nameOfFather + ", nameOfMother="
				+ nameOfMother + ", dob=" + dob + ", gender=" + gender + ", highestQualification="
				+ highestQualification + ", religion=" + religion + ", nationality=" + nationality + ", aadhaarNo="
				+ aadhaarNo + ", panNo=" + panNo + ", maritalStatus=" + maritalStatus + ", nameOfSpouse=" + nameOfSpouse
				+ ", numberOfChildren=" + numberOfChildren + ", employmentType=" + employmentType + ", purposeOfLoan="
				+ purposeOfLoan + ", customerAddress=" + customerAddress + ", previousLoans=" + previousLoans + "]";
	}

}
