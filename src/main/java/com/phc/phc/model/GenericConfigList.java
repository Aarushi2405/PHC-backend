package com.phc.phc.model;

import java.util.ArrayList;
import java.util.List;

public class GenericConfigList implements AbstractModel {
	
	List<GenericConfigModel> genericList = new ArrayList<>();

	public List<GenericConfigModel> getGenericList() {
		return genericList;
	}

	public void setGenericList(List<GenericConfigModel> genericList) {
		this.genericList = genericList;
	}
	
	
	

}
