package com.hms.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="patientcriteria")
public class Patientcriteria {
	
	private String mobilenumber;
	private String firstname;
	@Id
	private Integer id;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	

}
