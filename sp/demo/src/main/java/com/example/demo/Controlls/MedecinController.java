package com.example.demo.Controlls;


import com.example.demo.classes.Consultation;
import com.example.demo.classes.Medecin;
import com.example.demo.classes.ResourceNotFoundException;
import com.example.demo.repos.ConsulRepo;
import com.example.demo.repos.MedecinRepo;
import com.example.demo.repos.PatientRepo;
import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class MedecinController {
    @Autowired
    private MedecinRepo medecinRepo;
    @Autowired
    private ConsulRepo consulRepo;
    @Autowired
    private PatientRepo patientRepo;

    @GetMapping("/med/showallconsu")
    public List<Consultation> showallconsu() {
        return consulRepo.findAll();
    }

    @PostMapping("/med/{medid}/addconsu/{patientid}")
    public Consultation createconsu(@PathVariable(value = "medid") int medid, @PathVariable(value="patientid") int patientid,@RequestBody Consultation consultation) {
        return medecinRepo.findById(medid).map(medecin -> {
            consultation.setMedecin(medecin);
            consultation.setPatient(patientRepo.findById(patientid).get());
            return consulRepo.save(consultation);
        }).orElseThrow(() -> new ResourceNotFoundException("medecin id " + medid + " not found"));

    }


}