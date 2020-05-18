package com.example.demo.Controlls;


import com.example.demo.classes.Medecin;
import com.example.demo.repos.MedecinRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
public class MedecinController {

    @Autowired
    private MedecinRepo medecinRepo;



    @PostMapping("/medecins")
    public Medecin createMedecin( @RequestBody Medecin medecin) {
        return medecinRepo.save(medecin);
    }






}