package com.quatarfootball.qatarfootball.Service;

import com.quatarfootball.qatarfootball.Entity.Billet;

import java.util.List;

public interface IterfBilletService {
    List<Billet> findAllBillet();

    Billet saveBillet(Billet billet);

    Billet findBilletById(Long id);

    void deleteBillet(long id);
}
