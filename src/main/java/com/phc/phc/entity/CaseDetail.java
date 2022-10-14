package com.phc.phc.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * The persistent class for the case_details database table.
 * 
 */
@Entity
@Table(name = "nr.case_details")
@NamedQuery(name = "CaseDetail.findAll", query = "SELECT c FROM CaseDetail c")
public class CaseDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "case_id")
	private int caseId;

	@Column(name = "admission_date")
	private Timestamp admissionDate;

	@Column(name = "admission_type_id")
	private int admissionTypeId;

	@Column(name = "created_on")
	private Timestamp createdOn;

	@Column(name = "discharge_date")
	private Timestamp dischargeDate;

	@Column(name = "fiscal_year")
	private String fiscalYear;

	@Column(name = "ip_num")
	private Long ipNum;

	@Column(name = "uh_id")
	private Long uhId;

	@Column(name = "last_updated_on")
	private Timestamp lastUpdatedOn;

	@Column(name = "sam_num")
	private int samNum;

	@Column(name = "target_weight")
	private BigDecimal targetWeight;

	@Column(name = "admission_sd")
	private BigDecimal admissionSd;

	@Column(name = "discharge_sd")
	private BigDecimal dischargeSd;
	
	@Column(name="target_weight_achieved")
	private Boolean targetWeightAchieved;
	
	//commented as part of Sneha-angan
	/*@Column(name="refered_from_aw")
	private Boolean referedFromAw;*/

	// bi-directional many-to-one association to AdmissionComorbidCondition
	@OneToMany(mappedBy = "caseDetail")
	@Cascade(CascadeType.SAVE_UPDATE)
	private List<AdmissionComorbidCondition> admissionComorbidConditions;

	// bi-directional many-to-one association to AdmissionCriteria
	@OneToMany(mappedBy = "caseDetail")
	@Cascade(CascadeType.SAVE_UPDATE)
	private List<AdmissionCriteria> admissionCriterias;

	// bi-directional many-to-one association to CaseAllocation
	@OneToMany(mappedBy = "caseDetail")
	@Cascade(CascadeType.SAVE_UPDATE)
	private List<CaseAllocation> caseAllocations;

	// bi-directional many-to-one association to ChildDemography
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "child_id")
	private ChildDemography childDemography;

	// bi-directional many-to-one association to Doctor
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "addmited_by_doctor")
	private Doctor addmittedByDoctor;

	// bi-directional many-to-one association to Doctor
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "discharged_by_doctor")
	private Doctor dischargedByDoctor;

	// bi-directional many-to-one association to Hospital
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "h_id")
	private Hospital hospital;

	// bi-directional many-to-one association to MotherDemogrphy
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mother_id")
	private MotherDemogrphy motherDemogrphy;

	// bi-directional many-to-one association to NrcUser
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "created_by")
	private NrcUser createdBy;

	// bi-directional many-to-one association to NrcUser
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "last_updated_by")
	private NrcUser lastUpdatedBy;

	// bi-directional many-to-one association to CaseMotherDetail
	@OneToMany(mappedBy = "caseDetail")
	@Cascade(CascadeType.SAVE_UPDATE)
	private List<CaseMotherDetail> caseMotherDetails;

	// bi-directional many-to-one association to CaseMotherGrowth
	@OneToMany(mappedBy = "caseDetail")
	@Cascade(CascadeType.SAVE_UPDATE)
	private List<CaseMotherGrowth> caseMotherGrowths;

	// bi-directional many-to-one association to CaseMotherSocialFactor
	@OneToMany(mappedBy = "caseDetail")
	@Cascade(CascadeType.SAVE_UPDATE)
	private List<CaseMotherSocialFactor> caseMotherSocialFactors;

	// bi-directional many-to-one association to CaseReferral
	@OneToMany(mappedBy = "caseDetail")
	@Cascade(CascadeType.SAVE_UPDATE)
	private List<CaseReferral> caseReferrals;

	// bi-directional many-to-one association to ChildGrowth
	@OneToMany(mappedBy = "caseDetail")
	@Cascade(CascadeType.SAVE_UPDATE)
	private List<ChildGrowth> childGrowths;

	// bi-directional many-to-one association to DischargeChildDetail
	@OneToMany(mappedBy = "caseDetail")
	@Cascade(CascadeType.SAVE_UPDATE)
	private List<DischargeChildDetail> dischargeChildDetails;

	// bi-directional many-to-one association to DischargeComorbidCondition
	@OneToMany(mappedBy = "caseDetail")
	@Cascade(CascadeType.SAVE_UPDATE)
	private List<DischargeComorbidCondition> dischargeComorbidConditions;

	// bi-directional many-to-one association to DischargeMotherDetail
	@OneToMany(mappedBy = "caseDetail")
	@Cascade(CascadeType.SAVE_UPDATE)
	private List<DischargeMotherDetail> dischargeMotherDetails;
	
	//bi-directional many-to-one association to Followup
	@OneToMany(mappedBy="caseDetail")
	private List<Followup> followups;
	
	//bi-directional many-to-one association to FollowupSchedule
	@OneToMany(mappedBy="caseDetail")
	private List<FollowupSchedule> followupSchedules;
	
	//commented as part of Sneha-angan
	//bi-directional many-to-one association to NrcSnehaMapping
	/*@OneToMany(mappedBy="caseDetail")
	@Cascade(CascadeType.SAVE_UPDATE)
	private List<NrcSnehaMapping> nrcSnehaMappings;
	
	//bi-directional many-to-one association to AwGrowthDetail
	@OneToMany(mappedBy="caseDetail")
	@Cascade(CascadeType.SAVE_UPDATE)
	private List<AwGrowthDetail> awGrowthDetails;*/

	
	
	public CaseDetail() {
	}

	public int getCaseId() {
		return this.caseId;
	}

	public void setCaseId(int caseId) {
		this.caseId = caseId;
	}

	public Timestamp getAdmissionDate() {
		return this.admissionDate;
	}

	public void setAdmissionDate(Timestamp admissionDate) {
		this.admissionDate = admissionDate;
	}

	public int getAdmissionTypeId() {
		return this.admissionTypeId;
	}

	public void setAdmissionTypeId(int admissionTypeId) {
		this.admissionTypeId = admissionTypeId;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public Timestamp getDischargeDate() {
		return this.dischargeDate;
	}

	public void setDischargeDate(Timestamp dischargeDate) {
		this.dischargeDate = dischargeDate;
	}

	public String getFiscalYear() {
		return this.fiscalYear;
	}

	public void setFiscalYear(String fiscalYear) {
		this.fiscalYear = fiscalYear;
	}

	public BigDecimal getAdmissionSd() {
		return admissionSd;
	}

	public void setAdmissionSd(BigDecimal admissionSd) {
		this.admissionSd = admissionSd;
	}

	public BigDecimal getDischargeSd() {
		return dischargeSd;
	}

	public void setDischargeSd(BigDecimal dischargeSd) {
		this.dischargeSd = dischargeSd;
	}
	
	
	public Boolean getTargetWeightAchieved() {
		return targetWeightAchieved;
	}

	public void setTargetWeightAchieved(Boolean targetWeightAchieved) {
		this.targetWeightAchieved = targetWeightAchieved;
	}
	
	
	//commented as part of Sneha-angan
	/*public Boolean isReferedFromAw() {
		return referedFromAw;
	}

	public void setReferedFromAw(Boolean referedFromAw) {
		this.referedFromAw = referedFromAw;
	}*/

	public Long getIpNum() {
		return ipNum;
	}

	public void setIpNum(Long ipNum) {
		this.ipNum = ipNum;
	}

	public Long getUhId() {
		return uhId;
	}

	public void setUhId(Long uhId) {
		this.uhId = uhId;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public int getSamNum() {
		return this.samNum;
	}

	public void setSamNum(int samNum) {
		this.samNum = samNum;
	}

	public BigDecimal getTargetWeight() {
		return targetWeight;
	}

	public void setTargetWeight(BigDecimal targetWeight) {
		this.targetWeight = targetWeight;
	}

	public ChildDemography getChildDemography() {
		return this.childDemography;
	}

	public void setChildDemography(ChildDemography childDemography) {
		this.childDemography = childDemography;
	}

	public Doctor getAddmittedByDoctor() {
		return addmittedByDoctor;
	}

	public void setAddmittedByDoctor(Doctor addmittedByDoctor) {
		this.addmittedByDoctor = addmittedByDoctor;
	}

	public Doctor getDischargedByDoctor() {
		return dischargedByDoctor;
	}

	public void setDischargedByDoctor(Doctor dischargedByDoctor) {
		this.dischargedByDoctor = dischargedByDoctor;
	}

	public Hospital getHospital() {
		return this.hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public MotherDemogrphy getMotherDemogrphy() {
		return this.motherDemogrphy;
	}

	public void setMotherDemogrphy(MotherDemogrphy motherDemogrphy) {
		this.motherDemogrphy = motherDemogrphy;
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

	public List<AdmissionComorbidCondition> getAdmissionComorbidConditions() {
		return this.admissionComorbidConditions;
	}

	public void setAdmissionComorbidConditions(List<AdmissionComorbidCondition> admissionComorbidConditions) {
		this.admissionComorbidConditions = admissionComorbidConditions;
	}

	public AdmissionComorbidCondition addAdmissionComorbidCondition(
			AdmissionComorbidCondition admissionComorbidCondition) {
		getAdmissionComorbidConditions().add(admissionComorbidCondition);
		admissionComorbidCondition.setCaseDetail(this);

		return admissionComorbidCondition;
	}

	public AdmissionComorbidCondition removeAdmissionComorbidCondition(
			AdmissionComorbidCondition admissionComorbidCondition) {
		getAdmissionComorbidConditions().remove(admissionComorbidCondition);
		admissionComorbidCondition.setCaseDetail(null);

		return admissionComorbidCondition;
	}

	public List<AdmissionCriteria> getAdmissionCriterias() {
		return this.admissionCriterias;
	}

	public void setAdmissionCriterias(List<AdmissionCriteria> admissionCriterias) {
		this.admissionCriterias = admissionCriterias;
	}

	public AdmissionCriteria addAdmissionCriteria(AdmissionCriteria admissionCriteria) {
		getAdmissionCriterias().add(admissionCriteria);
		admissionCriteria.setCaseDetail(this);

		return admissionCriteria;
	}

	public AdmissionCriteria removeAdmissionCriteria(AdmissionCriteria admissionCriteria) {
		getAdmissionCriterias().remove(admissionCriteria);
		admissionCriteria.setCaseDetail(null);

		return admissionCriteria;
	}

	public List<CaseAllocation> getCaseAllocations() {
		return this.caseAllocations;
	}

	public void setCaseAllocations(List<CaseAllocation> caseAllocations) {
		this.caseAllocations = caseAllocations;
	}

	public CaseAllocation addCaseAllocation(CaseAllocation caseAllocation) {
		getCaseAllocations().add(caseAllocation);
		caseAllocation.setCaseDetail(this);

		return caseAllocation;
	}

	public CaseAllocation removeCaseAllocation(CaseAllocation caseAllocation) {
		getCaseAllocations().remove(caseAllocation);
		caseAllocation.setCaseDetail(null);

		return caseAllocation;
	}

	public List<ChildGrowth> getChildGrowths() {
		return this.childGrowths;
	}

	public void setChildGrowths(List<ChildGrowth> childGrowths) {
		this.childGrowths = childGrowths;
	}

	public ChildGrowth addChildGrowth(ChildGrowth childGrowth) {
		getChildGrowths().add(childGrowth);
		childGrowth.setCaseDetail(this);

		return childGrowth;
	}

	public ChildGrowth removeChildGrowth(ChildGrowth childGrowth) {
		getChildGrowths().remove(childGrowth);
		childGrowth.setCaseDetail(null);

		return childGrowth;
	}

	public List<CaseReferral> getCaseReferrals() {
		return this.caseReferrals;
	}

	public void setCaseReferrals(List<CaseReferral> caseReferrals) {
		this.caseReferrals = caseReferrals;
	}

	public CaseReferral addCaseReferral(CaseReferral caseReferral) {
		getCaseReferrals().add(caseReferral);
		caseReferral.setCaseDetail(this);

		return caseReferral;
	}

	public CaseReferral removeCaseReferral(CaseReferral caseReferral) {
		getCaseReferrals().remove(caseReferral);
		caseReferral.setCaseDetail(null);

		return caseReferral;
	}

	public List<CaseMotherDetail> getCaseMotherDetails() {
		return this.caseMotherDetails;
	}

	public void setCaseMotherDetails(List<CaseMotherDetail> caseMotherDetails) {
		this.caseMotherDetails = caseMotherDetails;
	}
    
	
	public CaseMotherDetail addCaseMotherDetails(CaseMotherDetail caseMotherDetails) {
		getCaseMotherDetails().add(caseMotherDetails);
		caseMotherDetails.setCaseDetail(this);

		return caseMotherDetails;
	}

	public CaseMotherDetail removeCaseMotherDetails(CaseMotherDetail caseMotherDetails) {
		getCaseMotherDetails().remove(caseMotherDetails);
		caseMotherDetails.setCaseDetail(null);

		return caseMotherDetails;
	}

	
	public List<CaseMotherGrowth> getCaseMotherGrowths() {
		return this.caseMotherGrowths;
	}

	public void setCaseMotherGrowths(List<CaseMotherGrowth> caseMotherGrowths) {
		this.caseMotherGrowths = caseMotherGrowths;
	}
	
	public CaseMotherGrowth addCaseMotherGrowths(CaseMotherGrowth caseMotherGrowths) {
		getCaseMotherGrowths().add(caseMotherGrowths);
		caseMotherGrowths.setCaseDetail(this);

		return caseMotherGrowths;
	}

	public CaseMotherGrowth removeCaseMotherGrowths(CaseMotherGrowth caseMotherGrowths) {
		getCaseMotherGrowths().remove(caseMotherGrowths);
		caseMotherGrowths.setCaseDetail(null);

		return caseMotherGrowths;
	}


	public List<CaseMotherSocialFactor> getCaseMotherSocialFactors() {
		return caseMotherSocialFactors;
	}

	public void setCaseMotherSocialFactors(List<CaseMotherSocialFactor> caseMotherSocialFactors) {
		this.caseMotherSocialFactors = caseMotherSocialFactors;
	}
	
	public CaseMotherSocialFactor addCaseMotherSocialFactors(CaseMotherSocialFactor caseMotherSocialFactors) {
		getCaseMotherSocialFactors().add(caseMotherSocialFactors);
		caseMotherSocialFactors.setCaseDetail(this);

		return caseMotherSocialFactors;
	}

	public CaseMotherSocialFactor removeCaseMotherSocialFactors(CaseMotherSocialFactor caseMotherSocialFactors) {
		getCaseMotherSocialFactors().remove(caseMotherSocialFactors);
		caseMotherSocialFactors.setCaseDetail(null);

		return caseMotherSocialFactors;
	}

	public List<DischargeChildDetail> getDischargeChildDetails() {
		return dischargeChildDetails;
	}

	public void setDischargeChildDetails(List<DischargeChildDetail> dischargeChildDetails) {
		this.dischargeChildDetails = dischargeChildDetails;
	}
	
	
	public DischargeChildDetail addDischargeChildDetails(DischargeChildDetail dischargeChildDetails) {
		getDischargeChildDetails().add(dischargeChildDetails);
		dischargeChildDetails.setCaseDetail(this);

		return dischargeChildDetails;
	}

	public DischargeChildDetail removeDischargeChildDetails(DischargeChildDetail dischargeChildDetails) {
		getDischargeChildDetails().remove(dischargeChildDetails);
		dischargeChildDetails.setCaseDetail(null);

		return dischargeChildDetails;
	}
	

	public List<DischargeComorbidCondition> getDischargeComorbidConditions() {
		return dischargeComorbidConditions;
	}

	public void setDischargeComorbidConditions(List<DischargeComorbidCondition> dischargeComorbidConditions) {
		this.dischargeComorbidConditions = dischargeComorbidConditions;
	}
     
	
	public DischargeComorbidCondition addDischargeComorbidConditions(DischargeComorbidCondition dischargeComorbidConditions) {
		getDischargeComorbidConditions().add(dischargeComorbidConditions);
		dischargeComorbidConditions.setCaseDetail(this);

		return dischargeComorbidConditions;
	}

	public DischargeComorbidCondition removeDischargeComorbidConditions(DischargeComorbidCondition dischargeComorbidConditions) {
		getDischargeComorbidConditions().remove(dischargeComorbidConditions);
		dischargeComorbidConditions.setCaseDetail(null);

		return dischargeComorbidConditions;
	}
	
	public List<DischargeMotherDetail> getDischargeMotherDetails() {
		return dischargeMotherDetails;
	}

	public void setDischargeMotherDetails(List<DischargeMotherDetail> dischargeMotherDetails) {
		this.dischargeMotherDetails = dischargeMotherDetails;
	}
   
	public DischargeMotherDetail addDischargeMotherDetails(DischargeMotherDetail dischargeMotherDetails) {
		getDischargeMotherDetails().add(dischargeMotherDetails);
		dischargeMotherDetails.setCaseDetail(this);

		return dischargeMotherDetails;
	}

	public DischargeMotherDetail removeDischargeMotherDetails(DischargeMotherDetail dischargeMotherDetails) {
		getDischargeMotherDetails().remove(dischargeMotherDetails);
		dischargeMotherDetails.setCaseDetail(null);

		return dischargeMotherDetails;
	}
	
	public List<Followup> getFollowups() {
		return this.followups;
	}
	
	public void setFollowups(List<Followup> followups) {
		this.followups = followups;
	}

	public Followup addFollowup(Followup followup) {
		getFollowups().add(followup);
		followup.setCaseDetail(this);

		return followup;
	}

	public Followup removeFollowup(Followup followup) {
		getFollowups().remove(followup);
		followup.setCaseDetail(null);

		return followup;
	}

	public List<FollowupSchedule> getFollowupSchedules() {
		return followupSchedules;
	}

	public void setFollowupSchedules(List<FollowupSchedule> followupSchedules) {
		this.followupSchedules = followupSchedules;
	}

	public FollowupSchedule addFollowupSchedules(FollowupSchedule followupSchedules) {
		getFollowupSchedules().add(followupSchedules);
		followupSchedules.setCaseDetail(this);

		return followupSchedules;
	}

	public FollowupSchedule removeFollowupSchedules(FollowupSchedule followupSchedules) {
		getFollowupSchedules().remove(followupSchedules);
		followupSchedules.setCaseDetail(null);

		return followupSchedules;
	}
	
	//commented as part of Sneha-angan
/*	public List<NrcSnehaMapping> getNrcSnehaMapping() {
		return nrcSnehaMappings;
	}

	public void setNrcSnehaMapping(List<NrcSnehaMapping> nrcSnehaMappings) {
		this.nrcSnehaMappings = nrcSnehaMappings;
	}

	public NrcSnehaMapping addNrcSnehaMapping(NrcSnehaMapping nrcSnehaMappings) {
		getNrcSnehaMapping().add(nrcSnehaMappings);
		nrcSnehaMappings.setCaseDetail(this);

		return nrcSnehaMappings;
	}

	public NrcSnehaMapping removeNrcSnehaMapping(NrcSnehaMapping nrcSnehaMappings) {
		getNrcSnehaMapping().remove(nrcSnehaMappings);
		nrcSnehaMappings.setCaseDetail(null);

		return nrcSnehaMappings;
	}
	
	public List<AwGrowthDetail> getAwGrowthDetails() {
		return awGrowthDetails;
	}

	public void setAwGrowthDetails(List<AwGrowthDetail> awGrowthDetails) {
		this.awGrowthDetails = awGrowthDetails;
	}

	public AwGrowthDetail addNrcSnehaMapping(AwGrowthDetail awGrowthDetails) {
		getAwGrowthDetails().add(awGrowthDetails);
		awGrowthDetails.setCaseDetail(this);

		return awGrowthDetails;
	}

	public AwGrowthDetail removeNrcSnehaMapping(AwGrowthDetail awGrowthDetails) {
		getAwGrowthDetails().remove(awGrowthDetails);
		awGrowthDetails.setCaseDetail(null);

		return awGrowthDetails;
	}*/

}