package com.example.celtica.ChampionsApi.Ligue;


import com.example.celtica.ChampionsApi.Club.Club;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Ligue {

    public Ligue() {
    }

    public Ligue(Long id, String nom, List<Club> clubs) {
        this.id = id;
        this.nom = nom;
        this.clubs = clubs;
    }

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    String nom;

    @OneToMany(mappedBy = "ligue",cascade = CascadeType.ALL)
    @JsonIgnoreProperties("ligue")
    List<Club> clubs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Club> getClubs() {
        return clubs;
    }

    public void setClubs(List<Club> clubs) {
        this.clubs = clubs;
    }

    @Override
    public String toString() {
        return String.format("{id:%s,nom:%s}",id,nom);
    }
}
