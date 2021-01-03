package com.university.MedicalRecords.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.print.Doc;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "medical_examination")
public class MedicalExamination extends BaseEntity {

    @Column(name="date",nullable = false)
    private Date date;

    @Column(name="sick_leave_start_date")
    private Date sickLeaveStartDate;

    @Column(name="sick_leave_duration")
    private int sickLeaveDuration;

    @JoinColumn
    @ManyToOne
    private Doctor doctor;

    @JoinColumn
    @ManyToOne
    private Patient patient;

    @JoinColumn
    @ManyToOne
    private Diagnosis diagnosis;


    @ManyToMany(mappedBy = "medicalExaminations", fetch = FetchType.EAGER)
    private List<Pills> pills;

}
