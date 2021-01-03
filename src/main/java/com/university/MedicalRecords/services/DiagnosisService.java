package com.university.MedicalRecords.services;

import com.university.MedicalRecords.entities.Diagnosis;

import java.util.List;

public interface DiagnosisService  {
    Diagnosis createDiagnosis(Diagnosis diagnosis);
    Diagnosis editDiagnosis(Diagnosis diagnosis);
    void deleteDiagnosis(Diagnosis diagnosis);
    Diagnosis findById(String id);
    List<Diagnosis> findAll();
}
