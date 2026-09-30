package com.example.demo.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.BloodStock;

public interface BloodStockRepository extends JpaRepository<BloodStock, Integer> {

}