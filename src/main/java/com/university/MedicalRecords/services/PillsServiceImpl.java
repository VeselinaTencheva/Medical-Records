package com.university.MedicalRecords.services;

import com.university.MedicalRecords.entities.Patient;
import com.university.MedicalRecords.entities.Pills;
import com.university.MedicalRecords.repositories.PatientRepository;
import com.university.MedicalRecords.repositories.PillsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PillsServiceImpl implements PillsService {

    private final PillsRepository pillsRepository;

    @Override
    public Pills create(Pills pills) {
        return this.pillsRepository.save(pills);
    }

    @Override
    public Pills edit(long id,Pills pills) {
        pills.setId(id);
        return this.pillsRepository.saveAndFlush(pills);
    }

    @Override
    public void delete(Pills pills) {
        this.pillsRepository.delete(pills);
    }

    @Override
    public Pills findById(long id) {
        return this.pillsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Pill not found"));
    }

    @Override
    public List<Pills> findAll() {
        return this.pillsRepository.findAll();
    }
}
