package org.aepsilon.culturetek.quarkus.model;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.aepsilon.culturetek.quarkus.model.converter.PaysEnumConverter;

@Entity
public class Brasseur {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "generator_brasseur")
    @SequenceGenerator(name = "generator_brasseur", sequenceName = "BRASSEUR_SEQ", allocationSize = 1)
    private Long id;

    private String nom;
    
    //@Enumerated(EnumType.STRING)
    @Convert(converter = PaysEnumConverter.class)
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
