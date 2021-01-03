package com.university.MedicalRecords.controllers;

import com.university.MedicalRecords.entities.Doctor;
import com.university.MedicalRecords.services.DoctorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class DoctorController {
    private final DoctorService doctorService;

    @GetMapping("/doctors")
    public List<Doctor> getDoctors() {
        return doctorService.findAll();
    }

    @PostMapping("/doctors")
    void addDoctor(@RequestBody Doctor doctor) {
        this.doctorService.create(doctor);
    }
}
