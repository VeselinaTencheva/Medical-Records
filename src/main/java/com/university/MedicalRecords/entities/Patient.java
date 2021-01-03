package com.university.MedicalRecords.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "patient")
public class Patient extends User{

    @Column(name="egn",nullable = false,unique = true,length = 10)
    private String egn;

    @Column(name="has_health_insurance")
    private boolean hasHealthInsurance;

    @JoinColumn
    @ManyToOne
    private Doctor doctor;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<MedicalExamination> medicalExaminations;
}
