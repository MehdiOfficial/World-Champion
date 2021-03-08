package com.quatarfootball.qatarfootball.Service;

import com.quatarfootball.qatarfootball.Entity.Match;

import java.util.List;

public interface IterfMatchService {

    List<Match> findAllMatch();

    Match saveMatch(Match match);

    Match findMatchById(Long id);

    void deleteMatch(long id);
}
