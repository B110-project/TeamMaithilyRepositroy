package com.crts.app.hm.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoanType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loanTypeId;
	private String loanTypeName;
	private int loanTypeStatus;
	public int getLoanTypeId() {
		return loanTypeId;
	}

	public void setLoanTypeId(int loanTypeId) {
		this.loanTypeId = loanTypeId;
	}

	public String getLoanTypeName() {
		return loanTypeName;
	}

	public void setLoanTypeName(String loanTypeName) {
		this.loanTypeName = loanTypeName;
	}

	public int getLoanTypeStatus() {
		return loanTypeStatus;
	}

	public void setLoanTypeStatus(int loanTypeStatus) {
		this.loanTypeStatus = loanTypeStatus;
	}

	@Override
	public String toString() {
		return "LoanType [loanTypeId=" + loanTypeId + ", loanTypeName=" + loanTypeName + ", loanTypeStatus="
				+ loanTypeStatus + "]";
	}

	

}
