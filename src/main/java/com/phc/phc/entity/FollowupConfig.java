package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the followup_config database table.
 * 
 */
@Entity
@Table(name="config.followup_config")
@NamedQuery(name="FollowupConfig.findAll", query="SELECT f FROM FollowupConfig f")
public class FollowupConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="followup_id")
	private int followupId;

	@Column(name="created_on")
	private Timestamp createdOn;

	@Column(name="days_after_discharge")
	private int daysAfterDischarge;

	private String description;

	@Column(name="followup_name")
	private String followupName;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	public FollowupConfig() {
	}

	public int getFollowupId() {
		return this.followupId;
	}

	public void setFollowupId(int followupId) {
		this.followupId = followupId;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public int getDaysAfterDischarge() {
		return this.daysAfterDischarge;
	}

	public void setDaysAfterDischarge(int daysAfterDischarge) {
		this.daysAfterDischarge = daysAfterDischarge;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFollowupName() {
		return this.followupName;
	}

	public void setFollowupName(String followupName) {
		this.followupName = followupName;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

}