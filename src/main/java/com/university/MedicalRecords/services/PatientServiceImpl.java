package com.university.MedicalRecords.services;

import com.university.MedicalRecords.entities.MedicalExamination;
import com.university.MedicalRecords.entities.Patient;
import com.university.MedicalRecords.repositories.MedicalExaminationRepository;
import com.university.MedicalRecords.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PatientServiceImpl implements PatientService{
    private final PatientRepository patientRepository;

    @Override
    public Patient create(Patient patient) {
        return this.patientRepository.save(patient);
    }

    @Override
    public Patient edit(Patient patient) {
        return this.patientRepository.saveAndFlush(patient);
    }

    @Override
    public void delete(Patient patient) {
        this.patientRepository.delete(patient);
    }

    @Override
    public Patient findById(String id) {
        return this.patientRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Patient not found"));
    }

    @Override
    public List<Patient> findAll() {
        return this.patientRepository.findAll();
    }
}
