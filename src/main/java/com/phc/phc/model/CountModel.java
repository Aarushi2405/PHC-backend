package com.phc.phc.model;

public class CountModel implements AbstractModel{
	private Integer inpatientCount;
	private Integer numberOfBeds;

	public Integer getInpatientCount() {
		return inpatientCount;
	}

	public void setInpatientCount(Integer inpatientCount) {
		this.inpatientCount = inpatientCount;
	}

	public Integer getNumberOfBeds() {
		return numberOfBeds;
	}

	public void setNumberOfBeds(Integer numberOfBeds) {
		this.numberOfBeds = numberOfBeds;
	}
	
	
	
}
