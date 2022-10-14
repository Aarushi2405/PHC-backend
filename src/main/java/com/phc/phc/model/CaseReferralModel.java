package com.phc.phc.model;

public class CaseReferralModel {
	
	private String referredBy;
	private int referredFromId;
	private String referredByNumber;
	
	public String getReferredBy() {
		return referredBy;
	}
	public void setReferredBy(String referredBy) {
		this.referredBy = referredBy;
	}
	public int getReferredFromId() {
		return referredFromId;
	}
	public void setReferredFromId(int referredFromId) {
		this.referredFromId = referredFromId;
	}
	public String getReferredByNumber() {
		return referredByNumber;
	}
	public void setReferredByNumber(String referredByNumber) {
		this.referredByNumber = referredByNumber;
	}
	
	
	
}
