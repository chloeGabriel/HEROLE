package com.cgrpg.model;

import javax.persistence.*;
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

    @Column(name = "created", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Column(name = "modified", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getModified() {
        return modified;
    }

    public void setModified(Timestamp modified) {
        this.modified = modified;
    }

    @Column(name = "username", nullable = false, insertable = true, updatable = true, length = 20, precision = 0)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "email", nullable = false, insertable = true, updatable = true, length = 250, precision = 0)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "password", nullable = false, insertable = true, updatable = true, length = 100, precision = 0)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "enabled", nullable = false, insertable = true, updatable = true, length = 3, precision = 0)
    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    @Column(name = "passwordfailures", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPasswordfailures() {
        return passwordfailures;
    }

    public void setPasswordfailures(Integer passwordfailures) {
        this.passwordfailures = passwordfailures;
    }

    @Column(name = "confirmationtoken", nullable = false, insertable = true, updatable = true, length = 250, precision = 0)
    public String getConfirmationToken() {
        return confirmationToken;
    }

    public void setConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
    }

    @Column(name = "resettoken", nullable = false, insertable = true, updatable = true, length = 250, precision = 0)
    public String getResetToken() {
        return resetToken;
    }

    public void setResetToken(String resetToken) {
        this.resetToken = resetToken;
    }

    @Column(name = "resettokeninternal", nullable = false, insertable = true, updatable = true, length = 250, precision = 0)
    public String getResetTokenInternal() {
        return resetTokenInternal;
    }

    public void setResetTokenInternal(String resetTokenInternal) {
        this.resetTokenInternal = resetTokenInternal;
    }

    @Column(name = "resettokenexpiration", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getResetTokenExpiration() {
        return resetTokenExpiration;
    }

    public void setResetTokenExpiration(Timestamp resetTokenExpiration) {
        this.resetTokenExpiration = resetTokenExpiration;
    }
}