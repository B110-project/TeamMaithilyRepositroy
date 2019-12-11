package com.crts.app.hm.main.dto;


import com.crts.app.hm.main.model.State;

public class DistrictDto {
	
	private int districtId;
	private String districtName;
	private int districtCode;
	private State stateId;
	private int districtStatus;

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public int getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(int districtCode) {
		this.districtCode = districtCode;
	}

	

	public State getStateId() {
		return stateId;
	}

	public void setStateId(State stateId) {
		this.stateId = stateId;
	}

	public int getDistrictStatus() {
		return districtStatus;
	}

	public void setDistrictStatus(int districtStatus) {
		this.districtStatus = districtStatus;
	}

	@Override
	public String toString() {
		return "DistrictDto [districtId=" + districtId + ", districtName=" + districtName + ", districtCode="
				+ districtCode + ", stateId=" + stateId + ", districtStatus=" + districtStatus + "]";
	}

	

}
