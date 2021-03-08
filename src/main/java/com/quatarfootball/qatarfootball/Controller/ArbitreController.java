package com.quatarfootball.qatarfootball.Controller;

import com.quatarfootball.qatarfootball.Entity.Arbitre;
import com.quatarfootball.qatarfootball.Entity.Match;
import com.quatarfootball.qatarfootball.Repository.ArbitreRepository;
import com.quatarfootball.qatarfootball.Service.IterfArbitreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;

import java.util.List;


@RestController
@RequestMapping("/api/QatarAppAPI")

public class ArbitreController {
    @Autowired
    private ArbitreRepository arbitreRepository;

    //get all arbitres

    @GetMapping("/allArbitres")
    public List<Arbitre> getAllArbitres() {
        return arbitreRepository.findAll();
    }
}
