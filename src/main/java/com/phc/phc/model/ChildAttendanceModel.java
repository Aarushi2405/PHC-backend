package com.phc.phc.model;

public class ChildAttendanceModel implements AbstractModel {
	String recordDate;
	Long childId;
	String status;

	public Long getChildId() {
		return childId;
	}
	public void setChildId(Long childId) {
		this.childId = childId;
	}
	public String getRecordDate() {
		return recordDate;
	}
	public void setRecordDate(String recordDate) {
		this.recordDate = recordDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}