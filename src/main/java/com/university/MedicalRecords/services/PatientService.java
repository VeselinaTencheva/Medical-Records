package com.university.MedicalRecords.services;

import com.university.MedicalRecords.entities.MedicalExamination;
import com.university.MedicalRecords.entities.Patient;

import java.util.List;

public interface PatientService {
    Patient create(Patient patient);
    Patient edit(Patient patient);
    void delete(Patient patient);
    Patient findById(String id);
    List<Patient> findAll();
}
