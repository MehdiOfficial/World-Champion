package com.quatarfootball.qatarfootball.Repository;

import com.quatarfootball.qatarfootball.Entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match,Long> {
}
