package com.safetynet.api.config;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.safetynet.api.model.MedicalRecord;
import com.safetynet.api.service.ReadMedicalRecordDataFromFileImpl;
import com.safetynet.api.service.dataservice.MedicalRecordService;



@Component

public class JsonDataLoader implements CommandLineRunner {



   // private final PersonService personService;

  //  private final FireStationService fireStationService;

    private final MedicalRecordService medicalRecordService;
    @Autowired
    private final ReadMedicalRecordDataFromFileImpl readMedicalRecordsFromfile;
    @Autowired
    public JsonDataLoader(

          //  PersonService personService,

          //  FireStationService fireStationService,

           MedicalRecordService medicalRecordService,
    		ReadMedicalRecordDataFromFileImpl readMedicalRecordsFromfile

    ) {

       // this.personService = personService;

       // this.fireStationService = fireStationService;
    	this.medicalRecordService = medicalRecordService;
        this.readMedicalRecordsFromfile = readMedicalRecordsFromfile;

    }



    @Override
    public void run(String... args) throws IOException {
    	
    
     //   String jsonUrl =" https://s3-eu-west-1.amazonaws.com/course.oc-static.com/projects/DA+Java+EN/P5+/data.json";

     //   URL url = new URL(jsonUrl);



       try{

    	   List<MedicalRecord> medicalRecords=	readMedicalRecordsFromfile.readFile();
    	   for(MedicalRecord medicalRecord:medicalRecords) {
    		   medicalRecordService.addMedicalRecord(medicalRecord);
    	   }

         //   String jsonContent = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);



       //     Any data = JsonIterator.deserialize(jsonContent);



           // List<Any> personsData = data.get("persons").asList();

         //   List<Any> fireStationsData = data.get("firestations").asList();

            



      /*      for (Any personData : personsData) {

                Person person = personData.as(Person.class);

                String medicalRecordKey = person.getFirstName() + person.getLastName();

                MedicalRecord medicalRecord = personToMedicalRecordMap.get(medicalRecordKey);

                if (medicalRecord != null) {

                    person.setMedicalRecord(medicalRecord);

                }

                personService.addPerson(person);

            }*/



         /*   for (Any fireStationData : fireStationsData) {

                FireStation fireStation = fireStationData.as(FireStation.class);

                fireStationService.addFireStation(fireStation);

            }*/



        } catch (IOException e) {

            e.printStackTrace();

        }

   }

}
