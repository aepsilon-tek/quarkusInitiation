package org.aepsilon.culturetek.springboot.repository;

import org.aepsilon.culturetek.springboot.model.Biere;
import org.aepsilon.culturetek.springboot.model.PaysEnum;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface BiereRepository  extends CrudRepository<Biere,Long>{

    @Query("select b from Biere b inner join b.brasseur br where br.pays = ?1")
    Iterable<Biere> findByPays(PaysEnum pays);
    
}
