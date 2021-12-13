package org.aepsilon.culturetek.quarkus.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import org.aepsilon.culturetek.quarkus.model.Biere;
import org.aepsilon.culturetek.quarkus.model.PointDeVente;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class PointDeVenteRepository implements PanacheRepository<PointDeVente> {

    public  List<PointDeVente> findByBiere(Biere b){
        return list("bieres",b);
    }

    
}
