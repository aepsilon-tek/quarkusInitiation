package org.aepsilon.culturetek.springboot.controller;

import org.aepsilon.culturetek.springboot.model.Brasseur;
import org.aepsilon.culturetek.springboot.service.ReferentielService;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@GraphQLApi
public class BrasseurController {

    private static final Logger LOG = LoggerFactory.getLogger(BrasseurController.class);

    @Autowired
    private ReferentielService service;

    @Query("allBrasseur")
    @Description("Renvoies tous les brasseurs du référentiel")
    public List<Brasseur> getAllBrasseur() {
        return service.getAllBrasseur();
    }



    @Mutation ("ajoutBrasseur")
    public Brasseur createBrasseur(Brasseur b) {
        service.addBrasseur(b);
        return b;
    }

    @Mutation
    public Brasseur deleteBrasseur(int id) {
        return service.deleteBrasseur(id);
    }

}
