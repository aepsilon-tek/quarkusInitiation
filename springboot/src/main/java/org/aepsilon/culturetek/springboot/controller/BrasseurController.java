package org.aepsilon.culturetek.springboot.controller;

import org.aepsilon.culturetek.springboot.model.Brasseur;
import org.aepsilon.culturetek.springboot.service.ReferentielService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;

@GraphQLApi
@Component //mark the beans as Spring's managed components
public class BrasseurController {

    private static final Logger LOG = LoggerFactory.getLogger(BrasseurController.class);

    @Autowired
    private ReferentielService service;

    @GraphQLQuery (name="allBrasseur")
    //@Description("Renvoies tous les brasseurs du référentiel")
    public Iterable<Brasseur> getAllBrasseur() {
        return service.getAllBrasseur();
    }



    @GraphQLMutation(name="ajoutBrasseur")
    public Brasseur createBrasseur(Brasseur b) {
        service.addBrasseur(b);
        return b;
    }

    @GraphQLMutation
    public void deleteBrasseur(long pkBrasseur) {
         service.deleteBrasseur(pkBrasseur);
    }


}
