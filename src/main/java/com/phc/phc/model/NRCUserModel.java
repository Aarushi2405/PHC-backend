package com.phc.phc.model;

public class NRCUserModel implements AbstractModel {
    
	private Integer nrcUId;
	private String userId;
	private String password;
	private Integer hospitalId;
	private String hospitalName;

	public Integer getNrcUId() {
		return nrcUId;
	}
	public void setNrcUId(Integer nrcUId) {
		this.nrcUId = nrcUId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(Integer hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	
	
}
