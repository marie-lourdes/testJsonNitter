package com.safetynet.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import com.safetynet.api.service.dataservice.MedicalRecordService;

@Component
public class UploadDataFileRunner implements CommandLineRunner {
	/* private List<FireStation>fireStations ;
	private  List<MedicalRecord>medicalRecords;
	private  List<Person>persons;*/
	 
 /*@Autowired
 PersonService  personService;*/
 
/* @Autowired
 FireStationService  fireStationService;*/
 
 @Autowired
 MedicalRecordService  medicalRecordService;

	@Override
	public void run(String... args) throws Exception {
		medicalRecordService.getAllMedicalRecords();
		//use to logging each element of file json 
		//personService.getPersonsFromFile();
	
	 
	   // fireStationService.deleteByStationNumberFireStation("3");
	  //  System.out.println("firestation APRES SUPPRESION "+	fireStationService.getFireStationsFromFile());
	   //fireStationService.getFireStationsFromFile();
	 
	  /*  fireStationService.getOneFireStationById("3");
		fireStationService.getFireStationsByAddress("489 Manchester St");
		personService.getOnePersonById("Tenley Boyd");
		medicalRecordService.getOneMedicalRecordById("Tenley Boyd");*/
	}
/* public List<FireStation> getFireStation () {
	 return fireStations;
 }
 public List<FireStation> setFireStation ( List<FireStation> firestations) {
	 return this.fireStations= firestations ;
 }
 
 public List<Person> getPerson () {
	 return persons;
 }
 public List<Person> setPerson ( List<Person> persons) {
	 return this.persons= persons ;
 }
 
 public List<MedicalRecord> getMedicalRecord() {
	 return medicalRecords;
 }
 public  List<MedicalRecord> setMedicalRecord ( List<MedicalRecord> medicalRecords) {
	 return this.medicalRecords= medicalRecords ;
 }*/
 
}