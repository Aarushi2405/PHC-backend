package com.phc.phc.model;

import java.math.BigDecimal;

public class CommunityFollowupModel {
	private Long referralId;
	private Long scheduleId;
	private String followupDate;
	private BigDecimal heightCm;
	private BigDecimal weightKg;

	
	public Long getReferralId() {
		return referralId;
	}
	public void setReferralId(Long referralId) {
		this.referralId = referralId;
	}
	public Long getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}
	
	public String getFollowupDate() {
		return followupDate;
	}
	public void setFollowupDate(String followupDate) {
		this.followupDate = followupDate;
	}
	public BigDecimal getHeightCm() {
		return heightCm;
	}
	public void setHeightCm(BigDecimal heightCm) {
		this.heightCm = heightCm;
	}
	public BigDecimal getWeightKg() {
		return weightKg;
	}
	public void setWeightKg(BigDecimal weightKg) {
		this.weightKg = weightKg;
	}
	
}
