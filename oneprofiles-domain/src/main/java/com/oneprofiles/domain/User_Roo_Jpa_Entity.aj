// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.oneprofiles.domain;

import com.oneprofiles.domain.User;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect User_Roo_Jpa_Entity {
    
    declare @type: User: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long User.id;
    
    @Version
    @Column(name = "version")
    private Integer User.version;
    
    public Long User.getId() {
        return this.id;
    }
    
    public void User.setId(Long id) {
        this.id = id;
    }
    
    public Integer User.getVersion() {
        return this.version;
    }
    
    public void User.setVersion(Integer version) {
        this.version = version;
    }
    
}