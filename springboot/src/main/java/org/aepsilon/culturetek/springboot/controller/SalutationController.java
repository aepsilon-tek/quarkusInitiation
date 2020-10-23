package org.aepsilon.culturetek.springboot.controller;


import org.aepsilon.culturetek.springboot.service.SalutationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController()
public class SalutationController {

    @Autowired
    private SalutationService service;

    @RequestMapping( value="/bonjour",method= RequestMethod.GET)
    public String hello() {
        return "SpringBoot, Bonjour le monde";
    }

    @RequestMapping(value = "/salutation/{name}",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
    public String salutation(@PathVariable("name") String nom) {
        return service.salutation(nom);
    }
}
