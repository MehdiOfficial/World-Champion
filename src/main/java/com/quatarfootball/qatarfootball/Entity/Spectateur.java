package com.quatarfootball.qatarfootball.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
//import javax.persistence.Table;

@Entity
@Table(name = "spectateur", catalog = "qatar")
public class Spectateur  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String FamName;
    String Name;
    String Country;
    Long Age;
    String password;
    String email;
    String tel;

    @ManyToOne
    @JoinColumn(name="match_id", nullable=false)
    private Match match;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "billet_id", referencedColumnName = "id")
    private Billet billet;

    //constructor


    public Spectateur(String famName, String name, String country, Long age, String password, String email, String tel, Match match, Billet billet) {
        FamName = famName;
        Name = name;
        Country = country;
        Age = age;
        this.password = password;
        this.email = email;
        this.tel = tel;
        this.match = match;
        this.billet = billet;
    }

    public Spectateur() {

    }

    //getters and setters

    public String getFamName() {
        return FamName;
    }

    public void setFamName(String famName) {
        FamName = famName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public Long getAge() {
        return Age;
    }

    public void setAge(Long age) {
        Age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Billet getBillet() {
        return billet;
    }

    public void setBillet(Billet billet) {
        this.billet = billet;
    }
}
