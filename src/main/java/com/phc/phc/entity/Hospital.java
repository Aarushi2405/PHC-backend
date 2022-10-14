package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the hospital database table.
 * 
 */
@Entity
@Table(name="nr.hospital")
@NamedQuery(name="Hospital.findAll", query="SELECT h FROM Hospital h")
public class Hospital implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="h_id")
	private int hId;

	private String address;

	@Column(name="created_on")
	private Timestamp createdOn;

	@Column(name="email_id")
	private String emailId;

	@Column(name="h_code")
	private String hCode;

	@Column(name="land_line_number")
	private String landLineNumber;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	@Column(name="mobile_number")
	private String mobileNumber;
    
	@Column(name="name")
	private String name;
	
	@Column(name="name_short")
	private String nameShort;
    
	@Column(name="pincode")
	private Integer pincode;
	
	@Column(name="district_id")
	private Integer districtId;

	//bi-directional many-to-one association to CaseDetail
	@OneToMany(mappedBy="hospital")
	private List<CaseDetail> caseDetails;

	//bi-directional many-to-one association to Doctor
	@OneToMany(mappedBy="hospital")
	private List<Doctor> doctors;

	//bi-directional many-to-one association to NrcUser
	@OneToMany(mappedBy="hospital")
	private List<NrcUser> nrcUsers;
	
	//bi-directional many-to-one association to HospitalDetail
	@OneToMany(mappedBy="hospital")
	private List<HospitalDetail> hospitalDetails;

	public Hospital() {
	}

	public int getHId() {
		return this.hId;
	}

	public void setHId(int hId) {
		this.hId = hId;
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

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getHCode() {
		return this.hCode;
	}

	public void setHCode(String hCode) {
		this.hCode = hCode;
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
    
	
	public String getNameShort() {
		return nameShort;
	}

	public void setNameShort(String nameShort) {
		this.nameShort = nameShort;
	}

	public Integer getPincode() {
		return this.pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	
	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public List<CaseDetail> getCaseDetails() {
		return this.caseDetails;
	}

	public void setCaseDetails(List<CaseDetail> caseDetails) {
		this.caseDetails = caseDetails;
	}

	public CaseDetail addCaseDetail(CaseDetail caseDetail) {
		getCaseDetails().add(caseDetail);
		caseDetail.setHospital(this);

		return caseDetail;
	}

	public CaseDetail removeCaseDetail(CaseDetail caseDetail) {
		getCaseDetails().remove(caseDetail);
		caseDetail.setHospital(null);

		return caseDetail;
	}

	public List<Doctor> getDoctors() {
		return this.doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	public Doctor addDoctor(Doctor doctor) {
		getDoctors().add(doctor);
		doctor.setHospital(this);

		return doctor;
	}

	public Doctor removeDoctor(Doctor doctor) {
		getDoctors().remove(doctor);
		doctor.setHospital(null);

		return doctor;
	}

	public List<NrcUser> getNrcUsers() {
		return this.nrcUsers;
	}

	public void setNrcUsers(List<NrcUser> nrcUsers) {
		this.nrcUsers = nrcUsers;
	}

	public NrcUser addNrcUser(NrcUser nrcUser) {
		getNrcUsers().add(nrcUser);
		nrcUser.setHospital(this);

		return nrcUser;
	}

	public NrcUser removeNrcUser(NrcUser nrcUser) {
		getNrcUsers().remove(nrcUser);
		nrcUser.setHospital(null);

		return nrcUser;
	}
	
	public List<HospitalDetail> getHospitalDetails() {
		return this.hospitalDetails;
	}

	public void setHospitalDetails(List<HospitalDetail> hospitalDetails) {
		this.hospitalDetails = hospitalDetails;
	}

	public HospitalDetail addHospitalDetail(HospitalDetail hospitalDetail) {
		getHospitalDetails().add(hospitalDetail);
		hospitalDetail.setHospital(this);

		return hospitalDetail;
	}

	public HospitalDetail removeHospitalDetail(HospitalDetail hospitalDetail) {
		getHospitalDetails().remove(hospitalDetail);
		hospitalDetail.setHospital(null);

		return hospitalDetail;
	}


}