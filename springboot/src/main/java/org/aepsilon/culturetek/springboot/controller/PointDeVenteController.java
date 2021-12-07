package org.aepsilon.culturetek.springboot.controller;

import org.aepsilon.culturetek.springboot.model.Biere;
import org.aepsilon.culturetek.springboot.model.PointDeVente;
import org.aepsilon.culturetek.springboot.service.ReferentielService;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;
import org.eclipse.microprofile.graphql.Source;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@GraphQLApi
public class PointDeVenteController {

    private static final Logger LOG = LoggerFactory.getLogger(PointDeVenteController.class);

    @Autowired
    private ReferentielService service;

    @Query("allPdv")
    @Description("Renvoies toutes les points de ventes du référentiel")
    public List<PointDeVente> getAllPdv() {
        return service.getAllPointDeVente();
    }


    @Query
    @Description("Renvoie les points de ventes d'une bière")
    public List<PointDeVente> searchPdv(@Source Biere b) {
        LOG.info("searchPdv({0})",b);
        return service.getPointDeVentes(b);
    }

    
}
