package com.safetynet.api.repository;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.safetynet.api.model.MedicalRecord;

public interface IMedicalRecordRepository extends IReadOnlyDatasRepository<MedicalRecord, Long> {
	@Override
	List<MedicalRecord> findAll() throws IOException;
	
   Optional<MedicalRecord>findById(String id);
	 
	List<Optional<MedicalRecord>> findByFirstNameAndLastName(String firstName, String lastName);
}
