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
@Table(name = "diagnosis")
public class Diagnosis extends BaseEntity {

    @Column(name="name",nullable = false)
    private String name;

    @Column(name="description",nullable = false)
    private String description;

//    @Column(name="specialization",nullable = false)
//    private Specialization specialization;

    @OneToMany(mappedBy = "diagnosis", cascade = CascadeType.ALL)
    @JsonIgnoreProperties
    private List<MedicalExamination> medicalExaminations;

//    @ManyToMany(mappedBy = "diagnosisList", fetch = FetchType.EAGER)
//    private List<Pills> pills;
}
