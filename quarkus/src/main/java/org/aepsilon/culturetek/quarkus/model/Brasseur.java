package org.aepsilon.culturetek.quarkus.model;

public class Brasseur {
    private String nom;
    private PaysEnum pays;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public PaysEnum getPays() {
        return pays;
    }

    public void setPays(PaysEnum pays) {
        this.pays = pays;
    }
}
