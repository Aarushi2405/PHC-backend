package com.phc.phc.model;

public class FollowupListModel implements AbstractModel {

	private String scheduleDate;
	private String followUpType;
	private Long departmentFollowUpScheduleId;
	
	public String getScheduleDate() {
		return scheduleDate;
	}
	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	public String getFollowUpType() {
		return followUpType;
	}
	public void setFollowUpType(String followUpType) {
		this.followUpType = followUpType;
	}
	public Long getDepartmentFollowUpScheduleId() {
		return departmentFollowUpScheduleId;
	}
	public void setDepartmentFollowUpScheduleId(Long departmentFollowUpScheduleId) {
		this.departmentFollowUpScheduleId = departmentFollowUpScheduleId;
	}
}
