package com.example.demo.Controlls;

import com.example.demo.classes.Consultation;
import com.example.demo.classes.Medecin;
import com.example.demo.classes.ResourceNotFoundException;
import com.example.demo.repos.ConsulRepo;
import com.example.demo.repos.MedecinRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ConsultationController {
    @Autowired
    private MedecinRepo medecinRepo;
    @Autowired
    private ConsulRepo consulRepo ;

    @GetMapping("/med/showallconsu")
    public List<Consultation> showallconsu(){
        return consulRepo.findAll();
    }
    @PostMapping("/med/{medid}/addconsu")
    public Consultation createconsu(@PathVariable(value = "medid") int medid, @RequestBody Consultation consultation) {
        return medecinRepo.findById(medid).map(medecin -> {
            consultation.setMedecin(medecin);
            return consulRepo.save(consultation);        }).orElseThrow(() -> new ResourceNotFoundException("medecin id " + medid + " not found"));

}


}
