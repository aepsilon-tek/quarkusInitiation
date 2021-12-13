package org.aepsilon.culturetek.springboot.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class PointDeVente {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    

    private String nom;
    private Boolean venteEnLigne;

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Biere> bieres;



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
