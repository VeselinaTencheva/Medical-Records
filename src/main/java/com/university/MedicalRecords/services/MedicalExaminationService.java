package com.university.MedicalRecords.services;

import com.university.MedicalRecords.entities.Doctor;
import com.university.MedicalRecords.entities.MedicalExamination;

import java.util.List;

public interface MedicalExaminationService {
    MedicalExamination create(MedicalExamination medicalExamination);
    MedicalExamination edit(MedicalExamination medicalExamination);
    void delete(MedicalExamination medicalExamination);
    MedicalExamination findById(String id);
    List<MedicalExamination> findAll();
}
