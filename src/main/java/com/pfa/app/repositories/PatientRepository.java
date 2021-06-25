package com.pfa.app.repositories;

import com.pfa.app.Entities.PatientEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends MongoRepository<PatientEntity, String> {
}