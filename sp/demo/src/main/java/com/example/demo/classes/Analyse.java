package com.example.demo.classes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity

@Table(name = " Analyses")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(
        value = {"date"},
        allowGetters = true
)

public class Analyse  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idanalyse;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_creation", nullable = false, updatable = false)
    @CreatedDate
    private Date date;

    private float Glycémie;
    private float Tension;
    private float Choléstérol;
    private float Transaminases;
    private String medecin_traitant;



    public int getIdanalyse() {
        return idanalyse;
    }

    public void setIdanalyse(int idanalyse) {
        this.idanalyse = idanalyse;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getGlycémie() {
        return Glycémie;
    }

    public void setGlycémie(float glycémie) {
        Glycémie = glycémie;
    }

    public float getTension() {
        return Tension;
    }

    public void setTension(float tension) {
        Tension = tension;
    }

    public float getCholéstérol() {
        return Choléstérol;
    }

    public void setCholéstérol(float choléstérol) {
        Choléstérol = choléstérol;
    }

    public float getTransaminases() {
        return Transaminases;
    }

    public void setTransaminases(float transaminases) {
        Transaminases = transaminases;
    }

    public String getMedecin_traitant() {
        return medecin_traitant;
    }

    public void setMedecin_traitant(String medecin_traitant) {
        this.medecin_traitant = medecin_traitant;
    }
}
