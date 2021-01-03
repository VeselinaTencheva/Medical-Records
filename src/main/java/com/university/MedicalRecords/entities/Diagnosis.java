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
@Table(name = "diagnosis")
public class Diagnosis extends BaseEntity {

    @Column(name="name",nullable = false)
    private String name;

    @Column(name="specialization",nullable = false)
    private Specialization specialization;

//    @ManyToMany(mappedBy = "diagnosisList", fetch = FetchType.EAGER)
//    private List<Pills> pills;
}
