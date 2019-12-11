package com.crts.app.hm.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userDetailsId;
	private String userFirstName;
	private String userMiddleName;
	private String userLastName;
	private long userMobileNo;
	
	public int getUserDetailsId() {
		return userDetailsId;
	}

	public void setUserDetailsId(int userDetailsId) {
		this.userDetailsId = userDetailsId;
	}

	private String userDob;
	private String userEmailId;
	private String userGender;
	private String userHighestQualification;
	@OneToOne(cascade = CascadeType.ALL)
	private Address userAddress;

	

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserMiddleName() {
		return userMiddleName;
	}

	public void setUserMiddleName(String userMiddleName) {
		this.userMiddleName = userMiddleName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public long getUserMobileNo() {
		return userMobileNo;
	}

	public void setUserMobileNo(long userMobileNo) {
		this.userMobileNo = userMobileNo;
	}

	public String getUserDob() {
		return userDob;
	}

	public void setUserDob(String userDob) {
		this.userDob = userDob;
	}

	public String getUserEmailId() {
		return userEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserHighestQualification() {
		return userHighestQualification;
	}

	public void setUserHighestQualification(String userHighestQualification) {
		this.userHighestQualification = userHighestQualification;
	}

	public Address getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(Address userAddress) {
		this.userAddress = userAddress;
	}

	@Override
	public String toString() {
		return "UserDetails [userDetailsId=" + userDetailsId + ", userFirstName=" + userFirstName + ", userMiddleName="
				+ userMiddleName + ", userLastName=" + userLastName + ", userMobileNo=" + userMobileNo + ", userDob="
				+ userDob + ", userEmailId=" + userEmailId + ", userGender=" + userGender
				+ ", userHighestQualification=" + userHighestQualification + ", userAddress=" + userAddress + "]";
	}

}
