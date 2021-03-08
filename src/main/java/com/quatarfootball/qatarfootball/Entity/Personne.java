package com.quatarfootball.qatarfootball.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
//@Table(name = "user", catalog = "qatar")
public class Personne implements Serializable {
    //Attributes
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

    //Constructors

    public Personne (String famName, String name, String country, Long age, String password, String email, String tel) {
        FamName = famName;
        Name = name;
        Country = country;
        Age = age;
        this.password = password;
        this.email = email;
        this.tel = tel;
    }


    public Personne() {

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
}
