package com.quatarfootball.qatarfootball.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "arbitre", catalog = "qatar")
public class Arbitre implements Serializable {
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
    Long weight;
    Long height;
    String Level; // deux niveaux
    Long NumberMatchsDone; //nombre de match déja arbitré

    @ManyToOne
    @JoinColumn(name="match_id", nullable=false)
    private Match match;

    //Constructors


    public Arbitre(String famName, String name, String country, Long age, String password, String email, String tel, Long weight, Long height, String level, Long numberMatchsDone, Match match) {
        FamName = famName;
        Name = name;
        Country = country;
        Age = age;
        this.password = password;
        this.email = email;
        this.tel = tel;
        this.weight = weight;
        this.height = height;
        Level = level;
        NumberMatchsDone = numberMatchsDone;
        this.match = match;
    }

    public Arbitre() {

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

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String level) {
        Level = level;
    }

    public Long getNumberMatchsDone() {
        return NumberMatchsDone;
    }

    public void setNumberMatchsDone(Long numberMatchsDone) {
        NumberMatchsDone = numberMatchsDone;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }
}


