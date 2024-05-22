package com.hms.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="patientdetailstable")
public class Patients {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer id;
		 private String title;
	     private String newPatientName;
	     private String lastName;
	     private String country;
	    
	     
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getNewPatientName() {
			return newPatientName;
		}
		public void setNewPatientName(String newPatientName) {
			this.newPatientName = newPatientName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		
		
	     
	     
	     
	     
}
