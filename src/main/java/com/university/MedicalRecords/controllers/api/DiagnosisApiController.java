package com.university.MedicalRecords.controllers.api;


import com.university.MedicalRecords.entities.Diagnosis;
import com.university.MedicalRecords.entities.Pills;
import com.university.MedicalRecords.services.DiagnosisService;
import com.university.MedicalRecords.services.PillsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/diagnosis")
public class DiagnosisApiController {
    private final DiagnosisService diagnosisService;

    @GetMapping()
    public List<Diagnosis> getDiagnoses(){
        return this.diagnosisService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Diagnosis getDiagnosis(@PathVariable("id") long id){
        return this.diagnosisService.findById(id);
    }

    @PostMapping()
    public Diagnosis createDiagnosis(@RequestBody Diagnosis diagnosis){
        return this.diagnosisService.createDiagnosis(diagnosis);
    }

    @PutMapping(value = "/{id}")
    public Diagnosis updateDiagnosis(@PathVariable("id") long id,@RequestBody Diagnosis diagnosis){
        return this.diagnosisService.editDiagnosis(id,diagnosis);
    }

    @DeleteMapping()
    public void deleteDiagnosis(@RequestBody Diagnosis diagnosis){
        this.diagnosisService.deleteDiagnosis(diagnosis);
    }
}
