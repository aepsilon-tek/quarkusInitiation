package org.aepsilon.culturetek.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class SalutationService {

    public String salutation(String name) {
        return "SpringBoot, Bonjour " + name;
    }
}
