package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.BloodRequest;

public interface BloodRequestRepository extends JpaRepository<BloodRequest, Integer> {

}