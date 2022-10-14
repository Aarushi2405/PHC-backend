package com.phc.phc.model;


public class ServiceAuthInfoModel {
	private Long authRecId;
	private String recordSynchedAtTimeStamp;
	private String recordedAtGisLat;
	private String recordedAtGisLong;
	private String recordedAtTimestamp;
	private String serviceType;
	
	public Long getAuthRecId() {
		return authRecId;
	}
	public void setAuthRecId(Long authRecId) {
		this.authRecId = authRecId;
	}
	public String getRecordSynchedAtTimeStamp() {
		return recordSynchedAtTimeStamp;
	}
	public void setRecordSynchedAtTimeStamp(String recordSynchedAtTimeStamp) {
		this.recordSynchedAtTimeStamp = recordSynchedAtTimeStamp;
	}
	public String getRecordedAtGisLat() {
		return recordedAtGisLat;
	}
	public void setRecordedAtGisLat(String recordedAtGisLat) {
		this.recordedAtGisLat = recordedAtGisLat;
	}
	public String getRecordedAtGisLong() {
		return recordedAtGisLong;
	}
	public void setRecordedAtGisLong(String recordedAtGisLong) {
		this.recordedAtGisLong = recordedAtGisLong;
	}
	public String getRecordedAtTimestamp() {
		return recordedAtTimestamp;
	}
	public void setRecordedAtTimestamp(String recordedAtTimestamp) {
		this.recordedAtTimestamp = recordedAtTimestamp;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

}
