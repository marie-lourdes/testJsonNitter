package com.safetynet.api.service.dataservice;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safetynet.api.model.FireStation;



import jakarta.validation.Valid;

/*@Service
public class FireStationService {


	@Autowired
	private FireStationRepositoryImpl fireStationRepositoryFile;

//--------------------repository avec source de donnéees fichier Json---------		
	public List<FireStation> getFireStationsFromFile() throws IOException {
		return (List<FireStation>) fireStationRepositoryFile.findAll();
	}

/*	public Optional<FireStation> getOneFireStationById(Long id) {
		Optional<FireStation> fireStationFoundById = Optional
				.ofNullable(fireStationRepository.findById(id).orElseThrow(() -> new NullPointerException(
						" an error has occured,this firestation " + id + " doesn't exist, try again ")));
		return fireStationFoundById;
	}*/
/*public List<Optional<FireStation>> getOneFireStationById(String id) {
		return fireStationRepositoryFile.findById(id);
		
	}
	
	public List< Optional<FireStation>> getFireStationsByAddress( String address ) {
		return fireStationRepositoryFile.findByAddress(address);
	}*/
/*	
	public FireStation saveFireStation(@Valid FireStation fireStation) {
		return fireStationRepository.save(fireStation);
	}

	public FireStation updateOneFireStationById(FireStation fireStation, Long id) {
		return fireStationRepository.save(fireStation);
	}

	public void deleteByStationNumberFireStation( String stationNumber ) {
		fireStationRepository.deleteByStationNumberFireStation(  stationNumber);
		/*
		 * List<String> listOfFireStation = new ArrayList<String>();
		 * listOfFireStation.add(fireStation.getStationNumber().toString());
		 * listOfFireStation.add(fireStation.getAddress()); listOfFireStation.remove(0);
		 * return listOfFireStation; //fireStationRepository.deleteById(id);
		 */
/*	}
	
	public List<FireStation>  saveFireStation2(FireStation fireStation,	List<FireStation>  fireStations ) {
		// TODO Auto-generated method stub
		
		FireStation fireStationCreated =fireStationRepository.save(fireStation);
		 fireStations.add(fireStationCreated);
		return fireStations;
	}*/


	
//}
