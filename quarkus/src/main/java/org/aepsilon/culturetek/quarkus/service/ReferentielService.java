package org.aepsilon.culturetek.quarkus.service;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.aepsilon.culturetek.quarkus.model.Biere;
import org.aepsilon.culturetek.quarkus.model.Brasseur;
import org.aepsilon.culturetek.quarkus.model.PaysEnum;
import org.aepsilon.culturetek.quarkus.model.PointDeVente;
import org.aepsilon.culturetek.quarkus.repository.BiereRepository;
import org.aepsilon.culturetek.quarkus.repository.BrasseurRepository;
import org.aepsilon.culturetek.quarkus.repository.PointDeVenteRepository;



@ApplicationScoped
public class ReferentielService {
    @Inject
    private BrasseurRepository brasseurRepo=null;

    @Inject
    private BiereRepository biereRepo=null;


    @Inject
    private PointDeVenteRepository pdvRepo=null;

    public ReferentielService(){
    }



    
    public List<Biere> getAllBiere(){
        return biereRepo.listAll();
    }


    public List<Biere> getAllBiereWithBrasseur(){
        return biereRepo.listWithBrasseur();
    }

    public List<PointDeVente> getAllPointDeVente(){
        return pdvRepo.listAll();
    }

    public List<Brasseur> getAllBrasseur(){
        return brasseurRepo.listAll();
    }

    public Optional<Biere> getBiere(long pkBiere){
        return biereRepo.findByIdOptional(pkBiere);
    }

    public List<Biere> getBiereParPays(PaysEnum pays) {
        return biereRepo.findByPays(pays);
    }
    

    public  List<PointDeVente> getPointDeVentes(Biere b){
        return pdvRepo.findByBiere(b);
    }

    @Transactional(value = TxType.REQUIRES_NEW)
    public void addBrasseur(Brasseur brasseur){
        brasseurRepo.persist(brasseur);
    }

    public boolean deleteBrasseur(long pkBrasseur){
         return brasseurRepo.deleteById(pkBrasseur);
    }
}