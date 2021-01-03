package com.university.MedicalRecords.services;

import com.university.MedicalRecords.entities.Diagnosis;

import java.util.List;

public interface DiagnosisService  {
    Diagnosis createDiagnosis(Diagnosis diagnosis);
    Diagnosis editDiagnosis(long id,Diagnosis diagnosis);
    void deleteDiagnosis(Diagnosis diagnosis);
    Diagnosis findById(long id);
    List<Diagnosis> findAll();
}
