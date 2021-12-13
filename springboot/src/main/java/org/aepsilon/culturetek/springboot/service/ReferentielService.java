package org.aepsilon.culturetek.springboot.service;

import java.time.LocalDate;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.aepsilon.culturetek.springboot.model.Biere;
import org.aepsilon.culturetek.springboot.model.Brasseur;
import org.aepsilon.culturetek.springboot.model.PaysEnum;
import org.aepsilon.culturetek.springboot.model.PointDeVente;
import org.aepsilon.culturetek.springboot.model.StyleBiereEnum;
import org.aepsilon.culturetek.springboot.repository.BiereRepository;
import org.aepsilon.culturetek.springboot.repository.BrasseurRepository;
import org.aepsilon.culturetek.springboot.repository.PointDeVenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ReferentielService {
    @Autowired
    private BrasseurRepository brasseurRepo=null;

    @Autowired
    private BiereRepository biereRepo=null;


    @Autowired
    private PointDeVenteRepository pdvRepo=null;

    public ReferentielService(){
    }

    public void initData(){
        LocalDate now=  LocalDate.now();


        /*brasseurs*/
        Brasseur brasseur1 = new Brasseur();
        brasseur1.setNom("Brew Dog");
        brasseur1.setPays(PaysEnum.ECOSSE);
        brasseurRepo.save(brasseur1);

        Brasseur brasseur2 = new Brasseur();
        brasseur2.setNom("Molson Coors");
        brasseur2.setPays(PaysEnum.CANADA);
        brasseurRepo.save(brasseur2);

        Brasseur brasseur3 = new Brasseur();
        brasseur3.setNom("Brasserie d'Orval");
        brasseur3.setPays(PaysEnum.BELGIQUE);
        brasseurRepo.save(brasseur3);

        Brasseur brasseur4 = new Brasseur();
        brasseur4.setNom("Brouwerij Bosteels");
        brasseur4.setPays(PaysEnum.BELGIQUE);
        brasseurRepo.save(brasseur4);

        /*Bieres*/
        Biere biere1 = new Biere();
        biere1.setNom("Brew Dog Punk IPA");
        biere1.setDegre(5.6);
        biere1.setStyle(StyleBiereEnum.IPA);
        biere1.setDateMaj(now);
        biere1.setBrasseur(brasseur1);
        biereRepo.save(biere1);

        Biere biere2 = new Biere();
        biere2.setNom("Molson Canadian Lager");
        biere2.setStyle(StyleBiereEnum.LAGER_BLONDE);
        biere2.setDegre(5.0);
        biere2.setDateMaj(now);
        biere2.setBrasseur(brasseur2);
        biereRepo.save(biere2);

        Biere biere3 = new Biere();
        biere3.setNom("Orval");
        biere3.setStyle(StyleBiereEnum.TRAPPISTE);
        biere3.setDegre(6.2);
        biere3.setDateMaj(now);
        biere3.setBrasseur(brasseur3);
        biereRepo.save(biere3);

        Biere biere4 = new Biere();
        biere4.setNom("Pauwel Kwak");
        biere4.setStyle(StyleBiereEnum.STRONG_ALE_BELGE);
        biere4.setDegre(8.0);
        biere4.setDateMaj(now);
        biere4.setBrasseur(brasseur4);
        biereRepo.save(biere4);


        Biere biere5 = new Biere();
        biere5.setNom("Tripel Karmeliet");
        biere5.setStyle(StyleBiereEnum.BLONDE_BELGE);
        biere5.setDegre(8.4);
        biere5.setDateMaj(now);
        biere5.setBrasseur(brasseur4);
        biereRepo.save(biere5);

        //Point de vente
        PointDeVente pdv1 = new PointDeVente();
        pdv1.setNom("Temple de la bière");
        pdv1.setVenteEnLigne(Boolean.TRUE);
        pdv1.addBiere(biere1);
        pdv1.addBiere(biere2);
        pdv1.addBiere(biere3);
        pdvRepo.save(pdv1);


        PointDeVente pdv2 = new PointDeVente();
        pdv2.setNom("La Taverne");
        pdv2.setVenteEnLigne(Boolean.FALSE);
        pdv2.addBiere(biere3);
        pdv2.addBiere(biere4);
        pdv2.addBiere(biere5);
        pdvRepo.save(pdv2);
    }

    @Transactional(value = TxType.REQUIRES_NEW)
    public Iterable<Biere> getAllBiere(){
        return biereRepo.findAll();
    }

    public Iterable<PointDeVente> getAllPointDeVente(){
        return pdvRepo.findAll();
    }

    public Iterable<Brasseur> getAllBrasseur(){
        return brasseurRepo.findAll();
    }

    public Optional<Biere> getBiere(long pkBiere){
        return biereRepo.findById(pkBiere);
    }

    public Iterable<Biere> getBiereParPays(PaysEnum pays) {
        return biereRepo.findByPays(pays);
    }
    

    public  Iterable<PointDeVente> getPointDeVentes(Biere b){
        return pdvRepo.findByBiere(b);
    }

    public void addBrasseur(Brasseur brasseur){
        brasseurRepo.save(brasseur);
    }

    public void deleteBrasseur(long pkBrasseur){
         brasseurRepo.deleteById(pkBrasseur);
    }
}
