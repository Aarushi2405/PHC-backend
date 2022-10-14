package com.phc.phc.entity;

import javax.persistence.*;

@Entity
@Table(name="asha_worker")
public class AshaWorker {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="asha_id")
    private int ashaId;

    @Column(name="name")
    private String name;

    @Column(name="address")
    private String address;

    @Column(name="phone_number")
    private String phoneNumber;

    public int getAshaId() {
        return ashaId;
    }

    public void setAshaId(int ashaId) {
        this.ashaId = ashaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}