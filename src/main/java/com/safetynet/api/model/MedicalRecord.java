package com.safetynet.api.model;

import java.util.List;


import jakarta.validation.constraints.Pattern;

//@Entity
//@Table(name = "medicalrecords")
public class MedicalRecord {
	// this regex date require 0 in format date
	private final String REGEX_P = "^[0-3][0-9]/[0-3][0-9]/(?:[0-9][0-9])?[0-9][0-9]$";

	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	//@Column(name = "first_name")
	private String firstName;

	//@Column(name = "last_name")
	private String lastName;

	@Pattern(regexp = REGEX_P)
	//@Column(name = "birthdate")
	private String birthdate;

	//@Column(name = "medications")
	private List<String> medications;

	//@Column(name = "allergies")
	private List<String> allergies;

	public String getId() {
		return id;
	}
	
	public String setId (String id) {
		return this.id=id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public List<String> getMedications() {
		return medications;
	}

	public void setMedications(List<String> medications) {
		this.medications = medications;
	}

	public List<String> getAllergies() {
		return allergies;
	}

	public void setAllergies(List<String> allergies) {
		this.allergies = allergies;
	}

	@Override
	public String toString() {
		return "MedicalRecord{" + "id=" + id+ ", first name='" + firstName + '\'' + ", last name=" + lastName + ", birthdate="
				+ birthdate + ", medication=" + medications + ", allergies=" + allergies +  "}";
	}
}