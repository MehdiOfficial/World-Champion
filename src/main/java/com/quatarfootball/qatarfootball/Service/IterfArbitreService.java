package com.quatarfootball.qatarfootball.Service;
import com.quatarfootball.qatarfootball.Entity.Arbitre;
import java.util.List;

public interface IterfArbitreService {
    List < Arbitre > findAllArbitre();

    Arbitre saveArbitre(Arbitre arbitre);

    Arbitre findArbitreById(Long id);

    //void deleteArbitre(long id);
    void deleteArbitre(Arbitre arbitre);
}
