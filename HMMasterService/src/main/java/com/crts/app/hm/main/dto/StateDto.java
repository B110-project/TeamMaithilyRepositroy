package com.crts.app.hm.main.dto;

public class StateDto 
{
	private int stateId;
	private String stateName;
	private int stateCode;
	
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public int getStateCode() {
		return stateCode;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	@Override
	public String toString() {
		return "stateDto [stateId=" + stateId + ", stateName=" + stateName + ", stateCode=" + stateCode + "]";
	}
	
	

}
