package com.phc.phc.entity;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="remarks")
public class Remarks {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="remark_id")
    private int remarkId;

    @Column(name="case_id")
    private int caseId;

    @Column(name="remark")
    private String remark;

    @Column(name="doctor_name")
    private String doctorName;

    @Column(name="doctor_number")
    private String doctorNumber;

    @Column(name="date")
    private Timestamp date;

    public int getRemarkId() {
        return remarkId;
    }

    public void setRemarkId(int remarkId) {
        this.remarkId = remarkId;
    }

    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorNumber() {
        return doctorNumber;
    }

    public void setDoctorNumber(String doctorNumber) {
        this.doctorNumber = doctorNumber;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
}
