package com.phc.phc.model;

public class ReportRequestModel {
	private String requestDate;
	private Integer loginUserId;
	private Integer nrcType;
	
	public String getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}
	public Integer getLoginUserId() {
		return loginUserId;
	}
	public void setLoginUserId(Integer loginUserId) {
		this.loginUserId = loginUserId;
	}
	public Integer getNrcType() {
		return nrcType;
	}
	public void setNrcType(Integer nrcType) {
		this.nrcType = nrcType;
	}
	
	
}
