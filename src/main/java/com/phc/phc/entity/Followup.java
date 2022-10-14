package com.phc.phc.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;





/**
 * The persistent class for the followup database table.
 * 
 */
@Entity
@Table(name="nr.followup")
@NamedQuery(name="Followup.findAll", query="SELECT f FROM Followup f")
public class Followup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="followup_id")
	private int followupId;

	@Column(name="created_on")
	private Timestamp createdOn;

	@Column(name="done_by")
	private String doneBy;
	
	@Temporal(TemporalType.DATE)
	@Column(name="followup_date")
	private Date followupDate;

	
	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	@Column(name="place_id")
	private Integer placeId;

	private String remarks;

	@Column(name="followup_sd")
	private BigDecimal followupSd;

	@Column(name="status_id")
	private Integer statusId;

	

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
	
	//bi-directional many-to-one association to ChildGrowth
	@OneToMany(mappedBy="followup", orphanRemoval = true, fetch = FetchType.LAZY)
	@Cascade(CascadeType.SAVE_UPDATE)
	private List<ChildGrowth> childGrowths;

	public Followup() {
	}

	

	public int getFollowupId() {
		return followupId;
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

	public String getDoneBy() {
		return this.doneBy;
	}

	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
	}

	

	public Date getFollowupDate() {
		return followupDate;
	}

	public void setFollowupDate(Date followupDate) {
		this.followupDate = followupDate;
	}

	

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}
    

	public BigDecimal getFollowupSd() {
		return followupSd;
	}

	public void setFollowupSd(BigDecimal followupSd) {
		this.followupSd = followupSd;
	}

	public Integer getPlaceId() {
		return placeId;
	}

	public void setPlaceId(Integer placeId) {
		this.placeId = placeId;
	}

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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

	public List<ChildGrowth> getChildGrowths() {
		return this.childGrowths;
	}

	public void setChildGrowths(List<ChildGrowth> childGrowths) {
		this.childGrowths = childGrowths;
	}

	public ChildGrowth addChildGrowth(ChildGrowth childGrowth) {
		getChildGrowths().add(childGrowth);
		childGrowth.setFollowup(this);

		return childGrowth;
	}

	public ChildGrowth removeChildGrowth(ChildGrowth childGrowth) {
		getChildGrowths().remove(childGrowth);
		childGrowth.setFollowup(null);

		return childGrowth;
	}

	


}