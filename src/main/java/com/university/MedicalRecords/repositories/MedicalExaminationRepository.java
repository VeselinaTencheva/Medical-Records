package com.university.MedicalRecords.repositories;

import com.university.MedicalRecords.entities.MedicalExamination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalExaminationRepository extends JpaRepository<MedicalExamination, Long> {
}
