package com.quatarfootball.qatarfootball.Repository;
import com.quatarfootball.qatarfootball.Entity.Arbitre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArbitreRepository extends JpaRepository<Arbitre,Long> {

}
