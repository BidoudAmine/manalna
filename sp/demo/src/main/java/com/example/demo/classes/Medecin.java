package com.example.demo.classes;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = " Medecins")

public class Medecin extends Utilisateur {
    @Id
    private int id;


    public int getIdmedecin() {
        return id;
    }

    public void setIdmedecin(int idmedecin) {
        this.id = idmedecin;
    }

    public List<Consultation> getConsultationList() {
        return consultationList;
    }

    public void setConsultationList(List<Consultation> consultationList) {
        this.consultationList = consultationList;
    }

    private String spécialité;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "medecin")
    private List<Consultation> consultationList ;



    public String getSpécialité() {
        return spécialité;
    }

    public void setSpécialité(String spécialité) {
        this.spécialité = spécialité;
    }
}
