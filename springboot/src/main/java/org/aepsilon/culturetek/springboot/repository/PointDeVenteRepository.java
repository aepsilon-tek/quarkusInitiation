package org.aepsilon.culturetek.springboot.repository;

import org.aepsilon.culturetek.springboot.model.Biere;
import org.aepsilon.culturetek.springboot.model.PointDeVente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PointDeVenteRepository extends CrudRepository<PointDeVente,Long> {

    @Query("select pdv from PointDeVente pdv inner join pdv.bieres b where b=?1")
    public Iterable<PointDeVente> findByBiere(Biere b);
    
}
