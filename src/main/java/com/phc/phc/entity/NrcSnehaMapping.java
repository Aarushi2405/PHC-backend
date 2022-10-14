package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the nrc_sneha_mapping database table.
 * 
 */
@Entity
@Table(name="nr.nrc_sneha_mapping")
@NamedQuery(name="NrcSnehaMapping.findAll", query="SELECT n FROM NrcSnehaMapping n")
public class NrcSnehaMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rec_id")
	private int recId;

	@Column(name="anganwadi_child_id")
	private Long anganwadiChildId;

	@Column(name="anganwadi_id")
	private Long anganwadiId;

	@Column(name="anganwadi_worker_id")
	private Long anganwadiWorkerId;

	@Column(name="aww_phone_number")
	private String awwPhoneNumber;

	@Column(name="rch_id")
	private Long rchId;

	@Column(name="referral_id")
	private Long referralId;

	//bi-directional many-to-one association to CaseDetail
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="case_id")
	private CaseDetail caseDetail;

	public NrcSnehaMapping() {
	}

	public int getRecId() {
		return this.recId;
	}

	public void setRecId(int recId) {
		this.recId = recId;
	}

	

	public Long getAnganwadiChildId() {
		return anganwadiChildId;
	}

	public void setAnganwadiChildId(Long anganwadiChildId) {
		this.anganwadiChildId = anganwadiChildId;
	}

	public Long getAnganwadiId() {
		return anganwadiId;
	}

	public void setAnganwadiId(Long anganwadiId) {
		this.anganwadiId = anganwadiId;
	}

	public Long getAnganwadiWorkerId() {
		return anganwadiWorkerId;
	}

	public void setAnganwadiWorkerId(Long anganwadiWorkerId) {
		this.anganwadiWorkerId = anganwadiWorkerId;
	}

	public String getAwwPhoneNumber() {
		return awwPhoneNumber;
	}

	public void setAwwPhoneNumber(String awwPhoneNumber) {
		this.awwPhoneNumber = awwPhoneNumber;
	}

	public Long getRchId() {
		return rchId;
	}

	public void setRchId(Long rchId) {
		this.rchId = rchId;
	}

	public Long getReferralId() {
		return referralId;
	}

	public void setReferralId(Long referralId) {
		this.referralId = referralId;
	}

	public CaseDetail getCaseDetail() {
		return this.caseDetail;
	}

	public void setCaseDetail(CaseDetail caseDetail) {
		this.caseDetail = caseDetail;
	}

}