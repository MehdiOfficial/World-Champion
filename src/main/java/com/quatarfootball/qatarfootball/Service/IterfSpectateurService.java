package com.quatarfootball.qatarfootball.Service;

import com.quatarfootball.qatarfootball.Entity.Spectateur;
import java.util.List;

public interface IterfSpectateurService {

    List<Spectateur> findAllSpectateur();

    Spectateur saveSpectateur(Spectateur spectateur);

    Spectateur findSpectateurById(Long id);

    void deleteSpectateur(long id);
}
