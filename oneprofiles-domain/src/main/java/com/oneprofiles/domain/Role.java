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
import javax.persistence.Table;



@RooJpaEntity(table = "ROLES")
@RooJavaBean
public class Role {
	@Column(name = "ROLE", unique = true, nullable = false)
	private String role;

}
