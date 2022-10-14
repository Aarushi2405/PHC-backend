package com.phc.phc.model;

public class AdmissionResponseModel implements AbstractModel{
	
	private Integer SamNumber;
	private Integer caseId;
	
	public Integer getSamNumber() {
		return SamNumber;
	}
	public void setSamNumber(Integer samNumber) {
		SamNumber = samNumber;
	}
	public Integer getCaseId() {
		return caseId;
	}
	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}
	
	
	
}
