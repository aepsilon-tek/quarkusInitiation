package org.aepsilon.culturetek.springboot.service;

import javax.enterprise.context.ApplicationScoped;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@ApplicationScoped
public class ReferentielService {

    private List<Brasseur> brasseurs  =new ArrayList<>();
    private List<Biere> bieres = new ArrayList<>();
    private List<PointDeVente> pdvs = new ArrayList<>();

    public ReferentielService(){
        LocalDate now=  LocalDate.now();


        /*brasseurs*/
        Brasseur brasseur1 = new Brasseur();
        brasseur1.setNom("Brew Dog");
        brasseur1.setPays(PaysEnum.ECOSSE);
        brasseurs.add(brasseur1);

        Brasseur brasseur2 = new Brasseur();
        brasseur2.setNom("Molson Coors");
        brasseur2.setPays(PaysEnum.CANADA);
        brasseurs.add(brasseur2);

        Brasseur brasseur3 = new Brasseur();
        brasseur3.setNom("Brasserie d'Orval");
        brasseur3.setPays(PaysEnum.BELGIQUE);
        brasseurs.add(brasseur3);

        Brasseur brasseur4 = new Brasseur();
        brasseur4.setNom("Brouwerij Bosteels");
        brasseur4.setPays(PaysEnum.BELGIQUE);
        brasseurs.add(brasseur4);

        /*Bieres*/
        Biere biere1 = new Biere();
        biere1.setNom("Brew Dog Punk IPA");
        biere1.setDegre(5.6);
        biere1.setStyle(StyleBiereEnum.IPA);
        biere1.setDateMaj(now);
        biere1.setBrasseur(brasseur1);
        bieres.add(biere1);

        Biere biere2 = new Biere();
        biere2.setNom("Molson Canadian Lager");
        biere2.setStyle(StyleBiereEnum.LAGER_BLONDE);
        biere2.setDegre(5.0);
        biere2.setDateMaj(now);
        biere2.setBrasseur(brasseur2);
        bieres.add(biere2);

        Biere biere3 = new Biere();
        biere3.setNom("Orval");
        biere3.setStyle(StyleBiereEnum.TRAPPISTE);
        biere3.setDegre(6.2);
        biere3.setDateMaj(now);
        biere3.setBrasseur(brasseur3);
        bieres.add(biere3);

        Biere biere4 = new Biere();
        biere4.setNom("Pauwel Kwak");
        biere4.setStyle(StyleBiereEnum.STRONG_ALE_BELGE);
        biere4.setDegre(8.0);
        biere4.setDateMaj(now);
        biere4.setBrasseur(brasseur4);
        bieres.add(biere4);


        Biere biere5 = new Biere();
        biere5.setNom("Tripel Karmeliet");
        biere5.setStyle(StyleBiereEnum.BLONDE_BELGE);
        biere5.setDegre(8.4);
        biere5.setDateMaj(now);
        biere5.setBrasseur(brasseur4);
        bieres.add(biere5);

        //Point de vente
        PointDeVente pdv1 = new PointDeVente();
        pdv1.setNom("Temple de la bière");
        pdv1.setVenteEnLigne(Boolean.TRUE);
        pdv1.addBiere(biere1);
        pdv1.addBiere(biere2);
        pdv1.addBiere(biere3);
        pdvs.add(pdv1);


        PointDeVente pdv2 = new PointDeVente();
        pdv2.setNom("La Taverne");
        pdv2.setVenteEnLigne(Boolean.FALSE);
        pdv2.addBiere(biere3);
        pdv2.addBiere(biere4);
        pdv2.addBiere(biere5);
        pdvs.add(pdv2);

    }

    public List<Biere> getAllBiere(){
        return bieres;
    }

    public List<PointDeVente> getAllPointDeVente(){
        return pdvs;
    }

    public List<Brasseur> getAllBrasseur(){
        return brasseurs;
    }

    public Biere getBiere(int index){
        return bieres.get(index);
    }

    public List<Biere> getBiereParPays(PaysEnum pays) {
        return bieres.stream()
                .filter(b -> b.getBrasseur().getPays().equals(pays))
                .collect(Collectors.toList());
    }

    public  List<PointDeVente> getPointDeVentes(Biere b){
        return pdvs.stream()
                .filter(pdv ->pdv.getBieres().contains(b))
                .collect(Collectors.toList());
    }

    public void addBrasseur(Brasseur brasseur){
        brasseurs.add(brasseur);
    }

    public Brasseur deleteBrasseur(int index){
       return  brasseurs.remove(index);
    }
}
