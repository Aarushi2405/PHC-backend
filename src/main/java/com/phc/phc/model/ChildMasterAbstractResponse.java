package com.phc.phc.model;


public class ChildMasterAbstractResponse {
	
	String errorCode;
	String errorMessage;
	String successMessage;
	String sessionId;
	String systemTime;
	
	ChildMasterResponseModel responseObject;

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

	
	public ChildMasterResponseModel getResponseObject() {
		return responseObject;
	}

	public void setResponseObject(ChildMasterResponseModel responseObject) {
		this.responseObject = responseObject;
	}

	public String getSystemTime() {
		return systemTime;
	}

	public void setSystemTime(String systemTime) {
		this.systemTime = systemTime;
	}
	
	
	
}
