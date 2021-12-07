package org.aepsilon.culturetek.springboot.controller;


import org.aepsilon.culturetek.springboot.model.Biere;
import org.aepsilon.culturetek.springboot.service.ReferentielService;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@GraphQLApi
public class BiereController {

    private static final Logger LOG = LoggerFactory.getLogger(BiereController.class);

    @Autowired
    private ReferentielService service;

    @Query("allBiere")
    @Description("Renvoies toutes les bières du référentiel")
    public List<Biere> getAllBiere() {
        return service.getAllBiere();
    }


    @Query
    @Description("Renvoie une biere")
    public Biere getBiere(@Name("indexBiere") int id) {
        LOG.info("getBiere({0})",id);
        return service.getBiere(id);
    }


}
