package org.aepsilon.culturetek.quarkus.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import org.aepsilon.culturetek.quarkus.model.Biere;
import org.aepsilon.culturetek.quarkus.model.PaysEnum;
import org.aepsilon.culturetek.quarkus.model.StyleBiereEnum;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class BiereRepository implements PanacheRepository<Biere> {



    public List<Biere> listWithBrasseur(){
        StringBuffer sb = new StringBuffer();
        sb.append("from ").append(Biere.class.getCanonicalName()).append(" b ")
        .append(" left join fetch b.brasseur");
        return list(sb.toString());
    }

    public List<Biere> findAlive(StyleBiereEnum style){
        return list("style", style);
    }


    public List<Biere> findByPays(PaysEnum pays) {
        return list("brasseur.pays",pays);
    }
}
