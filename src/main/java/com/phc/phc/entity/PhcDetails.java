package com.phc.phc.entity;

import javax.persistence.*;

@Entity
@Table(name="phc_details")
public class PhcDetails {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="phc_id")
    private int phcId;

    @Column(name="name")
    private String name;

    @Column(name="pincode")
    private String pincode;

    @Column(name="address")
    private String address;

    @Column(name="contact_number")
    private String contactNumber;

    public int getPhcId() {
        return phcId;
    }

    public void setPhcId(int phcId) {
        this.phcId = phcId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
