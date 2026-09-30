package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.BloodStock;
import com.example.demo.repositories.BloodStockRepository;

@Service
public class BloodStockService {

    @Autowired
    private BloodStockRepository bloodStockRepository;

    // POST
    public BloodStock saveBloodStock(BloodStock bloodStock) {
        return bloodStockRepository.save(bloodStock);
    }

    // GET
    public List<BloodStock> getAllBloodStock() {
        return bloodStockRepository.findAll();
    }

    // DELETE
    public String deleteBloodStock(int id) {

        if (bloodStockRepository.existsById(id)) {
            bloodStockRepository.deleteById(id);
            return "Blood stock deleted successfully";
        }

        return "Blood stock not found";
    }
}