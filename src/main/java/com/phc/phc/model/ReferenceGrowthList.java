package com.phc.phc.model;

import java.util.ArrayList;
import java.util.List;

public class ReferenceGrowthList implements AbstractModel {
	private List<ChildGrowthPerAgeModel> referenceGrowthListForChildren = new ArrayList<ChildGrowthPerAgeModel>();

	public List<ChildGrowthPerAgeModel> getReferenceGrowthListForChildren() {
		return referenceGrowthListForChildren;
	}

	public void setReferenceGrowthListForChildren(List<ChildGrowthPerAgeModel> referenceGrowthListForChildren) {
		this.referenceGrowthListForChildren = referenceGrowthListForChildren;
	}
	
}