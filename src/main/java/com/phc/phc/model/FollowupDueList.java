package com.phc.phc.model;

import java.util.ArrayList;
import java.util.List;

public class FollowupDueList implements AbstractModel {
	List<FollowupDueResponseModel> followupDueList = new ArrayList<>();

	public List<FollowupDueResponseModel> getFollowupDueList() {
		return followupDueList;
	}

	public void setFollowupDueList(List<FollowupDueResponseModel> followupDueList) {
		this.followupDueList = followupDueList;
	}
	
}
