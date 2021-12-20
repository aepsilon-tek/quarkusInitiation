package org.aepsilon.culturetek.springboot.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Biere {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "generator_biere")
    @SequenceGenerator(name = "generator_biere", sequenceName = "BIERE_SEQ", allocationSize = 1)
    private Long id;

    
    private String nom;
    private String description;
    private Double degre;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Brasseur brasseur;

    @Enumerated(EnumType.STRING)
    private StyleBiereEnum style;

    private LocalDate dateMaj;


    public Long getId(){
        return id;
    }    

    public void setId(Long id){
        this.id =id;
    }

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
