package com.crts.app.hm.main.model;

public class FamilyDetails {
	private int familyDetailsId;
	private int customerDependentMembers;
	private int totalMembers;
	private double familyIncome;

	public int getFamilyDetailsId() {
		return familyDetailsId;
	}

	public void setFamilyDetailsId(int familyDetailsId) {
		this.familyDetailsId = familyDetailsId;
	}

	public int getCustomerDependentMembers() {
		return customerDependentMembers;
	}

	public void setCustomerDependentMembers(int customerDependentMembers) {
		this.customerDependentMembers = customerDependentMembers;
	}

	public int getTotalMembers() {
		return totalMembers;
	}

	public void setTotalMembers(int totalMembers) {
		this.totalMembers = totalMembers;
	}

	public double getFamilyIncome() {
		return familyIncome;
	}

	public void setFamilyIncome(double familyIncome) {
		this.familyIncome = familyIncome;
	}

	@Override
	public String toString() {
		return "FamilyDetails [familyDetailsId=" + familyDetailsId + ", customerDependentMembers="
				+ customerDependentMembers + ", totalMembers=" + totalMembers + ", familyIncome=" + familyIncome + "]";
	}

}
