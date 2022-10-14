
package com.phc.phc.model;

public class SummaryReportModel {
	private String month;
	private Integer admissionCount = 0;
	private Integer dischargeCount = 0;
	private Integer deathCount = 0;
	
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public Integer getAdmissionCount() {
		return admissionCount;
	}
	public void setAdmissionCount(Integer admissionCount) {
		this.admissionCount = admissionCount;
	}
	public Integer getDischargeCount() {
		return dischargeCount;
	}
	public void setDischargeCount(Integer dischargeCount) {
		this.dischargeCount = dischargeCount;
	}
	public Integer getDeathCount() {
		return deathCount;
	}
	public void setDeathCount(Integer deathCount) {
		this.deathCount = deathCount;
	}
	
	

}
