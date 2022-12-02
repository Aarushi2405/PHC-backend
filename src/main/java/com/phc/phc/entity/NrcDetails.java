package com.phc.phc.entity;

import javax.persistence.*;

@Entity
@Table(name="nrc_details")
public class NrcDetails {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="nrc_id")
    private int nrcId;

    @Column(name="name")
    private String name;

    @Column(name="pincode")
    private String pincode;

    @Column(name="address")
    private String address;

    @Column(name="contact_number")
    private String contactNumber;

    public int getNrcId() {
        return nrcId;
    }

    public void setNrcId(int nrcId) {
        this.nrcId = nrcId;
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
