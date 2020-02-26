package com.org.xworkz.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="signin")
public class SignInEntity implements Serializable{
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="s_id")
	private int id;
	@Column(name="s_name")
	
	private String name;
	@Column(name="s_email")
	private String email;
	@Column(name="s_mobile")
	private String mobile;
	@Column(name="s_password")
	private String password;
	@Column(name="s_confirmpassword")
	private String confirmpassword;
	
	public SignInEntity() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	public SignInEntity(String name, String email, String mobile, String password, String conformPassword) {
		super();
		name = name;
		email = email;
		mobile = mobile;
		password = password;
		conformPassword = conformPassword;
	}
	

}