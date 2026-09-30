package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.BloodGroup;
import com.example.demo.repositories.BloodGroupRepository;

@Service
public class BloodGroupService {

    @Autowired
    private BloodGroupRepository bloodGroupRepository;

    // POST
    public BloodGroup saveBloodGroup(BloodGroup bloodGroup) {
        return bloodGroupRepository.save(bloodGroup);
    }

    // GET
    public List<BloodGroup> getAllBloodGroups() {
        return bloodGroupRepository.findAll();
    }

    // DELETE
    public String deleteBloodGroup(int id) {
        if (bloodGroupRepository.existsById(id)) {
            bloodGroupRepository.deleteById(id);
            return "Blood group deleted successfully";
        }

        return "Blood group not found";
    }
}