package org.aepsilon.culturetek.quarkus.resource;

import java.util.List;

import javax.inject.Inject;

import org.aepsilon.culturetek.quarkus.model.Brasseur;
import org.aepsilon.culturetek.quarkus.service.ReferentielService;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;
import org.jboss.logging.Logger;

@GraphQLApi
public class BrasseurResource {

    private static final Logger LOG = Logger.getLogger(BrasseurResource.class);

    @Inject
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
    public boolean deleteBrasseur(int id) {
         return service.deleteBrasseur(id);
    }

}
