package com.university.MedicalRecords.services;

import com.university.MedicalRecords.entities.Doctor;
import com.university.MedicalRecords.entities.MedicalExamination;
import com.university.MedicalRecords.repositories.DoctorRepository;
import com.university.MedicalRecords.repositories.MedicalExaminationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MedicalExaminationServiceImpl implements MedicalExaminationService{
    private final MedicalExaminationRepository medicalExaminationRepository;

    @Override
    public MedicalExamination create(MedicalExamination medicalExamination) {
        return this.medicalExaminationRepository.save(medicalExamination);
    }

    @Override
    public MedicalExamination edit(MedicalExamination medicalExamination) {
        return this.medicalExaminationRepository.saveAndFlush(medicalExamination);
    }

    @Override
    public void delete(MedicalExamination medicalExamination) {
        this.medicalExaminationRepository.delete(medicalExamination);
    }

    @Override
    public MedicalExamination findById(String id) {
        return this.medicalExaminationRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Medical Examination not found"));
    }

    @Override
    public List<MedicalExamination> findAll() {
        return this.medicalExaminationRepository.findAll();
    }
}
