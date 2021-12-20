package org.aepsilon.culturetek.springboot.controller;


import java.util.Optional;

import org.aepsilon.culturetek.springboot.model.Biere;
import org.aepsilon.culturetek.springboot.model.PaysEnum;
import org.aepsilon.culturetek.springboot.service.ReferentielService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Component;

import antlr.collections.List;
import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;

@GraphQLApi
@Component //mark the beans as Spring's managed components
public class BiereController {

    private static final Logger LOG = LoggerFactory.getLogger(BiereController.class);

    @Autowired
    private ReferentielService service;

    @GraphQLQuery(name="allBiere")
    //@Description("Renvoies toutes les bières du référentiel")
    public Iterable<Biere> getAllBiere() {
        return service.getAllBiere();
    }


    @GraphQLQuery(name="biere")
    //@Description("Renvoie une biere")
    public Optional<Biere> getBiere(@GraphQLArgument(name="idBiere") int id) {
        LOG.info("getBiere({0})",id);
        return service.getBiere(id);
    }

    @GraphQLQuery(name="biereParPays")
    @Description("Renvoies toutes les bières d'un Pays du référentiel")
    public Iterable<Biere> getBiere(@GraphQLArgument(name="pays")PaysEnum p) {
        return service.getBiereParPays(p);
    }
}
