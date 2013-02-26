package com.oneprofiles.domain;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@RooJpaEntity
@RooJavaBean
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "USERNAME", unique = true, nullable = false)
	private String userName;
	
	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "EMAIL")
	private String email;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roles;
}