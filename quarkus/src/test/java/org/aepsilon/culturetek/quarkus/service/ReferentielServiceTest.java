package org.aepsilon.culturetek.quarkus.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import javax.inject.Inject;

import org.aepsilon.culturetek.quarkus.model.Biere;
import org.aepsilon.culturetek.quarkus.model.Brasseur;
import org.aepsilon.culturetek.quarkus.model.PaysEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class ReferentielServiceTest {
    
    @Inject
    ReferentielService service;

    @Test
    void testAddBrasseur() {
        int nbBefore = service.getAllBrasseur().size();
        Brasseur newB = new Brasseur();
        newB.setNom("Brasseur Test");
        service.addBrasseur(newB);
        int nbAfter = service.getAllBrasseur().size();
        assertEquals(nbBefore+1, nbAfter);
    }

    @Test
    void testDeleteBrasseur() {
        
    }

    @Test
    void testGetAllBiere() {
        Assertions.assertFalse(service.getAllBiere().isEmpty());
    }

    @Test
    void testGetAllBiereWithBrasseur() {
        Assertions.assertFalse(service.getAllBiereWithBrasseur().isEmpty());
    }

    @Test
    void testGetAllBrasseur() {
        Assertions.assertFalse(service.getAllBrasseur().isEmpty());
        
    }

    @Test
    void testGetAllPointDeVente() {
        Assertions.assertFalse(service.getAllPointDeVente().isEmpty());
    }

    @Test
    void testGetBiere() {
        
    }

    @Test
    void testGetBiereParPays() {
        List<Biere> bieres= service.getAllBiereWithBrasseur();
        for(PaysEnum p: PaysEnum.values()){
            System.out.println("Test de "+p);
            long nb = bieres.stream().filter(b->p.equals(b.getBrasseur().getPays())).count();
            assertEquals(nb, service.getBiereParPays(p).size()); 
        }

    }

    @Test
    void testGetPointDeVentes() {
        
    }



}
