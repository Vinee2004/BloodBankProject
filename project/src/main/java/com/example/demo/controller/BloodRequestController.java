package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.BloodRequest;
import com.example.demo.service.BloodRequestService;

@RestController
@RequestMapping("/bloodrequests")
public class BloodRequestController {

    @Autowired
    private BloodRequestService bloodRequestService;

    // POST
    @PostMapping
    public BloodRequest saveBloodRequest(@RequestBody BloodRequest bloodRequest) {
        return bloodRequestService.saveBloodRequest(bloodRequest);
    }

    // GET
    @GetMapping
    public List<BloodRequest> getAllBloodRequests() {
        return bloodRequestService.getAllBloodRequests();
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteBloodRequest(@PathVariable int id) {
        return bloodRequestService.deleteBloodRequest(id);
    }
}