package com.example.demo.repos;

import com.example.demo.classes.Admin;
import com.example.demo.classes.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo  extends JpaRepository<Patient, Integer> {
}
