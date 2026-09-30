package com.example.demo.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "blood_requests")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class BloodRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int requestId;

    private String patientName;
    private String bloodGroup;
    private int unitsRequired;
    private String hospitalName;
    private LocalDate requestDate;
    private String status;
}