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
	private State stateCode;
	@OneToOne(cascade = CascadeType.ALL)
	private StatusMaster districtStatus;

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

	public State getStateCode() {
		return stateCode;
	}

	public void setStateCode(State stateCode) {
		this.stateCode = stateCode;
	}

	public StatusMaster getDistrictStatus() {
		return districtStatus;
	}

	public void setDistrictStatus(StatusMaster districtStatus) {
		this.districtStatus = districtStatus;
	}

	@Override
	public String toString() {
		return "District [districtId=" + districtId + ", districtName=" + districtName + ", districtCode="
				+ districtCode + ", stateCode=" + stateCode + ", districtStatus=" + districtStatus + "]";
	}

}
