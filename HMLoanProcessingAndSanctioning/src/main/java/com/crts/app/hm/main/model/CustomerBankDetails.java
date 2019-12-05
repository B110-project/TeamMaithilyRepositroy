package com.crts.app.hm.main.model;

public class CustomerBankDetails 
{
	private int customerBankDetailsId;
	private String bankName;
	private String bankIFSC;
	private String accountNo;
	private String customerBranchName;
	private String customerBranchCode;
	private String customerBankId;
	public int getCustomerBankDetailsId() {
		return customerBankDetailsId;
	}
	public void setCustomerBankDetailsId(int customerBankDetailsId) {
		this.customerBankDetailsId = customerBankDetailsId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankIFSC() {
		return bankIFSC;
	}
	public void setBankIFSC(String bankIFSC) {
		this.bankIFSC = bankIFSC;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getCustomerBranchName() {
		return customerBranchName;
	}
	public void setCustomerBranchName(String customerBranchName) {
		this.customerBranchName = customerBranchName;
	}
	public String getCustomerBranchCode() {
		return customerBranchCode;
	}
	public void setCustomerBranchCode(String customerBranchCode) {
		this.customerBranchCode = customerBranchCode;
	}
	public String getCustomerBankId() {
		return customerBankId;
	}
	public void setCustomerBankId(String customerBankId) {
		this.customerBankId = customerBankId;
	}
	@Override
	public String toString() {
		return "CustomerBankDetails [customerBankDetailsId=" + customerBankDetailsId + ", bankName=" + bankName
				+ ", bankIFSC=" + bankIFSC + ", accountNo=" + accountNo + ", customerBranchName=" + customerBranchName
				+ ", customerBranchCode=" + customerBranchCode + ", customerBankId=" + customerBankId + "]";
	}
	
	
	
}
