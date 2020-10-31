package org.aepsilon.culturetek.quarkus.resource;

import org.aepsilon.culturetek.quarkus.model.Biere;
import org.aepsilon.culturetek.quarkus.service.ReferentielService;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import java.util.List;

@GraphQLApi
public class BiereResource {

    private static final Logger LOG = Logger.getLogger(BiereResource.class);

    @Inject
    private ReferentielService service;

    @Query("allBiere")
    @Description("Renvoies toutes les bières du référentiel")
    public List<Biere> getAllBiere() {
        return service.getAllBiere();
    }


    @Query
    @Description("Renvoie une biere")
    public Biere getBiere(@Name("indexBiere") int id) {
        LOG.infov("getBiere({0})",id);
        return service.getBiere(id);
    }


}
