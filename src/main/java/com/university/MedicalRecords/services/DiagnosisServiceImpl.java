package com.university.MedicalRecords.services;

import com.university.MedicalRecords.entities.Diagnosis;
import com.university.MedicalRecords.repositories.DiagnosisRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DiagnosisServiceImpl implements DiagnosisService{

    private final DiagnosisRepository diagnosisRepository;

    @Override
    public Diagnosis createDiagnosis(Diagnosis diagnosis) {
        return this.diagnosisRepository.save(diagnosis);
    }

    @Override
    public Diagnosis editDiagnosis(long id,Diagnosis diagnosis) {
        diagnosis.setId(id);
        return this.diagnosisRepository.saveAndFlush(diagnosis);
    }

    @Override
    public void deleteDiagnosis(Diagnosis diagnosis) {
        this.diagnosisRepository.delete(diagnosis);
    }

    @Override
    public Diagnosis findById(long id) {
        return this.diagnosisRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Diagnosis not found"));
    }

    @Override
    public List<Diagnosis> findAll() {
        return this.diagnosisRepository.findAll();
    }
}
