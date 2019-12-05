package com.crts.app.hm.main.model;

public class DocumentDetails 
{
	private int documentDetailsId;
	private String aadhaar;
	private String pan;
	private String photos;
	private String itr;
	private String addressProof;
	private String salarySlip;
	private String bankStatement;
	private String form16;
	private String insurance;
	private String otherDoc;
	
	
	public int getDocumentDetailsId() {
		return documentDetailsId;
	}
	public void setDocumentDetailsId(int documentDetailsId) {
		this.documentDetailsId = documentDetailsId;
	}
	public String getAadhaar() {
		return aadhaar;
	}
	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getPhotos() {
		return photos;
	}
	public void setPhotos(String photos) {
		this.photos = photos;
	}
	public String getItr() {
		return itr;
	}
	public void setItr(String itr) {
		this.itr = itr;
	}
	public String getAddressProof() {
		return addressProof;
	}
	public void setAddressProof(String addressProof) {
		this.addressProof = addressProof;
	}
	public String getSalarySlip() {
		return salarySlip;
	}
	public void setSalarySlip(String salarySlip) {
		this.salarySlip = salarySlip;
	}
	public String getBankStatement() {
		return bankStatement;
	}
	public void setBankStatement(String bankStatement) {
		this.bankStatement = bankStatement;
	}
	public String getForm16() {
		return form16;
	}
	public void setForm16(String form16) {
		this.form16 = form16;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	public String getOtherDoc() {
		return otherDoc;
	}
	public void setOtherDoc(String otherDoc) {
		this.otherDoc = otherDoc;
	}
	@Override
	public String toString() {
		return "DocumentDetails [documentDetailsId=" + documentDetailsId + ", aadhaar=" + aadhaar + ", pan=" + pan
				+ ", photos=" + photos + ", itr=" + itr + ", addressProof=" + addressProof + ", salarySlip="
				+ salarySlip + ", bankStatement=" + bankStatement + ", form16=" + form16 + ", insurance=" + insurance
				+ ", otherDoc=" + otherDoc + "]";
	}
	
	
	
	

}
