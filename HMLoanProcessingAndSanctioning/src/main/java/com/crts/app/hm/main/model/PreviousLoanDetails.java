package com.crts.app.hm.main.model;

public class PreviousLoanDetails {
	private int previousLoanId;
	private double preLoanAmount;
	private int preTenure;
	private int preLoanStatus;
	private double remainingEmi;

	public int getPreviousLoanId() {
		return previousLoanId;
	}

	public void setPreviousLoanId(int previousLoanId) {
		this.previousLoanId = previousLoanId;
	}

	public double getPreLoanAmount() {
		return preLoanAmount;
	}

	public void setPreLoanAmount(double preLoanAmount) {
		this.preLoanAmount = preLoanAmount;
	}

	public int getPreTenure() {
		return preTenure;
	}

	public void setPreTenure(int preTenure) {
		this.preTenure = preTenure;
	}

	public int getPreLoanStatus() {
		return preLoanStatus;
	}

	public void setPreLoanStatus(int preLoanStatus) {
		this.preLoanStatus = preLoanStatus;
	}

	public double getRemainingEmi() {
		return remainingEmi;
	}

	public void setRemainingEmi(double remainingEmi) {
		this.remainingEmi = remainingEmi;
	}

	@Override
	public String toString() {
		return "PreviousLoanDetails [previousLoanId=" + previousLoanId + ", preLoanAmount=" + preLoanAmount
				+ ", preTenure=" + preTenure + ", preLoanStatus=" + preLoanStatus + ", remainingEmi=" + remainingEmi
				+ "]";
	}

}
