package org.aepsilon.culturetek.quarkus.resource;

import org.aepsilon.culturetek.quarkus.model.Biere;
import org.aepsilon.culturetek.quarkus.model.PaysEnum;
import org.aepsilon.culturetek.quarkus.service.ReferentielService;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

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

    @Query("biereParPays")
    @Description("Renvoies toutes les bières d'un Pays du référentiel")
    public List<Biere> getBiere(@Name("pays")PaysEnum p) {
        return service.getBiereParPays(p);
    }



    @Query
    @Description("Renvoie une biere")
    public Optional<Biere> getBiere(@Name("idBiere") int id) {
        LOG.infov("getBiere({0})",id);
        return service.getBiere(id);
    }


}
