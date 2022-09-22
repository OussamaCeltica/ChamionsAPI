package com.example.celtica.ChampionsApi.Club;


import com.example.celtica.ChampionsApi.Joueur.Joueur;
import com.example.celtica.ChampionsApi.Ligue.Ligue;
import com.example.celtica.ChampionsApi.Match.Match;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
public class Club {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long id;
    public String nom;
    public String pseudo;
    public Date dateCreation;

    public Club(){}

    public Club(Long id, String nom, String pseudo, Date dateCreation, Ligue ligue, List<Joueur> joueurs, List<Match> matchs) {
        this.id = id;
        this.nom = nom;
        this.pseudo = pseudo;
        this.dateCreation = dateCreation;
        this.ligue = ligue;
        this.joueurs = joueurs;
        this.matchs = matchs;
    }

    @ManyToOne
    @JoinColumn(name = "ligue_id")
    @JsonIgnoreProperties("clubs")
    public Ligue ligue;

    @OneToMany(mappedBy = "club")
    List<Joueur> joueurs;

    @OneToMany
    @JoinColumn(name = "id")
    List<Match> matchs;

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

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Ligue getLigue() {
        return ligue;
    }

    public void setLigue(Ligue ligue) {
        this.ligue = ligue;
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(List<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    public List<Match> getMatchs() {
        return matchs;
    }

    public void setMatchs(List<Match> matchs) {
        this.matchs = matchs;
    }
}
