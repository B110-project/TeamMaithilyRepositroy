package com.crts.app.hm.main.model;

public class Cibil
{
	private int cibilId;
	private float cibilScore;
	private String cibilStatus;
	private String leadNo;
	
	
	public int getCibilId() {
		return cibilId;
	}
	public void setCibilId(int cibilId) {
		this.cibilId = cibilId;
	}
	public float getCibilScore() {
		return cibilScore;
	}
	public void setCibilScore(float cibilScore) {
		this.cibilScore = cibilScore;
	}
	public String getCibilStatus() {
		return cibilStatus;
	}
	public void setCibilStatus(String cibilStatus) {
		this.cibilStatus = cibilStatus;
	}
	public String getLeadNo() {
		return leadNo;
	}
	public void setLeadNo(String leadNo) {
		this.leadNo = leadNo;
	}
	@Override
	public String toString() {
		return "Cibil [cibilId=" + cibilId + ", cibilScore=" + cibilScore + ", cibilStatus=" + cibilStatus + ", leadNo="
				+ leadNo + "]";
	}
	
	

}
