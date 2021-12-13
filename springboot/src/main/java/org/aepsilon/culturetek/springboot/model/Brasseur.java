package org.aepsilon.culturetek.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Brasseur {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String nom;
    private PaysEnum pays;


    public Brasseur() {
    }

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

    public PaysEnum getPays() {
        return pays;
    }

    public void setPays(PaysEnum pays) {
        this.pays = pays;
    }


}
