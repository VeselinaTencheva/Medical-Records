package com.university.MedicalRecords.repositories;

import com.university.MedicalRecords.entities.Pills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PillsRepository extends JpaRepository<Pills, Long> {
}
