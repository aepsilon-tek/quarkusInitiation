package org.aepsilon.culturetek.quarkus.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SalutationService {

    public String salutation(String name) {
        return "Quarkus, Bonjour " + name;
    }
}
