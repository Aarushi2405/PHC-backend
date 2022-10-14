package com.phc.phc.model;

import java.util.ArrayList;
import java.util.List;

public class UserList implements AbstractModel {
	
	List<NRCUserModel> userList = new ArrayList<>();

	public List<NRCUserModel> getUserList() {
		return userList;
	}

	public void setUserList(List<NRCUserModel> userList) {
		this.userList = userList;
	}
}
