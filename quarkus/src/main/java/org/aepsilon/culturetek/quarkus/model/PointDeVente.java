package org.aepsilon.culturetek.quarkus.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PointDeVente {
    private String nom;
    private Boolean venteEnLigne;
    private Set<Biere> bieres;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Boolean getVenteEnLigne() {
        return venteEnLigne;
    }

    public void setVenteEnLigne(Boolean venteEnLigne) {
        this.venteEnLigne = venteEnLigne;
    }

    public Set<Biere> getBieres() {
        return bieres;
    }

    public void setBieres(Set<Biere> bieres) {
        this.bieres = bieres;
    }


    public boolean addBiere(Biere b){
        if(b == null){
            return false;
        }
        if(getBieres() ==null){
            setBieres(new HashSet<>());
        }
        return getBieres().add(b);
    }
}
