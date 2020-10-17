package org.aepsilon.culturetek.quarkus;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SalutationService {

    public String salutation(String name) {
        return "Bonjour " + name;
    }
}
