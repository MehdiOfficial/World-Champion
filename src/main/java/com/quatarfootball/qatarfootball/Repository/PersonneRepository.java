package com.quatarfootball.qatarfootball.Repository;

import com.quatarfootball.qatarfootball.Entity.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne,Long> {
}
