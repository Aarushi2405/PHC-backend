package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the doctor database table.
 * 
 */
@Entity
@Table(name="nr.doctor")
@NamedQuery(name="Doctor.findAll", query="SELECT d FROM Doctor d")
public class Doctor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="doctor_id")
	private int doctorId;

	private String address;

	@Column(name="created_on")
	private Timestamp createdOn;

	private String desigination;

	@Column(name="email_id")
	private String emailId;

	@Column(name="land_line_number")
	private String landLineNumber;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	@Column(name="mobile_number")
	private String mobileNumber;

	private String name;

	//bi-directional many-to-one association to CaseDetail
	@OneToMany(mappedBy="addmittedByDoctor")
	private List<CaseDetail> caseDetailsAdmitted;

	//bi-directional many-to-one association to CaseDetail
	@OneToMany(mappedBy="dischargedByDoctor")
	private List<CaseDetail> caseDetailsDischarged;

	//bi-directional many-to-one association to Hospital
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="h_id")
	private Hospital hospital;

	//bi-directional many-to-one association to NrcUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="created_by")
	private NrcUser createdBy;

	//bi-directional many-to-one association to NrcUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="last_updated_by")
	private NrcUser lastUpdatedBy;

	public Doctor() {
	}

	public int getDoctorId() {
		return this.doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public String getDesigination() {
		return this.desigination;
	}

	public void setDesigination(String desigination) {
		this.desigination = desigination;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getLandLineNumber() {
		return this.landLineNumber;
	}

	public void setLandLineNumber(String landLineNumber) {
		this.landLineNumber = landLineNumber;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CaseDetail> getcaseDetailsAdmitted() {
		return this.caseDetailsAdmitted;
	}

	public void setCaseDetailsAdmitted(List<CaseDetail> caseDetailsAdmitted) {
		this.caseDetailsAdmitted = caseDetailsAdmitted;
	}

	public CaseDetail addCaseDetailsAdmitted(CaseDetail caseDetailsAdmitted) {
		getcaseDetailsAdmitted().add(caseDetailsAdmitted);
		caseDetailsAdmitted.setAddmittedByDoctor(this);

		return caseDetailsAdmitted;
	}

	public CaseDetail removeCaseDetailsAdmitted(CaseDetail caseDetailsAdmitted) {
		getcaseDetailsAdmitted().remove(caseDetailsAdmitted);
		caseDetailsAdmitted.setAddmittedByDoctor(null);

		return caseDetailsAdmitted;
	}
    
	
	public List<CaseDetail> getcaseDetailsDischarged() {
		return this.caseDetailsDischarged;
	}

	public void setCaseDetailsDischarged(List<CaseDetail> caseDetailsDischarged) {
		this.caseDetailsDischarged = caseDetailsDischarged;
	}

	public CaseDetail addCaseDetailsDischarged(CaseDetail caseDetailsDischarged) {
		getcaseDetailsDischarged().add(caseDetailsDischarged);
		caseDetailsDischarged.setDischargedByDoctor(this);

		return caseDetailsDischarged;
	}

	public CaseDetail removeCaseDetailsDischarged(CaseDetail caseDetailsDischarged) {
		getcaseDetailsDischarged().remove(caseDetailsDischarged);
		caseDetailsDischarged.setDischargedByDoctor(null);

		return caseDetailsDischarged;
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

	

}