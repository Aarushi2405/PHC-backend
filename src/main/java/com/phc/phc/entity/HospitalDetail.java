package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the hospital_details database table.
 * 
 */
@Entity
@Table(name="nr.hospital_details")
@NamedQuery(name="HospitalDetail.findAll", query="SELECT h FROM HospitalDetail h")
public class HospitalDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="details_id")
	private int detailsId;

	@Column(name="created_on")
	private Timestamp createdOn;

	@Column(name="hr_type_id")
	private int hrTypeId;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	private int month;

	private int year;
	
	@Column(name="value")
	private Integer value;

	//bi-directional many-to-one association to Hospital
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="h_id")
	private Hospital hospital;

	// bi-directional many-to-one association to NrcUser
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "created_by")
	private NrcUser createdBy;

	// bi-directional many-to-one association to NrcUser
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "last_updated_by")
	private NrcUser lastUpdatedBy;

	public HospitalDetail() {
	}

	public int getDetailsId() {
		return this.detailsId;
	}

	public void setDetailsId(int detailsId) {
		this.detailsId = detailsId;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public int getHrTypeId() {
		return this.hrTypeId;
	}

	public void setHrTypeId(int hrTypeId) {
		this.hrTypeId = hrTypeId;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Hospital getHospital() {
		return this.hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
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

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	
    
	
}