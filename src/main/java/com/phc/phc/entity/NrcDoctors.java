package com.phc.phc.entity;


import javax.persistence.*;

@Entity
@Table(name="nrc_doctors")
public class NrcDoctors {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="nrc_id")
    private int nrcId;

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

    public int getNrcId() {
        return nrcId;
    }

    public void setNrcId(int Id) {
        this.nrcId = Id;
    }
}
