package com.university.MedicalRecords.services;

import com.university.MedicalRecords.entities.Patient;
import com.university.MedicalRecords.entities.Pills;

import java.util.List;

public interface PillsService {
    Pills create(Pills pills);
    Pills edit(Pills pills);
    void delete(Pills pills);
    Pills findById(String id);
    List<Pills> findAll();
}
