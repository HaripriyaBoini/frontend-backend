package com.hms.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="patientdetails")
public class Patientdetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private String patientcontactnumber;

	public String getPatientcontactnumber() {
		return patientcontactnumber;
	}

	public void setPatientcontactnumber(String patientcontactnumber) {
		this.patientcontactnumber = patientcontactnumber;
	}
	
}
