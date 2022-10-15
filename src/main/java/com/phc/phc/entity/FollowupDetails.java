package com.phc.phc.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="followup_details")
public class FollowupDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="followup_id")
    private int followup_id;

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

    @OneToMany(mappedBy = "followupDetails")
    private List<FollowupsSchedule> followupsSchedule;

    public int getFollowup_id() {
        return followup_id;
    }

    public void setFollowup_id(int followup_id) {
        this.followup_id = followup_id;
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
}
