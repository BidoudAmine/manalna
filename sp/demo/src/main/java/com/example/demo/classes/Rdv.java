package com.example.demo.classes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = " Rdvs")

@JsonIgnoreProperties(
        value = {"date"},
        allowGetters = true
)

public class Rdv {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idrdv;
    private long date;
    private String Etat;



    public int getIdrdv() {
        return idrdv;
    }

    public void setIdrdv(int idrdv) {
        this.idrdv = idrdv;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getEtat() {
        return Etat;
    }

    public void setEtat(String etat) {
        Etat = etat;
    }
}
