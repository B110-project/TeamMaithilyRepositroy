package com.crts.app.hm.main.model;

public class SalariedDetails 
{
	private int salariedId;
	private double grossSalary;
	private double takeHomeSalary;
	private String organizationType;
	private String organizationName;
	private float totalWorkingExperience;
	private float currentExperience;
	private Address organizationAddress;
	public int getSalariedId() {
		return salariedId;
	}
	public void setSalariedId(int salariedId) {
		this.salariedId = salariedId;
	}
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public double getTakeHomeSalary() {
		return takeHomeSalary;
	}
	public void setTakeHomeSalary(double takeHomeSalary) {
		this.takeHomeSalary = takeHomeSalary;
	}
	public String getOrganizationType() {
		return organizationType;
	}
	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public float getTotalWorkingExperience() {
		return totalWorkingExperience;
	}
	public void setTotalWorkingExperience(float totalWorkingExperience) {
		this.totalWorkingExperience = totalWorkingExperience;
	}
	public float getCurrentExperience() {
		return currentExperience;
	}
	public void setCurrentExperience(float currentExperience) {
		this.currentExperience = currentExperience;
	}
	public Address getOrganizationAddress() {
		return organizationAddress;
	}
	public void setOrganizationAddress(Address organizationAddress) {
		this.organizationAddress = organizationAddress;
	}
	@Override
	public String toString() {
		return "SalariedDetails [salariedId=" + salariedId + ", grossSalary=" + grossSalary + ", takeHomeSalary="
				+ takeHomeSalary + ", organizationType=" + organizationType + ", organizationName=" + organizationName
				+ ", totalWorkingExperience=" + totalWorkingExperience + ", currentExperience=" + currentExperience
				+ ", organizationAddress=" + organizationAddress + "]";
	}

	
}
