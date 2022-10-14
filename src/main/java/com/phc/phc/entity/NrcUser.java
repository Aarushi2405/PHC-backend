
package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * The persistent class for the nrc_users database table.
 * 
 */
@Entity
@Table(name = "nr.nrc_users")
@NamedQuery(name = "NrcUser.findAll", query = "SELECT n FROM NrcUser n")
public class NrcUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "u_id")
	private int uId;

	@Column(name = "created_on")
	private Timestamp createdOn;

	@Column(name = "is_active")
	private boolean isActive;

	@Column(name = "last_updated_on")
	private Timestamp lastUpdatedOn;

	private String password;

	@Column(name = "user_id")
	private String userId;
	
	
	@Column(name = "last_logged_in")
	private Timestamp lastLoggedIn;
	
	// bi-directional many-to-one association to CaseDetail
	@OneToMany(mappedBy = "createdBy")
	private List<CaseDetail> caseDetailsCreatedBy;

	// bi-directional many-to-one association to CaseDetail
	@OneToMany(mappedBy = "lastUpdatedBy")
	private List<CaseDetail> caseDetailsLastUpdatedBy;

	// bi-directional many-to-one association to ChildDemography
	@OneToMany(mappedBy = "createdBy")
	private List<ChildDemography> childCreatedBy;

	// bi-directional many-to-one association to ChildDemography
	@OneToMany(mappedBy = "lastUpdatedBy")
	private List<ChildDemography> childLastUpdatedBy;

	// bi-directional many-to-one association to Doctor
	@OneToMany(mappedBy = "createdBy")
	private List<Doctor> doctorCreatedBy;

	// bi-directional many-to-one association to Doctor
	@OneToMany(mappedBy = "lastUpdatedBy")
	private List<Doctor> doctorLastUpdatedBy;

	// bi-directional many-to-one association to MotherDemogrphy
	@OneToMany(mappedBy = "createdBy")
	private List<MotherDemogrphy> motherCreatedBy;

	// bi-directional many-to-one association to MotherDemogrphy
	@OneToMany(mappedBy = "lastUpdatedBy")
	private List<MotherDemogrphy> motherLastUpdatedBy;

	// bi-directional many-to-one association to Hospital
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "h_id")
	private Hospital hospital;

	// bi-directional many-to-one association to AdmissionComorbidCondition
	@OneToMany(mappedBy = "createdBy")
	private List<AdmissionComorbidCondition> admissionComorbidCreatedBy;

	// bi-directional many-to-one association to AdmissionComorbidCondition
	@OneToMany(mappedBy = "lastUpdatedBy")
	private List<AdmissionComorbidCondition> admissionComorbidLastUpdatedBy;

	// bi-directional many-to-one association to AdmissionCriteria
	@OneToMany(mappedBy = "createdBy")
	private List<AdmissionCriteria> admissionCriteriaCreatedBy;

	// bi-directional many-to-one association to AdmissionCriteria
	@OneToMany(mappedBy = "lastUpdatedBy")
	private List<AdmissionCriteria> admissionCriteriaLastUpdatedBy;

	// bi-directional many-to-one association to CaseAllocation
	@OneToMany(mappedBy = "createdBy")
	private List<CaseAllocation> caseAlloCreatedBy;

	// bi-directional many-to-one association to CaseAllocation
	@OneToMany(mappedBy = "lastUpdatedBy")
	private List<CaseAllocation> caseAlloLastUpdatedBy;

	// bi-directional many-to-one association to ChildGrowth
	@OneToMany(mappedBy = "createdBy")
	private List<ChildGrowth> childGrowthCreatedBy;

	// bi-directional many-to-one association to ChildGrowth
	@OneToMany(mappedBy = "lastUpdatedBy")
	private List<ChildGrowth> childGrowthLastUpdatedBy;

	// bi-directional many-to-one association to CaseReferral
	@OneToMany(mappedBy = "createdBy")
	private List<CaseReferral> caseRefCreatedBy;

	// bi-directional many-to-one association to CaseReferral
	@OneToMany(mappedBy = "lastUpdatedBy")
	private List<CaseReferral> caseRefLastUpdatedBy;

	// bi-directional many-to-one association to DischargeComorbidCondition
	@OneToMany(mappedBy = "createdBy")
	private List<DischargeComorbidCondition> discComCreatedBy;

	// bi-directional many-to-one association to DischargeComorbidCondition
	@OneToMany(mappedBy = "lastUpdatedBy")
	private List<DischargeComorbidCondition> discComLastUpdatedBy;

	// bi-directional many-to-one association to DischargeChildDetail
	@OneToMany(mappedBy = "createdBy")
	private List<DischargeChildDetail> disChildCreatedBy;

	// bi-directional many-to-one association to DischargeChildDetail
	@OneToMany(mappedBy = "lastUpdatedBy")
	private List<DischargeChildDetail> disChildLastUpdatedBy;

	// bi-directional many-to-one association to DischargeMotherDetail
	@OneToMany(mappedBy = "createdBy")
	private List<DischargeMotherDetail> disMotherCreatedBy;

	// bi-directional many-to-one association to DischargeMotherDetail
	@OneToMany(mappedBy = "lastUpdatedBy")
	private List<DischargeMotherDetail> disMotherLastUpdatedBy;

	// bi-directional many-to-one association to CaseMotherDetail
	@OneToMany(mappedBy = "createdBy")
	private List<CaseMotherDetail> caseMotherDetCreatedBy;

	// bi-directional many-to-one association to CaseMotherDetail
	@OneToMany(mappedBy = "lastUpdatedBy")
	private List<CaseMotherDetail> caseMotherDetLastUpdatedBy;

	// bi-directional many-to-one association to CaseMotherGrowth
	@OneToMany(mappedBy = "createdBy")
	private List<CaseMotherGrowth> caseMotherGrowthCreatedBy;

	// bi-directional many-to-one association to CaseMotherGrowth
	@OneToMany(mappedBy = "lastUpdatedBy")
	private List<CaseMotherGrowth> caseMotherGrowthLastUpdatedBy;

	// bi-directional many-to-one association to CaseMotherSocialFactor
	@OneToMany(mappedBy = "createdBy")
	private List<CaseMotherSocialFactor> caseMotherSocialCreatedBy;

	// bi-directional many-to-one association to CaseMotherSocialFactor
	@OneToMany(mappedBy = "lastUpdatedBy")
	private List<CaseMotherSocialFactor> caseMotherSocialLastUpdatedBy;
	
	// bi-directional many-to-one association to HospitalDetail
	@OneToMany(mappedBy = "createdBy")
	private List<HospitalDetail> hospitalDetailsCreatedBy;

	// bi-directional many-to-one association to HospitalDetail
	@OneToMany(mappedBy = "lastUpdatedBy")
	private List<HospitalDetail> hospitalDetailsLastUpdatedBy;
	
	//bi-directional many-to-one association to Followup
	@OneToMany(mappedBy="createdBy")
	private List<Followup> followupCreatedBy;

	//bi-directional many-to-one association to Followup
	@OneToMany(mappedBy="lastUpdatedBy")
	private List<Followup> followupLastUpdatedBy;
	
	//bi-directional many-to-one association to FollowupSchedule
	@OneToMany(mappedBy="createdBy")
	private List<FollowupSchedule> followupSchedulesCreatedBy;

	//bi-directional many-to-one association to FollowupSchedule
	@OneToMany(mappedBy="lastUpdatedBy")
	private List<FollowupSchedule> followupSchedulesLastUpdatedBy;
	

	public NrcUser() {
	}

	public int getUId() {
		return this.uId;
	}

	public void setUId(int uId) {
		this.uId = uId;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	

	public Timestamp getLastLoggedIn() {
		return lastLoggedIn;
	}

	public void setLastLoggedIn(Timestamp lastLoggedIn) {
		this.lastLoggedIn = lastLoggedIn;
	}

	public List<CaseDetail> getCaseDetailsCreatedBy() {
		return this.caseDetailsCreatedBy;
	}

	public void setCaseDetailsCreatedBy(List<CaseDetail> caseDetailsCreatedBy) {
		this.caseDetailsCreatedBy = caseDetailsCreatedBy;
	}

	public CaseDetail addCaseDetailsCreatedBy(CaseDetail caseDetailsCreatedBy) {
		getCaseDetailsCreatedBy().add(caseDetailsCreatedBy);
		caseDetailsCreatedBy.setCreatedBy(this);

		return caseDetailsCreatedBy;
	}

	public CaseDetail removeCaseDetailsCreatedBy(CaseDetail caseDetailsCreatedBy) {
		getCaseDetailsCreatedBy().remove(caseDetailsCreatedBy);
		caseDetailsCreatedBy.setCreatedBy(null);

		return caseDetailsCreatedBy;
	}

	public List<CaseDetail> getCaseDetailsLastUpdatedBy() {
		return this.caseDetailsLastUpdatedBy;
	}

	public void setCaseDetailsLastUpdatedBy(List<CaseDetail> caseDetailsLastUpdatedBy) {
		this.caseDetailsLastUpdatedBy = caseDetailsLastUpdatedBy;
	}

	public CaseDetail addCaseDetailsLastUpdatedBy(CaseDetail caseDetailsLastUpdatedBy) {
		getCaseDetailsCreatedBy().add(caseDetailsLastUpdatedBy);
		caseDetailsLastUpdatedBy.setLastUpdatedBy(this);

		return caseDetailsLastUpdatedBy;
	}

	public CaseDetail removeCaseDetailsLastUpdatedBy(CaseDetail caseDetailsLastUpdatedBy) {
		getCaseDetailsCreatedBy().remove(caseDetailsLastUpdatedBy);
		caseDetailsLastUpdatedBy.setLastUpdatedBy(null);

		return caseDetailsLastUpdatedBy;
	}

	public List<ChildDemography> getChildCreatedBy() {
		return childCreatedBy;
	}

	public void setChildCreatedBy(List<ChildDemography> childCreatedBy) {
		this.childCreatedBy = childCreatedBy;
	}

	public ChildDemography addChildCreatedBy(ChildDemography childCreatedBy) {
		getChildCreatedBy().add(childCreatedBy);
		childCreatedBy.setCreatedBy(this);

		return childCreatedBy;
	}

	public ChildDemography removeChildCreatedBy(ChildDemography childCreatedBy) {
		getChildCreatedBy().remove(childCreatedBy);
		childCreatedBy.setCreatedBy(null);

		return childCreatedBy;
	}

	public List<ChildDemography> getChildLastUpdatedBy() {
		return childLastUpdatedBy;
	}

	public void setChildLastUpdatedBy(List<ChildDemography> childLastUpdatedBy) {
		this.childLastUpdatedBy = childLastUpdatedBy;
	}

	public ChildDemography addChildLastUpdatedBy(ChildDemography childLastUpdatedBy) {
		getChildLastUpdatedBy().add(childLastUpdatedBy);
		childLastUpdatedBy.setLastUpdatedBy(this);

		return childLastUpdatedBy;
	}

	public ChildDemography removeChildLastUpdatedBy(ChildDemography childLastUpdatedBy) {
		getChildLastUpdatedBy().remove(childLastUpdatedBy);
		childLastUpdatedBy.setLastUpdatedBy(null);

		return childLastUpdatedBy;
	}

	public List<Doctor> getDoctorCreatedBy() {
		return this.doctorCreatedBy;
	}

	public void setDoctorCreatedBy(List<Doctor> doctorCreatedBy) {
		this.doctorCreatedBy = doctorCreatedBy;
	}

	public Doctor addDoctorCreatedBy(Doctor doctorCreatedBy) {
		getDoctorCreatedBy().add(doctorCreatedBy);
		doctorCreatedBy.setCreatedBy(this);

		return doctorCreatedBy;
	}

	public Doctor removeDoctorCreatedBy(Doctor doctorCreatedBy) {
		getDoctorCreatedBy().remove(doctorCreatedBy);
		doctorCreatedBy.setCreatedBy(null);

		return doctorCreatedBy;
	}

	public List<Doctor> getDoctorLastUpdatedBy() {
		return this.doctorLastUpdatedBy;
	}

	public void setDoctorLastUpdatedBy(List<Doctor> doctorLastUpdatedBy) {
		this.doctorLastUpdatedBy = doctorLastUpdatedBy;
	}

	public Doctor addDoctorLastUpdatedBy(Doctor doctorLastUpdatedBy) {
		getDoctorLastUpdatedBy().add(doctorLastUpdatedBy);
		doctorLastUpdatedBy.setLastUpdatedBy(this);

		return doctorLastUpdatedBy;
	}

	public Doctor removeDoctorLastUpdatedBy(Doctor doctorLastUpdatedBy) {
		getDoctorLastUpdatedBy().remove(doctorLastUpdatedBy);
		doctorLastUpdatedBy.setLastUpdatedBy(null);

		return doctorLastUpdatedBy;
	}

	public List<MotherDemogrphy> getMotherCreatedBy() {
		return this.motherCreatedBy;
	}

	public void setMotherCreatedBy(List<MotherDemogrphy> motherCreatedBy) {
		this.motherCreatedBy = motherCreatedBy;
	}

	public MotherDemogrphy addMotherCreatedBy(MotherDemogrphy motherCreatedBy) {
		getMotherCreatedBy().add(motherCreatedBy);
		motherCreatedBy.setCreatedBy(this);

		return motherCreatedBy;
	}

	public MotherDemogrphy removeMotherCreatedBy(MotherDemogrphy motherCreatedBy) {
		getMotherCreatedBy().remove(motherCreatedBy);
		motherCreatedBy.setCreatedBy(null);

		return motherCreatedBy;
	}

	public List<MotherDemogrphy> getMotherLastUpdatedBy() {
		return this.motherLastUpdatedBy;
	}

	public void setMotherLastUpdatedBy(List<MotherDemogrphy> motherLastUpdatedBy) {
		this.motherLastUpdatedBy = motherLastUpdatedBy;
	}

	public MotherDemogrphy addMotherLastUpdatedBy(MotherDemogrphy motherLastUpdatedBy) {
		getMotherLastUpdatedBy().add(motherLastUpdatedBy);
		motherLastUpdatedBy.setLastUpdatedBy(this);

		return motherLastUpdatedBy;
	}

	public MotherDemogrphy removeMotherLastUpdatedBy(MotherDemogrphy motherLastUpdatedBy) {
		getMotherLastUpdatedBy().remove(motherLastUpdatedBy);
		motherLastUpdatedBy.setLastUpdatedBy(null);

		return motherLastUpdatedBy;
	}

	public Hospital getHospital() {
		return this.hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public List<AdmissionComorbidCondition> getAdmissionComorbidCreatedBy() {
		return this.admissionComorbidCreatedBy;
	}

	public void setAdmissionComorbidCreatedBy(List<AdmissionComorbidCondition> admissionComorbidCreatedBy) {
		this.admissionComorbidCreatedBy = admissionComorbidCreatedBy;
	}

	public AdmissionComorbidCondition addAdmissionComorbidCreatedBy(
			AdmissionComorbidCondition admissionComorbidCreatedBy) {
		getAdmissionComorbidCreatedBy().add(admissionComorbidCreatedBy);
		admissionComorbidCreatedBy.setCreatedBy(this);

		return admissionComorbidCreatedBy;
	}

	public AdmissionComorbidCondition removeAdmissionComorbidCreatedBy(
			AdmissionComorbidCondition admissionComorbidCreatedBy) {
		getAdmissionComorbidCreatedBy().remove(admissionComorbidCreatedBy);
		admissionComorbidCreatedBy.setCreatedBy(null);

		return admissionComorbidCreatedBy;
	}

	public List<AdmissionComorbidCondition> getAdmissionComorbidLastUpdatedBy() {
		return this.admissionComorbidLastUpdatedBy;
	}

	public void setAdmissionComorbidLastUpdatedBy(List<AdmissionComorbidCondition> admissionComorbidLastUpdatedBy) {
		this.admissionComorbidLastUpdatedBy = admissionComorbidLastUpdatedBy;
	}

	public AdmissionComorbidCondition addAdmissionComorbidLastUpdatedBy(
			AdmissionComorbidCondition admissionComorbidLastUpdatedBy) {
		getAdmissionComorbidCreatedBy().add(admissionComorbidLastUpdatedBy);
		admissionComorbidLastUpdatedBy.setLastUpdatedBy(this);
		return admissionComorbidLastUpdatedBy;
	}

	public AdmissionComorbidCondition removeAdmissionComorbidLastUpdatedBy(
			AdmissionComorbidCondition admissionComorbidLastUpdatedBy) {
		getAdmissionComorbidCreatedBy().remove(admissionComorbidLastUpdatedBy);
		admissionComorbidLastUpdatedBy.setLastUpdatedBy(null);

		return admissionComorbidLastUpdatedBy;
	}

	public List<AdmissionCriteria> getAdmissionCriteriaCreatedBy() {
		return this.admissionCriteriaCreatedBy;
	}

	public void setAdmissionCriteriaCreatedBy(List<AdmissionCriteria> admissionCriteriaCreatedBy) {
		this.admissionCriteriaCreatedBy = admissionCriteriaCreatedBy;
	}

	public AdmissionCriteria addAdmissionCriteriaCreatedBy(AdmissionCriteria admissionCriteriaCreatedBy) {
		getAdmissionCriteriaCreatedBy().add(admissionCriteriaCreatedBy);
		admissionCriteriaCreatedBy.setCreatedBy(this);

		return admissionCriteriaCreatedBy;
	}

	public AdmissionCriteria removeAdmissionCriteriaCreatedBy(AdmissionCriteria admissionCriteriaCreatedBy) {
		getAdmissionCriteriaCreatedBy().remove(admissionCriteriaCreatedBy);
		admissionCriteriaCreatedBy.setCreatedBy(null);

		return admissionCriteriaCreatedBy;
	}

	public List<AdmissionCriteria> getAdmissionCriteriaLastUpdatedBy() {
		return this.admissionCriteriaLastUpdatedBy;
	}

	public void setAdmissionCriteriaLastUpdatedBy(List<AdmissionCriteria> admissionCriteriaLastUpdatedBy) {
		this.admissionCriteriaLastUpdatedBy = admissionCriteriaLastUpdatedBy;
	}

	public AdmissionCriteria addAdmissionCriteriaLastUpdatedBy(AdmissionCriteria admissionCriteriaLastUpdatedBy) {
		getAdmissionCriteriaLastUpdatedBy().add(admissionCriteriaLastUpdatedBy);
		admissionCriteriaLastUpdatedBy.setLastUpdatedBy(this);

		return admissionCriteriaLastUpdatedBy;
	}

	public AdmissionCriteria removeAdmissionCriteriaLastUpdatedBy(AdmissionCriteria admissionCriteriaLastUpdatedBy) {
		getAdmissionCriteriaLastUpdatedBy().remove(admissionCriteriaLastUpdatedBy);
		admissionCriteriaLastUpdatedBy.setLastUpdatedBy(null);

		return admissionCriteriaLastUpdatedBy;
	}

	public List<CaseAllocation> getCaseAlloCreatedBy() {
		return this.caseAlloCreatedBy;
	}

	public void setCaseAlloCreatedBy(List<CaseAllocation> caseAlloCreatedBy) {
		this.caseAlloCreatedBy = caseAlloCreatedBy;
	}

	public CaseAllocation addCaseAlloCreatedBy(CaseAllocation caseAlloCreatedBy) {
		getCaseAlloCreatedBy().add(caseAlloCreatedBy);
		caseAlloCreatedBy.setCreatedBy(this);

		return caseAlloCreatedBy;
	}

	public CaseAllocation removeCaseAlloCreatedBy(CaseAllocation caseAlloCreatedBy) {
		getCaseAlloCreatedBy().remove(caseAlloCreatedBy);
		caseAlloCreatedBy.setCreatedBy(null);

		return caseAlloCreatedBy;
	}

	public List<CaseAllocation> getCaseAlloLastUpdatedBy() {
		return this.caseAlloLastUpdatedBy;
	}

	public void setCaseAlloLastUpdatedBy(List<CaseAllocation> caseAlloLastUpdatedBy) {
		this.caseAlloLastUpdatedBy = caseAlloLastUpdatedBy;
	}

	public CaseAllocation addCaseAlloLastUpdatedBy(CaseAllocation caseAlloLastUpdatedBy) {
		getCaseAlloLastUpdatedBy().add(caseAlloLastUpdatedBy);
		caseAlloLastUpdatedBy.setLastUpdatedBy(this);

		return caseAlloLastUpdatedBy;
	}

	public CaseAllocation removeCaseAlloLastUpdatedBy(CaseAllocation caseAlloLastUpdatedBy) {
		getCaseAlloLastUpdatedBy().remove(caseAlloLastUpdatedBy);
		caseAlloLastUpdatedBy.setLastUpdatedBy(null);

		return caseAlloLastUpdatedBy;
	}

	public List<ChildGrowth> getChildGrowthCreatedBy() {
		return this.childGrowthCreatedBy;
	}

	public void setChildGrowthCreatedBy(List<ChildGrowth> childGrowthCreatedBy) {
		this.childGrowthCreatedBy = childGrowthCreatedBy;
	}

	public ChildGrowth addChildGrowthCreatedBy(ChildGrowth childGrowthCreatedBy) {
		getChildGrowthCreatedBy().add(childGrowthCreatedBy);
		childGrowthCreatedBy.setCreatedBy(this);

		return childGrowthCreatedBy;
	}

	public ChildGrowth removeChildGrowthCreatedBy(ChildGrowth childGrowthCreatedBy) {
		getChildGrowthCreatedBy().remove(childGrowthCreatedBy);
		childGrowthCreatedBy.setCreatedBy(null);

		return childGrowthCreatedBy;
	}

	public List<ChildGrowth> getChildGrowthLastUpdatedBy() {
		return this.childGrowthLastUpdatedBy;
	}

	public void setChildGrowthLastUpdatedBy(List<ChildGrowth> childGrowthLastUpdatedBy) {
		this.childGrowthLastUpdatedBy = childGrowthLastUpdatedBy;
	}

	public ChildGrowth addChildGrowthLastUpdatedBy(ChildGrowth childGrowthLastUpdatedBy) {
		getChildGrowthLastUpdatedBy().add(childGrowthLastUpdatedBy);
		childGrowthLastUpdatedBy.setLastUpdatedBy(this);

		return childGrowthLastUpdatedBy;
	}

	public ChildGrowth removeChildGrowthLastUpdatedBy(ChildGrowth childGrowthLastUpdatedBy) {
		getChildGrowthLastUpdatedBy().remove(childGrowthLastUpdatedBy);
		childGrowthLastUpdatedBy.setLastUpdatedBy(null);

		return childGrowthLastUpdatedBy;
	}

	public List<CaseReferral> getCaseRefCreatedBy() {
		return this.caseRefCreatedBy;
	}

	public void setCaseRefCreatedBy(List<CaseReferral> caseRefCreatedBy) {
		this.caseRefCreatedBy = caseRefCreatedBy;
	}

	public CaseReferral addCaseRefCreatedBy(CaseReferral caseRefCreatedBy) {
		getCaseRefCreatedBy().add(caseRefCreatedBy);
		caseRefCreatedBy.setCreatedBy(this);

		return caseRefCreatedBy;
	}

	public CaseReferral removeCaseRefCreatedBy(CaseReferral caseRefCreatedBy) {
		getCaseRefCreatedBy().remove(caseRefCreatedBy);
		caseRefCreatedBy.setCreatedBy(null);

		return caseRefCreatedBy;
	}

	public List<CaseReferral> getCaseRefLastUpdatedBy() {
		return this.caseRefLastUpdatedBy;
	}

	public void setCaseRefLastUpdatedBy(List<CaseReferral> caseRefLastUpdatedBy) {
		this.caseRefLastUpdatedBy = caseRefLastUpdatedBy;
	}

	public CaseReferral addCaseRefLastUpdatedBy(CaseReferral caseRefLastUpdatedBy) {
		getCaseRefLastUpdatedBy().add(caseRefLastUpdatedBy);
		caseRefLastUpdatedBy.setLastUpdatedBy(this);

		return caseRefLastUpdatedBy;
	}

	public CaseReferral removeCaseRefLastUpdatedBy(CaseReferral caseRefLastUpdatedBy) {
		getCaseRefLastUpdatedBy().remove(caseRefLastUpdatedBy);
		caseRefLastUpdatedBy.setLastUpdatedBy(null);

		return caseRefLastUpdatedBy;
	}


	public List<CaseMotherDetail> getCaseMotherDetCreatedBy() {
		return this.caseMotherDetCreatedBy;
	}

	public void setCaseMotherDetCreatedBy(List<CaseMotherDetail> caseMotherDetCreatedBy) {
		this.caseMotherDetCreatedBy = caseMotherDetCreatedBy;
	}

	public CaseMotherDetail addCaseMotherDetCreatedBy(CaseMotherDetail caseMotherDetCreatedBy) {
		getCaseMotherDetCreatedBy().add(caseMotherDetCreatedBy);
		caseMotherDetCreatedBy.setCreatedBy(this);

		return caseMotherDetCreatedBy;
	}

	public CaseMotherDetail removeCaseMotherDetCreatedBy(CaseMotherDetail caseMotherDetCreatedBy) {
		getCaseMotherDetCreatedBy().remove(caseMotherDetCreatedBy);
		caseMotherDetCreatedBy.setCreatedBy(null);

		return caseMotherDetCreatedBy;
	}

	public List<CaseMotherDetail> getCaseMotherDetLastUpdatedBy() {
		return this.caseMotherDetLastUpdatedBy;
	}

	public void setCaseMotherDetLastUpdatedBy(List<CaseMotherDetail> caseMotherDetLastUpdatedBy) {
		this.caseMotherDetLastUpdatedBy = caseMotherDetLastUpdatedBy;
	}

	public CaseMotherDetail addCaseMotherDetLastUpdatedBy(CaseMotherDetail caseMotherDetLastUpdatedBy) {
		getCaseMotherDetLastUpdatedBy().add(caseMotherDetLastUpdatedBy);
		caseMotherDetLastUpdatedBy.setLastUpdatedBy(this);

		return caseMotherDetLastUpdatedBy;
	}

	public CaseMotherDetail removeCaseMotherDetLastUpdatedBy(CaseMotherDetail caseMotherDetLastUpdatedBy) {
		getCaseMotherDetLastUpdatedBy().remove(caseMotherDetLastUpdatedBy);
		caseMotherDetLastUpdatedBy.setLastUpdatedBy(null);

		return caseMotherDetLastUpdatedBy;
	}

	public List<CaseMotherGrowth> getCaseMotherGrowthCreatedBy() {
		return this.caseMotherGrowthCreatedBy;
	}

	public void setCaseMotherGrowthCreatedBy(List<CaseMotherGrowth> caseMotherGrowthCreatedBy) {
		this.caseMotherGrowthCreatedBy = caseMotherGrowthCreatedBy;
	}

	public CaseMotherGrowth addCaseMotherGrowthCreatedBy(CaseMotherGrowth caseMotherGrowthCreatedBy) {
		getCaseMotherGrowthCreatedBy().add(caseMotherGrowthCreatedBy);
		caseMotherGrowthCreatedBy.setCreatedBy(this);

		return caseMotherGrowthCreatedBy;
	}

	public CaseMotherGrowth removeCaseMotherGrowthCreatedBy(CaseMotherGrowth caseMotherGrowthCreatedBy) {
		getCaseMotherGrowthCreatedBy().remove(caseMotherGrowthCreatedBy);
		caseMotherGrowthCreatedBy.setCreatedBy(null);

		return caseMotherGrowthCreatedBy;
	}

	public List<CaseMotherGrowth> getCaseMotherGrowthLastUpdatedBy() {
		return this.caseMotherGrowthLastUpdatedBy;
	}

	public void setCaseMotherGrowthLastUpdatedBy(List<CaseMotherGrowth> caseMotherGrowthLastUpdatedBy) {
		this.caseMotherGrowthLastUpdatedBy = caseMotherGrowthLastUpdatedBy;
	}

	public CaseMotherGrowth addCaseMotherGrowthLastUpdatedBy(CaseMotherGrowth caseMotherGrowthLastUpdatedBy) {
		getCaseMotherGrowthLastUpdatedBy().add(caseMotherGrowthLastUpdatedBy);
		caseMotherGrowthLastUpdatedBy.setLastUpdatedBy(this);

		return caseMotherGrowthLastUpdatedBy;
	}

	public CaseMotherGrowth removeCaseMotherGrowthLastUpdatedBy(CaseMotherGrowth caseMotherGrowthLastUpdatedBy) {
		getCaseMotherGrowthLastUpdatedBy().remove(caseMotherGrowthLastUpdatedBy);
		caseMotherGrowthLastUpdatedBy.setLastUpdatedBy(null);

		return caseMotherGrowthLastUpdatedBy;
	}

	public List<CaseMotherSocialFactor> getCaseMotherSocialCreatedBy() {
		return this.caseMotherSocialCreatedBy;
	}

	public void setCaseMotherSocialCreatedBy(List<CaseMotherSocialFactor> caseMotherSocialCreatedBy) {
		this.caseMotherSocialCreatedBy = caseMotherSocialCreatedBy;
	}

	public CaseMotherSocialFactor addCaseMotherSocialCreatedBy(CaseMotherSocialFactor caseMotherSocialCreatedBy) {
		getCaseMotherSocialCreatedBy().add(caseMotherSocialCreatedBy);
		caseMotherSocialCreatedBy.setCreatedBy(this);

		return caseMotherSocialCreatedBy;
	}

	public CaseMotherSocialFactor removeCaseMotherSocialCreatedBy(CaseMotherSocialFactor caseMotherSocialCreatedBy) {
		getCaseMotherSocialCreatedBy().remove(caseMotherSocialCreatedBy);
		caseMotherSocialCreatedBy.setCreatedBy(null);

		return caseMotherSocialCreatedBy;
	}

	public List<CaseMotherSocialFactor> getCaseMotherSocialLastUpdatedBy() {
		return this.caseMotherSocialLastUpdatedBy;
	}

	public void setCaseMotherSocialLastUpdatedBy(List<CaseMotherSocialFactor> caseMotherSocialLastUpdatedBy) {
		this.caseMotherSocialLastUpdatedBy = caseMotherSocialLastUpdatedBy;
	}

	public CaseMotherSocialFactor addCaseMotherSocialLastUpdatedBy(
			CaseMotherSocialFactor caseMotherSocialLastUpdatedBy) {
		getCaseMotherSocialLastUpdatedBy().add(caseMotherSocialLastUpdatedBy);
		caseMotherSocialLastUpdatedBy.setLastUpdatedBy(this);

		return caseMotherSocialLastUpdatedBy;
	}

	public CaseMotherSocialFactor removeCaseMotherSocialLastUpdatedBy(
			CaseMotherSocialFactor caseMotherSocialLastUpdatedBy) {
		getCaseMotherSocialLastUpdatedBy().remove(caseMotherSocialLastUpdatedBy);
		caseMotherSocialLastUpdatedBy.setLastUpdatedBy(null);

		return caseMotherSocialLastUpdatedBy;
	}
	
	public List<DischargeComorbidCondition> getDiscComCreatedBy() {
		return this.discComCreatedBy;
	}

	public void setDiscComCreatedBy(List<DischargeComorbidCondition> discComCreatedBy) {
		this.discComCreatedBy = discComCreatedBy;
	}

	public DischargeComorbidCondition addDiscComCreatedBy(DischargeComorbidCondition discComCreatedBy) {
		getDiscComCreatedBy().add(discComCreatedBy);
		discComCreatedBy.setCreatedBy(this);

		return discComCreatedBy;
	}

	public DischargeComorbidCondition removeDiscComCreatedBy(DischargeComorbidCondition discComCreatedBy) {
		getDiscComCreatedBy().remove(discComCreatedBy);
		discComCreatedBy.setCreatedBy(null);

		return discComCreatedBy;
	}

	public List<DischargeComorbidCondition> getDiscComLastUpdatedBy() {
		return this.discComLastUpdatedBy;
	}

	public void setDiscComLastUpdatedBy(List<DischargeComorbidCondition> discComLastUpdatedBy) {
		this.discComLastUpdatedBy = discComLastUpdatedBy;
	}

	public DischargeComorbidCondition addDiscComLastUpdatedBy(DischargeComorbidCondition discComLastUpdatedBy) {
		getDiscComCreatedBy().add(discComLastUpdatedBy);
		discComLastUpdatedBy.setLastUpdatedBy(this);

		return discComLastUpdatedBy;
	}

	public DischargeComorbidCondition removeDiscComLastUpdatedBy(DischargeComorbidCondition discComLastUpdatedBy) {
		getDiscComCreatedBy().remove(discComLastUpdatedBy);
		discComLastUpdatedBy.setLastUpdatedBy(null);

		return discComLastUpdatedBy;
	}
	
	
	public List<DischargeChildDetail> getDisChildCreatedBy() {
		return this.disChildCreatedBy;
	}

	public void setDisChildCreatedBy(List<DischargeChildDetail> disChildCreatedBy) {
		this.disChildCreatedBy = disChildCreatedBy;
	}

	public DischargeChildDetail addDisChildCreatedBy(DischargeChildDetail disChildCreatedBy) {
		getDisChildCreatedBy().add(disChildCreatedBy);
		disChildCreatedBy.setCreatedBy(this);

		return disChildCreatedBy;
	}

	public DischargeChildDetail removeDisChildCreatedBy(DischargeChildDetail disChildCreatedBy) {
		getDisChildCreatedBy().remove(disChildCreatedBy);
		disChildCreatedBy.setCreatedBy(null);

		return disChildCreatedBy;
	}

	public List<DischargeChildDetail> getDisChildLastUpdatedBy() {
		return this.disChildLastUpdatedBy;
	}

	public void setDisChildLastUpdatedBy(List<DischargeChildDetail> disChildLastUpdatedBy) {
		this.disChildLastUpdatedBy = disChildLastUpdatedBy;
	}

	public DischargeChildDetail addDisChildLastUpdatedBy(DischargeChildDetail disChildLastUpdatedBy) {
		getDisChildLastUpdatedBy().add(disChildLastUpdatedBy);
		disChildLastUpdatedBy.setLastUpdatedBy(this);

		return disChildLastUpdatedBy;
	}

	public DischargeChildDetail removeDisChildLastUpdatedBy(DischargeChildDetail disChildLastUpdatedBy) {
		getDisChildLastUpdatedBy().remove(disChildLastUpdatedBy);
		disChildLastUpdatedBy.setLastUpdatedBy(null);

		return disChildLastUpdatedBy;
	}
    
	
	

	public List<DischargeMotherDetail> getDisMotherLastUpdatedBy() {
		return this.disMotherLastUpdatedBy;
	}

	public void setDisMotherLastUpdatedBy(List<DischargeMotherDetail> disMotherLastUpdatedBy) {
		this.disMotherLastUpdatedBy = disMotherLastUpdatedBy;
	}

	public DischargeMotherDetail addDisMotherLastUpdatedBy(DischargeMotherDetail disMotherLastUpdatedBy) {
		getDisMotherLastUpdatedBy().add(disMotherLastUpdatedBy);
		disMotherLastUpdatedBy.setLastUpdatedBy(this);

		return disMotherLastUpdatedBy;
	}

	public DischargeMotherDetail removeDisMotherLastUpdatedBy(DischargeMotherDetail disMotherLastUpdatedBy) {
		getDisMotherLastUpdatedBy().remove(disMotherLastUpdatedBy);
		disMotherLastUpdatedBy.setLastUpdatedBy(null);

		return disMotherLastUpdatedBy;
	}
	
	public List<DischargeMotherDetail> getDisMotherCreatedBy() {
		return this.disMotherCreatedBy;
	}

	public void setDisMotherCreatedBy(List<DischargeMotherDetail> disMotherCreatedBy) {
		this.disMotherCreatedBy = disMotherCreatedBy;
	}

	public DischargeMotherDetail addDisMotherCreatedBy(DischargeMotherDetail disMotherCreatedBy) {
		getDisMotherCreatedBy().add(disMotherCreatedBy);
		disMotherCreatedBy.setCreatedBy(this);

		return disMotherCreatedBy;
	}

	public DischargeMotherDetail removeDisMotherCreatedBy(DischargeMotherDetail disMotherCreatedBy) {
		getDisMotherCreatedBy().remove(disMotherCreatedBy);
		disMotherCreatedBy.setCreatedBy(null);

		return disMotherCreatedBy;
	}

	public List<HospitalDetail> getHospitalDetailsCreatedBy() {
		return this.hospitalDetailsCreatedBy;
	}

	public void setHospitalDetailsCreatedBy(List<HospitalDetail> hospitalDetailsCreatedBy) {
		this.hospitalDetailsCreatedBy = hospitalDetailsCreatedBy;
	}

	public HospitalDetail addHosptialDetailCreatedBy(HospitalDetail hospitalDetailsCreatedBy) {
		getHospitalDetailsCreatedBy().add(hospitalDetailsCreatedBy);
		hospitalDetailsCreatedBy.setCreatedBy(this);

		return hospitalDetailsCreatedBy;
	}

	public HospitalDetail removeHosptialDetailCreatedBy(HospitalDetail hospitalDetailsCreatedBy) {
		getHospitalDetailsCreatedBy().remove(hospitalDetailsCreatedBy);
		hospitalDetailsCreatedBy.setCreatedBy(null);

		return hospitalDetailsCreatedBy;
	}
	
	public List<HospitalDetail> getHospitalDetailsLastUpdatedBy() {
		return this.hospitalDetailsLastUpdatedBy;
	}

	public void setHospitalDetailsLastUpdatedBy(List<HospitalDetail> hospitalDetailsLastUpdatedBy) {
		this.hospitalDetailsLastUpdatedBy = hospitalDetailsLastUpdatedBy;
	}

	public HospitalDetail addHospitalDetailsLastUpdatedBy(HospitalDetail hospitalDetailsLastUpdatedBy) {
		getHospitalDetailsLastUpdatedBy().add(hospitalDetailsLastUpdatedBy);
		hospitalDetailsLastUpdatedBy.setCreatedBy(this);

		return hospitalDetailsLastUpdatedBy;
	}

	public HospitalDetail removeHospitalDetailsLastUpdatedBy(HospitalDetail hospitalDetailsLastUpdatedBy) {
		getHospitalDetailsLastUpdatedBy().remove(hospitalDetailsLastUpdatedBy);
		hospitalDetailsLastUpdatedBy.setCreatedBy(null);

		return hospitalDetailsLastUpdatedBy;
	}
	
	public List<Followup> getFollowupCreatedBy() {
		return this.followupCreatedBy;
	}

	public void setFollowupCreatedBy(List<Followup> followupCreatedBy) {
		this.followupCreatedBy = followupCreatedBy;
	}

	public Followup addFollowupCreatedBy(Followup followupCreatedBy) {
		getFollowupCreatedBy().add(followupCreatedBy);
		followupCreatedBy.setCreatedBy(this);

		return followupCreatedBy;
	}

	public Followup removeFollowupCreatedBy(Followup followupCreatedBy) {
		getFollowupCreatedBy().remove(followupCreatedBy);
		followupCreatedBy.setCreatedBy(null);

		return followupCreatedBy;
	}
	
	public List<Followup> getFollowupLastUpdatedBy() {
		return this.followupLastUpdatedBy;
	}

	public void setFollowupLastUpdatedBy(List<Followup> followupLastUpdatedBy) {
		this.followupLastUpdatedBy = followupLastUpdatedBy;
	}

	public Followup addFollowupLastUpdatedBy(Followup followupLastUpdatedBy) {
		getFollowupLastUpdatedBy().add(followupLastUpdatedBy);
		followupLastUpdatedBy.setLastUpdatedBy(this);
		return followupLastUpdatedBy;
	}

	public Followup removeFollowupLastUpdatedBy(Followup followupLastUpdatedBy) {
		getFollowupLastUpdatedBy().remove(followupLastUpdatedBy);
		followupLastUpdatedBy.setLastUpdatedBy(null);
		return followupLastUpdatedBy;
	}

	public List<FollowupSchedule> getFollowupSchedulesCreatedBy() {
		return followupSchedulesCreatedBy;
	}

	public void setFollowupSchedulesCreatedBy(List<FollowupSchedule> followupSchedulesCreatedBy) {
		this.followupSchedulesCreatedBy = followupSchedulesCreatedBy;
	}


	public FollowupSchedule addFollowupSchedulesCreatedBy(FollowupSchedule followupSchedulesCreatedBy) {
		getFollowupSchedulesCreatedBy().add(followupSchedulesCreatedBy);
		followupSchedulesCreatedBy.setCreatedBy(this);

		return followupSchedulesCreatedBy;
	}

	public FollowupSchedule removeFollowupSchedulesCreatedBy(FollowupSchedule followupSchedulesCreatedBy) {
		getFollowupSchedulesCreatedBy().remove(followupSchedulesCreatedBy);
		followupSchedulesCreatedBy.setCreatedBy(null);

		return followupSchedulesCreatedBy;
	}

	public List<FollowupSchedule> getFollowupSchedulesLastUpdatedBy() {
		return followupSchedulesLastUpdatedBy;
	}

	public void setFollowupSchedulesLastUpdatedBy(List<FollowupSchedule> followupSchedulesLastUpdatedBy) {
		this.followupSchedulesLastUpdatedBy = followupSchedulesLastUpdatedBy;
	}


	public FollowupSchedule addFollowupSchedulesLastUpdatedBy(FollowupSchedule followupSchedulesLastUpdatedBy) {
		getFollowupSchedulesLastUpdatedBy().add(followupSchedulesLastUpdatedBy);
		followupSchedulesLastUpdatedBy.setLastUpdatedBy(this);

		return followupSchedulesLastUpdatedBy;
	}

	public FollowupSchedule removeFollowupSchedulesLastUpdatedBy(FollowupSchedule followupSchedulesLastUpdatedBy) {
		getFollowupSchedulesLastUpdatedBy().remove(followupSchedulesLastUpdatedBy);
		followupSchedulesLastUpdatedBy.setLastUpdatedBy(null);

		return followupSchedulesLastUpdatedBy;
	}
}