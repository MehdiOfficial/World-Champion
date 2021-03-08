package com.quatarfootball.qatarfootball.Service;

import com.quatarfootball.qatarfootball.Entity.Personne;

import java.util.List;

public interface IterfPersonneService {

    List<Personne> findAllPersonne();

    Personne savePersonne(Personne personne);

    Personne findPersonneById(Long id);

    void deletePersonne(long id);
}
