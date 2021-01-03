package com.university.MedicalRecords.services;

import com.university.MedicalRecords.entities.Patient;
import com.university.MedicalRecords.entities.Pills;

import java.util.List;

public interface PillsService {
    Pills create(Pills pills);
    Pills edit(long id,Pills pills);
    void delete(Pills pills);
    Pills findById(long id);
    List<Pills> findAll();
}
