package com.phc.phc.model;

public class ReferenceGrowthAbstractResponse {
	String errorCode;
	String errorMessage;
	String successMessage;
	String sessionId;
	String systemTime;
	
	ReferenceGrowthList responseObject;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getSuccessMessage() {
		return successMessage;
	}

	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getSystemTime() {
		return systemTime;
	}

	public void setSystemTime(String systemTime) {
		this.systemTime = systemTime;
	}

	public ReferenceGrowthList getResponseObject() {
		return responseObject;
	}

	public void setResponseObject(ReferenceGrowthList responseObject) {
		this.responseObject = responseObject;
	}
	
	
}
