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
@Table(name = "pills")
public class Pills extends BaseEntity{

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "description",nullable = false)
    private String description;


//    @ManyToMany(fetch = FetchType.EAGER)
//    private List<Diagnosis> diagnosisList;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<MedicalExamination> medicalExaminations;
}
