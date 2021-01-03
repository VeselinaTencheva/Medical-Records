package com.university.MedicalRecords.services;

import com.university.MedicalRecords.entities.Diagnosis;
import com.university.MedicalRecords.entities.Doctor;

import java.util.List;

public interface DoctorService {
    Doctor create(Doctor doctor);
    Doctor edit(Doctor doctor);
    void delete(Doctor doctor);
    Doctor findById(String id);
    List<Doctor> findAll();
}
