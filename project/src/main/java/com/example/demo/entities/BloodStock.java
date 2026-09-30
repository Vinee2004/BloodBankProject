package com.example.demo.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name = "blood_stock")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class BloodStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stockId;
    private int bloodGroupId;
    private int unitsAvailable;
}