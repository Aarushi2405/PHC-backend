package com.phc.phc.model;

import java.util.ArrayList;
import java.util.List;

public class FollowupList implements AbstractModel {
	List<FollowupResponseModel> followupList = new ArrayList<>();

	public List<FollowupResponseModel> getFollowupList() {
		return followupList;
	}

	public void setFollowupList(List<FollowupResponseModel> followupList) {
		this.followupList = followupList;
	}
	
	
}
