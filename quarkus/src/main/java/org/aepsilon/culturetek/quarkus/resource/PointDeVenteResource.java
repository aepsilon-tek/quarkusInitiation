package org.aepsilon.culturetek.quarkus.resource;

import org.aepsilon.culturetek.quarkus.model.Biere;
import org.aepsilon.culturetek.quarkus.model.PointDeVente;
import org.aepsilon.culturetek.quarkus.service.ReferentielService;
import org.eclipse.microprofile.graphql.*;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import java.util.List;

@GraphQLApi
public class PointDeVenteResource {

    private static final Logger LOG = Logger.getLogger(PointDeVenteResource.class);

    @Inject
    private ReferentielService service;

    @Query("allPdv")
    @Description("Renvoies toutes les points de ventes du référentiel")
    public List<PointDeVente> getAllPdv() {
        return service.getAllPointDeVente();
    }


    @Query
    @Description("Renvoie les points de ventes d'une bière")
    public List<PointDeVente> searchPdv(@Source Biere b) {
        LOG.infov("searchPdv({0})",b);
        return service.getPointDeVentes(b);
    }

    
}
