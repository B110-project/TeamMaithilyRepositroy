package com.crts.app.hm.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class District {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int districtId;
	private String districtName;
	private int districtCode;
	
	@OneToOne(cascade = CascadeType.ALL)
	private State stateId;
	@OneToOne(cascade = CascadeType.ALL)
	private StatusMaster statusId;

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

	public StatusMaster getstatusId() {
		return statusId;
	}

	public void setstatusId(StatusMaster statusId) {
		this.statusId = statusId;
	}

	@Override
	public String toString() {
		return "District [districtId=" + districtId + ", districtName=" + districtName + ", districtCode="
				+ districtCode + ", stateCode=" + stateId
				+ ", statusId=" + statusId + "]";
	}

}
