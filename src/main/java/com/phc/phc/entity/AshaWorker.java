package com.phc.phc.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="asha_worker")
public class AshaWorker {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="asha_id")
    private int ashaId;

    @Column(name="name")
    private String name;

    @Column(name="ward")
    private String ward;

    @Column(name="area")
    private String area;

    @Column(name="pincode")
    private String pincode;

    @Column(name="phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "ashaWorker")
    @Cascade(CascadeType.SAVE_UPDATE)
    private List<AshaChildMapping> ashaChildMappings;

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}