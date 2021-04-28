package com.cgrpg.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(	name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    public User(){

    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.created = new Timestamp(System.currentTimeMillis()); // TODO classic entities should inherit from a superconstructor for default recurring fields
        this.modified = new Timestamp(System.currentTimeMillis());
        this.enabled = 1; // TODO while user email confirmation is not implemented
        this.passwordfailures = 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "created")
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Column(name = "modified")
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

    @Column(name = "enabled")
    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    @Column(name = "passwordfailures")
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

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}