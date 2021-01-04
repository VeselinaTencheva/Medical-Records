package com.university.MedicalRecords.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "doctor")
public class Doctor extends User{

    @Enumerated
    private Specialization specialization;

    @Column(name = "is_gp",nullable = false)
    private boolean isGp;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    @JsonIgnoreProperties
    private List<Patient> patients;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    @JsonIgnoreProperties
    private List<MedicalExamination> medicalExaminations;


}
