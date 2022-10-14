package com.phc.phc.model;

public class NotificationRequestModel implements AbstractModel {
	
	String notificationDate;
	Long notificationTypeId;
	Long anganwadiWorkerId;
	String notificationActionTaken;
	String notificationActionText;
	String notificationText;
	
	
	public String getNotificationDate() {
		return notificationDate;
	}
	public void setNotificationDate(String notificationDate) {
		this.notificationDate = notificationDate;
	}
	public Long getNotificationTypeId() {
		return notificationTypeId;
	}
	public void setNotificationTypeId(Long notificationTypeId) {
		this.notificationTypeId = notificationTypeId;
	}
	public Long getAnganwadiWorkerId() {
		return anganwadiWorkerId;
	}
	public void setAnganwadiWorkerId(Long anganwadiWorkerId) {
		this.anganwadiWorkerId = anganwadiWorkerId;
	}
	public String getNotificationActionTaken() {
		return notificationActionTaken;
	}
	public void setNotificationActionTaken(String notificationActionTaken) {
		this.notificationActionTaken = notificationActionTaken;
	}
	public String getNotificationActionText() {
		return notificationActionText;
	}
	public void setNotificationActionText(String notificationActionText) {
		this.notificationActionText = notificationActionText;
	}
	public String getNotificationText() {
		return notificationText;
	}
	public void setNotificationText(String notificationText) {
		this.notificationText = notificationText;
	}

	
	
}

