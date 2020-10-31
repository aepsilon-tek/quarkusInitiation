package org.aepsilon.culturetek.quarkus.resource;

import org.aepsilon.culturetek.quarkus.service.SalutationService;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.jboss.logging.Logger;


@Path("/bonjour")
public class SalutationResource {

    private static final Logger LOG = Logger.getLogger(SalutationResource.class);

    @Inject
    SalutationService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Quarkus, Bonjour le monde Maj";
    }


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/salutation/{name}")
    public String salutation(@PathParam String name) {
        return service.salutation(name);
    }


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/failure")
    public String testException() throws Exception{
        try {
            LOG.debugf("Test de log avec les substitutions 'printf-style' , log en mode %s ", "DEBUG");
            LOG.infov("Test de log avec les substitutions 'MessageFormat-style' , log en mode {0} ", "INFO");
            throw new Exception("");
        }catch(Exception e){
            LOG.error("Error catchée",e);
            throw e;
        }
    }

}