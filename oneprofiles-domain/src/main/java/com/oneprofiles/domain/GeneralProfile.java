package com.oneprofiles.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.IndexColumn;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;


@Entity
@Table(name = "GENERAL_PROFILE")
@RooJpaEntity(table = "GENERAL_PROFILE")
@RooJavaBean
public class GeneralProfile implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column( unique = true, nullable = false)
	private String userName;
	
	@Column(name = "FULL_NAME")
	private String fullName;
	
	@Column(name = "DATEOFBIRTH")
	private Date dateOfBirth;
	
	@Column(name = "GENDER")
    @Enumerated(value = EnumType.STRING)
	private Gender gender;
	
	@Column(name = "FATHERS_NAME")
	private String fathersName;
	
	@Column(name = "FATHERS_OCCUPATION")
	private String fathersOccupation;
	
	@Column(name = "CASTE")
	private String caste;
	
	@Column(name = "MOBILE_NUMBER")
	private Integer mobileNumber;

	@Column(name = "MOTHERS_NAME")
	private String mothersName;

	@Column(name = "ADDRESS")
	private String address;
	
	@ElementCollection
	@CollectionTable(name="TECHNOLOGIES", joinColumns=@JoinColumn(name = "USERNAME"))
	@Column(name = "TECHNOLOGY")
	private List<String> technologies;

    @OneToMany(cascade={CascadeType.ALL})
    @JoinColumn(name = "USERNAME")
    @IndexColumn(name = "idx")
    private List<Document> documents;

    public static enum Gender {
        MALE, FEMALE, OTHER;
    }

}