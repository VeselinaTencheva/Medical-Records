package com.university.MedicalRecords.services;

import com.university.MedicalRecords.entities.MedicalExamination;
import com.university.MedicalRecords.entities.Patient;

import java.util.List;

public interface PatientService {
    Patient create(Patient patient);
    Patient edit(long id,Patient patient);
    void delete(Patient patient);
    Patient findById(long id);
    List<Patient> findAll();
}
