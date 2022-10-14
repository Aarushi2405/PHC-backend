package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the followup_schedule database table.
 * 
 */
@Entity
@Table(name="nr.followup_schedule")
@NamedQuery(name="FollowupSchedule.findAll", query="SELECT f FROM FollowupSchedule f")
public class FollowupSchedule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sched_id")
	private int schedId;

	@Column(name="created_on")
	private Timestamp createdOn;
	
	//commented for sneha-angan
	/*@Column(name="followup_type")
	private String followupType;*/
	
	@Temporal(TemporalType.DATE)
	@Column(name="followup_date")
	private Date followupDate;

	@Column(name="followup_id")
	private int followupId;

	@Column(name="is_active")
	private boolean isActive;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	//bi-directional many-to-one association to CaseDetail
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="case_id")
	private CaseDetail caseDetail;

	//bi-directional many-to-one association to NrcUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="created_by")
	private NrcUser createdBy;

	//bi-directional many-to-one association to NrcUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="last_updated_by")
	private NrcUser lastUpdatedBy;

	public FollowupSchedule() {
	}

	public int getSchedId() {
		return this.schedId;
	}

	public void setSchedId(int schedId) {
		this.schedId = schedId;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	

	public Date getFollowupDate() {
		return followupDate;
	}

	public void setFollowupDate(Date followupDate) {
		this.followupDate = followupDate;
	}

	public int getFollowupId() {
		return this.followupId;
	}

	public void setFollowupId(int followupId) {
		this.followupId = followupId;
	}

	public boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public CaseDetail getCaseDetail() {
		return caseDetail;
	}

	public void setCaseDetail(CaseDetail caseDetail) {
		this.caseDetail = caseDetail;
	}

	public NrcUser getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(NrcUser createdBy) {
		this.createdBy = createdBy;
	}

	public NrcUser getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(NrcUser lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	/*public String getFollowupType() {
		return followupType;
	}

	public void setFollowupType(String followupType) {
		this.followupType = followupType;
	}*/
    	
}