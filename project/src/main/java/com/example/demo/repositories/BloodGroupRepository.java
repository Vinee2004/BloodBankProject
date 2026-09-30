package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.BloodGroup;

public interface BloodGroupRepository extends JpaRepository<BloodGroup, Integer> {

}