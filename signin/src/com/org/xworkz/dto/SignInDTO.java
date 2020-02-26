package com.org.xworkz.dto;

import java.io.Serializable;

public class SignInDTO implements Serializable{
	private String name;
	private String email;
	private String mobile;
	private String password;
	private String confirmpassword;
	
	public SignInDTO() {
		System.out.println("created\t"+this.getClass().getSimpleName());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	@Override
	public String toString() {
		return "SignInDTO [name=" + name + ", email=" + email + ", mobile=" + mobile + ", password=" + password
				+ ", confirmpassword=" + confirmpassword + "]";
	}
	

}
