package org.aepsilon.culturetek.springboot.controller;

import org.aepsilon.culturetek.springboot.model.Biere;
import org.aepsilon.culturetek.springboot.model.PointDeVente;
import org.aepsilon.culturetek.springboot.service.ReferentielService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.leangen.graphql.annotations.GraphQLContext;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;

@GraphQLApi
@Component //mark the beans as Spring's managed components
public class PointDeVenteController {

    private static final Logger LOG = LoggerFactory.getLogger(PointDeVenteController.class);

    @Autowired
    private ReferentielService service;


    @GraphQLQuery(name="allPdv")
    //@Description("Renvoies toutes les points de ventes du référentiel")
    public Iterable<PointDeVente> getAllPdv() {
        return service.getAllPointDeVente();
    }


    @GraphQLQuery
    //@Description("Renvoie les points de ventes d'une bière")
    public Iterable<PointDeVente> searchPdv(@GraphQLContext Biere b) {
        LOG.info("searchPdv({0})",b);
        return service.getPointDeVentes(b);
    }

    
}
