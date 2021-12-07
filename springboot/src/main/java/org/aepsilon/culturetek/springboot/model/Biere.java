package org.aepsilon.culturetek.springboot.model;

import java.time.LocalDate;

public class Biere {
    private String nom;
    private String description;
    private Double degre;
    private Brasseur brasseur;
    private StyleBiereEnum style;

    private LocalDate dateMaj;


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getDegre() {
        return degre;
    }

    public void setDegre(Double degre) {
        this.degre = degre;
    }

    public Brasseur getBrasseur() {
        return brasseur;
    }

    public void setBrasseur(Brasseur brasseur) {
        this.brasseur = brasseur;
    }

    public StyleBiereEnum getStyle() {
        return style;
    }

    public void setStyle(StyleBiereEnum style) {
        this.style = style;
    }

    public LocalDate getDateMaj() {
        return dateMaj;
    }

    public void setDateMaj(LocalDate dateMaj) {
        this.dateMaj = dateMaj;
    }


    @Override
    public String toString() {
        return "Biere{" +
                "nom='" + nom + '\'' +
                ", degre=" + degre +
                ", style=" + style +
                '}';
    }
}
