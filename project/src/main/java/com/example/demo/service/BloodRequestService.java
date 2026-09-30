package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.BloodRequest;
import com.example.demo.repositories.BloodRequestRepository;

@Service
public class BloodRequestService {

    @Autowired
    private BloodRequestRepository bloodRequestRepository;

    // POST
    public BloodRequest saveBloodRequest(BloodRequest bloodRequest) {
        return bloodRequestRepository.save(bloodRequest);
    }

    // GET
    public List<BloodRequest> getAllBloodRequests() {
        return bloodRequestRepository.findAll();
    }

    // DELETE
    public String deleteBloodRequest(int id) {

        if (bloodRequestRepository.existsById(id)) {
            bloodRequestRepository.deleteById(id);
            return "Blood request deleted successfully";
        }

        return "Blood request not found";
    }
}