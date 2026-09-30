package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.BloodStock;
import com.example.demo.service.BloodStockService;

@RestController
@RequestMapping("/bloodstock")
public class BloodStockController {

    @Autowired
    private BloodStockService bloodStockService;

    // POST
    @PostMapping
    public BloodStock saveBloodStock(@RequestBody BloodStock bloodStock) {
        return bloodStockService.saveBloodStock(bloodStock);
    }

    // GET
    @GetMapping
    public List<BloodStock> getAllBloodStock() {
        return bloodStockService.getAllBloodStock();
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteBloodStock(@PathVariable int id) {
        return bloodStockService.deleteBloodStock(id);
    }
}