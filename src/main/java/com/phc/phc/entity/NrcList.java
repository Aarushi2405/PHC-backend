package com.phc.phc.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="nrc_list")
public class NrcList {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="SLNO")
    private float nrcId;

    @Column(name="OrgCode")
    private String OrgCode;

    @Column(name="ShortName")
    private String ShortName;

    @Column(name="LongName")
    private String LongName;

    @Column(name="UserId")
    private String UserId;

    @OneToMany(mappedBy = "nrcList")
    @Cascade(CascadeType.SAVE_UPDATE)
    private List<NrcChildMapping> nrcChildMappings;


    public float getNrcId() {
        return nrcId;
    }

    public void setNrcId(float nrcId) {
        this.nrcId = nrcId;
    }

    public String getOrgCode() {
        return OrgCode;
    }

    public void setOrgCode(String orgCode) {
        OrgCode = orgCode;
    }

    public String getShortName() {
        return ShortName;
    }

    public void setShortName(String shortName) {
        ShortName = shortName;
    }

    public String getLongName() {
        return LongName;
    }

    public void setLongName(String longName) {
        LongName = longName;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }
}
