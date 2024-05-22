package com.hms.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;


//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
@Entity(name="mysearchcriteria")

public class SearchCriteria {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name = "patientcontactnumber")
	private String patientContactNumber;
	
	
	
	public String getPatientContactNumber() {
		return patientContactNumber;
	}
	public void setPatientContactNumber(String patientContactNumber) {
		this.patientContactNumber = patientContactNumber;
	}
	
	
	

}
