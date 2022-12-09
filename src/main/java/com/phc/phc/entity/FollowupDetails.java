package com.phc.phc.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="followup_details")
public class FollowupDetails {

    @Id
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "followup_sequence"
//    )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @SequenceGenerator(
//            name = "followup_sequence",
//            sequenceName = "followup_sequence",
//            allocationSize = 1
//    )
    @Column(name="followup_id")
    private int followupId;

    @Column(name="followup_date")
    private Date followupDate;

    @Column(name="height")
    private float height;

    @Column(name="weight")
    private float weight;

    @Column(name="muac")
    private float muac;

    @Column(name="head_circumference")
    private float headCircumference;

    @Column(name="sd_range")
    private float sdRange;

    @Column(name="diet_chart")
    private String dietChart;

    @Column(name="diet_adequacy")
    private String dietAdequacy;

    @Column(name="co_morbidities")
    private String coMorbidities;

    @Column(name="other_symptoms")
    private String otherSymptoms;

    @Column(name="reason_followup")
    private String reasonFollowup;

    @Column(name="reason_not_coming")
    private String reasonNotComing;

    @Column(name="chief_complaints")
    private String chiefComplaints;

    @Column(name="provisional_diagnosis")
    private String provisionalDiagnosis;

    @Column(name="treatment")
    private String treatment;

    @Column(name="place")
    private String place;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "followupDetails", cascade=CascadeType.ALL)
    private List<FollowupsSchedule> followupsSchedule;

    public int getFollowupId() {
        return followupId;
    }

    public void setFollowupId(int followupId) {
        this.followupId = followupId;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getMuac() {
        return muac;
    }

    public void setMuac(float muac) {
        this.muac = muac;
    }

    public float getHeadCircumference() {
        return headCircumference;
    }

    public void setHeadCircumference(float headCircumference) {
        this.headCircumference = headCircumference;
    }

    public float getSdRange() {
        return sdRange;
    }

    public void setSdRange(float sdRange) {
        this.sdRange = sdRange;
    }

    public String getDietChart() {
        return dietChart;
    }

    public void setDietChart(String dietChart) {
        this.dietChart = dietChart;
    }

    public String getDietAdequacy() {
        return dietAdequacy;
    }

    public void setDietAdequacy(String dietAdequacy) {
        this.dietAdequacy = dietAdequacy;
    }

    public String getCoMorbidities() {
        return coMorbidities;
    }

    public void setCoMorbidities(String coMorbidities) {
        this.coMorbidities = coMorbidities;
    }

    public String getOtherSymptoms() {
        return otherSymptoms;
    }

    public void setOtherSymptoms(String otherSymptoms) {
        this.otherSymptoms = otherSymptoms;
    }

    public String getReasonFollowup() {
        return reasonFollowup;
    }

    public void setReasonFollowup(String reasonFollowup) {
        this.reasonFollowup = reasonFollowup;
    }

    public String getReasonNotComing() {
        return reasonNotComing;
    }

    public void setReasonNotComing(String reasonNotComing) {
        this.reasonNotComing = reasonNotComing;
    }

    public List<FollowupsSchedule> getFollowupsSchedule() {
        return followupsSchedule;
    }

    public void setFollowupsSchedule(List<FollowupsSchedule> followupsSchedule) {
        this.followupsSchedule = followupsSchedule;
    }

    public String getChiefComplaints() {
        return chiefComplaints;
    }

    public void setChiefComplaints(String chiefComplaints) {
        this.chiefComplaints = chiefComplaints;
    }

    public String getProvisionalDiagnosis() {
        return provisionalDiagnosis;
    }

    public void setProvisionalDiagnosis(String provisionalDiagnosis) {
        this.provisionalDiagnosis = provisionalDiagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

//    public FollowupDetails() {
//
//    }
//
//    public FollowupDetails(Date followupDate, float height, float weight, float muac, float headCircumference, float sdRange, String dietChart, String dietAdequacy, String coMorbidities, String otherSymptoms, String reasonFollowup, String reasonNotComing, String chiefComplaints, String provisionalDiagnosis, String treatment) {
//        this.followupDate = followupDate;
//        this.height = height;
//        this.weight = weight;
//        this.muac = muac;
//        this.headCircumference = headCircumference;
//        this.sdRange = sdRange;
//        this.dietChart = dietChart;
//        this.dietAdequacy = dietAdequacy;
//        this.coMorbidities = coMorbidities;
//        this.otherSymptoms = otherSymptoms;
//        this.reasonFollowup = reasonFollowup;
//        this.reasonNotComing = reasonNotComing;
//        this.chiefComplaints = chiefComplaints;
//        this.provisionalDiagnosis = provisionalDiagnosis;
//        this.treatment = treatment;
//        this.followupsSchedule = followupsSchedule;
//    }

    public Date getFollowupDate() {
        return followupDate;
    }

    public void setFollowupDate(Date followupDate) {
        this.followupDate = followupDate;
    }
}
