package com.cgrpg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class User {

    private Long id;

    private Timestamp created;
    private Timestamp modified;
    private String username;
    private String email;
    private String password;
    private Integer enabled;
    private Integer passwordfailures;
    private String confirmationToken;
    private String resetToken;
    private String resetTokenInternal;
    private Timestamp resetTokenExpiration;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getModified() {
        return modified;
    }

    public void setModified(Timestamp modified) {
        this.modified = modified;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Integer getPasswordfailures() {
        return passwordfailures;
    }

    public void setPasswordfailures(Integer passwordfailures) {
        this.passwordfailures = passwordfailures;
    }

    public String getConfirmationToken() {
        return confirmationToken;
    }

    public void setConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
    }

    public String getResetToken() {
        return resetToken;
    }

    public void setResetToken(String resetToken) {
        this.resetToken = resetToken;
    }

    public String getResetTokenInternal() {
        return resetTokenInternal;
    }

    public void setResetTokenInternal(String resetTokenInternal) {
        this.resetTokenInternal = resetTokenInternal;
    }

    public Timestamp getResetTokenExpiration() {
        return resetTokenExpiration;
    }

    public void setResetTokenExpiration(Timestamp resetTokenExpiration) {
        this.resetTokenExpiration = resetTokenExpiration;
    }
}