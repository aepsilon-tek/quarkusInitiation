package org.aepsilon.culturetek.quarkus.resource;

import org.aepsilon.culturetek.quarkus.model.Biere;
import org.aepsilon.culturetek.quarkus.model.Brasseur;
import org.aepsilon.culturetek.quarkus.service.ReferentielService;
import org.eclipse.microprofile.graphql.*;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import java.util.List;

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
    public Brasseur deleteBrasseur(int id) {
        return service.deleteBrasseur(id);
    }

}
