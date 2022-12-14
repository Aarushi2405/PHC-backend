package com.phc.phc.entity;


import javax.persistence.*;

@Entity
@Table(name="doctors")
public class Doctors {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="doctor_id")
    private int doctorId ;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="phc_id")
    private int phcId;

    @Column(name="status")
    private String status;

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public void setPhcId(int phcId) {
        this.phcId = phcId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhcId() {
        return phcId;
    }

    public void setAshaId(int ashaId) {
        this.phcId = ashaId;
    }
}
