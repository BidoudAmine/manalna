package com.example.demo.classes;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = " Admins")

public class Admin extends Utilisateur {
    @Id
    private int idadmin;

    private String Fonction;

    public int getIdadmin() {
        return idadmin;
    }

    public void setIdadmin(int idadmin) {
        this.idadmin = idadmin;
    }

    public String getFonction() {
        return Fonction;
    }

    public void setFonction(String fonction) {
        this.Fonction = fonction;
    }
}

