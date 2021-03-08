package com.quatarfootball.qatarfootball.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "billet", catalog = "qatar")
public class Billet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    Long price;
    Date paiementDate;

    @ManyToOne
    @JoinColumn(name="match_id", nullable=false)
    private Match match;

    @OneToOne(mappedBy = "billet")
    private Spectateur spectateur;

    //Constructors



    public Billet(Long price, Date paiementDate, Match match, Spectateur spectateur) {
        this.price = price;
        this.paiementDate = paiementDate;
        this.match = match;
        this.spectateur = spectateur;
    }

    public Billet() {

    }

    //getters and setters


    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Date getPaiementDate() {
        return paiementDate;
    }

    public void setPaiementDate(Date paiementDate) {
        this.paiementDate = paiementDate;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Spectateur getSpectateur() {
        return spectateur;
    }

    public void setSpectateur(Spectateur spectateur) {
        this.spectateur = spectateur;
    }
}
