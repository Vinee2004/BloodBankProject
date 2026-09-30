package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.BloodGroup;
import com.example.demo.service.BloodGroupService;

@RestController
@RequestMapping("/bloodgroups")
public class BloodGroupController {

    @Autowired
    private BloodGroupService bloodGroupService;

   
    @PostMapping
    public BloodGroup saveBloodGroup(@RequestBody BloodGroup bloodGroup) {
        return bloodGroupService.saveBloodGroup(bloodGroup);
    }

   
    @GetMapping
    public List<BloodGroup> getAllBloodGroups() {
        return bloodGroupService.getAllBloodGroups();
    }

  
    @DeleteMapping("/{id}")
    public String deleteBloodGroup(@PathVariable int id) {
        return bloodGroupService.deleteBloodGroup(id);
    }
}