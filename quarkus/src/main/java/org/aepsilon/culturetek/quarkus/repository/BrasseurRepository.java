package org.aepsilon.culturetek.quarkus.repository;

import javax.enterprise.context.ApplicationScoped;

import org.aepsilon.culturetek.quarkus.model.Brasseur;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class BrasseurRepository implements PanacheRepository<Brasseur> {

    
}
