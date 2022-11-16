package com.phc.phc.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="asha")
public class Asha {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="asha_id")
    private int ashaId;

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

    public int getAshaId() {
        return ashaId;
    }

    public void setAshaId(int ashaId) {
        this.ashaId = ashaId;
    }
}
