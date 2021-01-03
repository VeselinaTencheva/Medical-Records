package com.university.MedicalRecords.services;

import com.university.MedicalRecords.entities.Doctor;
import com.university.MedicalRecords.entities.MedicalExamination;

import java.util.List;

public interface MedicalExaminationService {
    MedicalExamination create(MedicalExamination medicalExamination);
    MedicalExamination edit(long id,MedicalExamination medicalExamination);
    void delete(MedicalExamination medicalExamination);
    MedicalExamination findById(long id);
    List<MedicalExamination> findAll();
}
