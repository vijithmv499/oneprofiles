// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.oneprofiles.domain;

import com.oneprofiles.domain.Document;
import com.oneprofiles.domain.GeneralProfile;

privileged aspect Document_Roo_JavaBean {
    
    public String Document.getUserName() {
        return this.userName;
    }
    
    public void Document.setUserName(String userName) {
        this.userName = userName;
    }
    
    public String Document.getDescription() {
        return this.description;
    }
    
    public void Document.setDescription(String description) {
        this.description = description;
    }
    
    public String Document.getFileName() {
        return this.fileName;
    }
    
    public void Document.setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    public String Document.getContentType() {
        return this.contentType;
    }
    
    public void Document.setContentType(String contentType) {
        this.contentType = contentType;
    }
    
    public byte[] Document.getContent() {
        return this.content;
    }
    
    public void Document.setContent(byte[] content) {
        this.content = content;
    }
    
    public GeneralProfile Document.getGeneralProfile() {
        return this.generalProfile;
    }
    
    public void Document.setGeneralProfile(GeneralProfile generalProfile) {
        this.generalProfile = generalProfile;
    }
    
}