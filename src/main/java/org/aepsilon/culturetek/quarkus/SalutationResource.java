package org.aepsilon.culturetek.quarkus;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/bonjour")
public class SalutationResource {

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

}