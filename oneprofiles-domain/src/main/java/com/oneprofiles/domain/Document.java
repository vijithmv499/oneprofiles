/**
 * 
 */
package com.oneprofiles.domain;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@RooJpaEntity(table = "DOCUMENTS")
@RooJavaBean
public class Document {

	@Column(name = "USERNAME")
	private String userName;
	@Column(name = "DESCRIPTION")
	private String description;
	@Column(name = "FILENAME")
	private String fileName;
	@Column(name = "CONTENT_TYPE")
	private String contentType;
	@Column(name = "CONTENT")
	@Lob
	private byte[] content;
	@ManyToOne
    @JoinColumn(name = "USERNAME",
    			insertable = false, updatable = false, 
    			nullable = false)
    private GeneralProfile generalProfile;
	
	// constructors
	public Document() {

	}
	
	public Document(String description, String fileName) {
		this.description = description;
		this.fileName = fileName;
	}
}
