package com.university.MedicalRecords.services;

import com.university.MedicalRecords.entities.Diagnosis;
import com.university.MedicalRecords.entities.Doctor;
import com.university.MedicalRecords.repositories.DiagnosisRepository;
import com.university.MedicalRecords.repositories.DoctorRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DoctorServiceImpl implements DoctorService{

    private final DoctorRepository doctorRepository;

    @Override
    public Doctor create(Doctor doctor) {
        return this.doctorRepository.save(doctor);
    }

    @Override
    public Doctor edit(long id,Doctor doctor) {
        doctor.setId(id);
        return this.doctorRepository.saveAndFlush(doctor);
    }

    @Override
    public void delete(Doctor doctor) {
        this.doctorRepository.delete(doctor);
    }

    @Override
    public Doctor findById(long id) {
        return this.doctorRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Doctor not found"));
    }

    @Override
    public List<Doctor> findAll() {
        return this.doctorRepository.findAll();
    }
}
