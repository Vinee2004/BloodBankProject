package com.example.demo.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String gender;
    private LocalDate dob;
    private String bloodGroup;
    private double weight;
    private String phone;
    private String address;
    private String state;
    private String pincode;
    private LocalDate lastBloodDonationDate;
    private String medicalConditions;
    private String emergencyContactNumber;
    private String occupation;
    private String nationality;
    private String role;
}

