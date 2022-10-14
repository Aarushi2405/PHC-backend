package com.phc.phc.model;

import java.util.ArrayList;
import java.util.List;


public class SummaryReportList implements AbstractModel {
	
	private String startTime;
	private String endTime;
	private Boolean isValid;
	private String hospitalName;
	
	List<SummaryReportModel> reportList = new ArrayList<>();

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public List<SummaryReportModel> getReportList() {
		return reportList;
	}

	public void setReportList(List<SummaryReportModel> reportList) {
		this.reportList = reportList;
	}

	public Boolean getIsValid() {
		return isValid;
	}

	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	
}
