package com.quatarfootball.qatarfootball.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "match", catalog = "qatar")
public class Match implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     String TeamA;
     String TeamB;
     Date  MatchDate;
     String result;

    @OneToMany(mappedBy="match")
    private Set<Spectateur> spectateursList;


    @OneToMany(mappedBy="match")
    Set<Billet> ListBillets;

    @OneToMany(mappedBy="match")
    private Set<Spectateur> arbitresList;

    //Constructors



    public Match(String teamA, String teamB, Date matchDate, String result, Set<Spectateur> spectateursList, Set<Billet> listBillets, Set<Spectateur> arbitresList) {
        TeamA = teamA;
        TeamB = teamB;
        MatchDate = matchDate;
        this.result = result;
        this.spectateursList = spectateursList;
        ListBillets = listBillets;
        this.arbitresList = arbitresList;
    }

    public Match() {

    }

    //getters and setters

    public String getTeamA() {
        return TeamA;
    }

    public void setTeamA(String teamA) {
        TeamA = teamA;
    }

    public String getTeamB() {
        return TeamB;
    }

    public void setTeamB(String teamB) {
        TeamB = teamB;
    }

    public Date getMatchDate() {
        return MatchDate;
    }

    public void setMatchDate(Date matchDate) {
        MatchDate = matchDate;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Set<Spectateur> getSpectateursList() {
        return spectateursList;
    }

    public void setSpectateursList(Set<Spectateur> spectateursList) {
        this.spectateursList = spectateursList;
    }

    public Set<Billet> getListBillets() {
        return ListBillets;
    }

    public void setListBillets(Set<Billet> listBillets) {
        ListBillets = listBillets;
    }

    public Set<Spectateur> getArbitresList() {
        return arbitresList;
    }

    public void setArbitresList(Set<Spectateur> arbitresList) {
        this.arbitresList = arbitresList;
    }
}
