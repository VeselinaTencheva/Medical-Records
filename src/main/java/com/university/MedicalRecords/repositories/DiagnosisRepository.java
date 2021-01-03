package com.university.MedicalRecords.repositories;

import com.university.MedicalRecords.entities.Diagnosis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiagnosisRepository extends JpaRepository<Diagnosis, String> {
}
