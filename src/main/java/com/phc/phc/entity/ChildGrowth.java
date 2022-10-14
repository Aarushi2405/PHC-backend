package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the child_growth database table.
 * 
 */
@Entity
@Table(name="nr.child_growth")
@NamedQuery(name="ChildGrowth.findAll", query="SELECT c FROM ChildGrowth c")
public class ChildGrowth implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rec_id")
	private int recId;

	@Column(name="created_on")
	private Timestamp createdOn;

	@Column(name="height_cm")
	private BigDecimal heightCm;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;
    
	@Temporal(TemporalType.DATE)
	@Column(name="measurement_date")
	private Date measurementDate;

	@Column(name="recorded_at_admission")
	private Boolean recordedAtAdmission;

	@Column(name="recorded_at_discharge")
	private Boolean recordedAtDischarge;

	@Column(name="weight_kg")
	private BigDecimal weightKg;
	
	@Column(name="diet")
	private String diet;
	
	@Column(name="daily_weight_comment")
	private String comments;

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
	
	//bi-directional many-to-one association to Followup
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="followup_id")
	private Followup followup;
	
	//commented for sneha-angan
	//bi-directional many-to-one association to FollowupSchedule
	/*@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="sched_id")
	private FollowupSchedule followupSchedule;*/


	public ChildGrowth() {
	}

	public int getRecId() {
		return this.recId;
	}

	public void setRecId(int recId) {
		this.recId = recId;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public BigDecimal getHeightCm() {
		return this.heightCm;
	}

	public void setHeightCm(BigDecimal heightCm) {
		this.heightCm = heightCm;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}


	public Date getMeasurementDate() {
		return measurementDate;
	}

	public void setMeasurementDate(Date measurementDate) {
		this.measurementDate = measurementDate;
	}

	public Boolean getRecordedAtAdmission() {
		return this.recordedAtAdmission;
	}

	public void setRecordedAtAdmission(Boolean recordedAtAdmission) {
		this.recordedAtAdmission = recordedAtAdmission;
	}

	public Boolean getRecordedAtDischarge() {
		return this.recordedAtDischarge;
	}

	public void setRecordedAtDischarge(Boolean recordedAtDischarge) {
		this.recordedAtDischarge = recordedAtDischarge;
	}

	public BigDecimal getWeightKg() {
		return this.weightKg;
	}

	public void setWeightKg(BigDecimal weightKg) {
		this.weightKg = weightKg;
	}

	public CaseDetail getCaseDetail() {
		return this.caseDetail;
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

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public Followup getFollowup() {
		return followup;
	}

	public void setFollowup(Followup followup) {
		this.followup = followup;
	}
    
	
	/*public FollowupSchedule getFollowupSchedule() {
		return followupSchedule;
	}

	public void setFollowupSchedule(FollowupSchedule followupSchedule) {
		this.followupSchedule = followupSchedule;
	}
*/
	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
    
	
	

}