package com.crts.app.hm.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class LoanType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loanTypeId;
	private String loanTypeName;
	@OneToOne(cascade = CascadeType.ALL)
	private StatusMaster loanTypeStatus;

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

	public StatusMaster getLoanTypeStatus() {
		return loanTypeStatus;
	}

	public void setLoanTypeStatus(StatusMaster loanTypeStatus) {
		this.loanTypeStatus = loanTypeStatus;
	}

	@Override
	public String toString() {
		return "LoanType [loanTypeId=" + loanTypeId + ", loanTypeName=" + loanTypeName + ", loanTypeStatus="
				+ loanTypeStatus + "]";
	}

}
