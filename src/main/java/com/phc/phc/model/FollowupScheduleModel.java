package com.phc.phc.model;

import java.util.ArrayList;
import java.util.List;

public class FollowupScheduleModel implements AbstractModel{

	private Long referalId;
	private Long childId;
	private Long anganwadiId;
	private List<FollowupListModel> followupScheduleList = new ArrayList<FollowupListModel>();	


	public Long getReferalId() {
		return referalId;
	}
	public void setReferalId(Long referalId) {
		this.referalId = referalId;
	}
	public Long getChildId() {
		return childId;
	}
	public void setChildId(Long childId) {
		this.childId = childId;
	}
	public Long getAnganwadiId() {
		return anganwadiId;
	}
	public void setAnganwadiId(Long anganwadiId) {
		this.anganwadiId = anganwadiId;
	}
	public List<FollowupListModel> getFollowupScheduleList() {
		return followupScheduleList;
	}
	public void setFollowupScheduleList(List<FollowupListModel> followupScheduleList) {
		this.followupScheduleList = followupScheduleList;
	}
	
}