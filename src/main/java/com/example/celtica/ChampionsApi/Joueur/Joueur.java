package com.example.celtica.ChampionsApi.Joueur;

import com.example.celtica.ChampionsApi.Club.Club;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Joueur {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long id;

    public String nom;
    public String prenom;
    public Date dateNaissance;
    public String piedFort;
    public String poste;
    public String nationalité;

    @ManyToOne
    @JoinColumn(name = "club_id")
    public Club club;

    public Joueur(){

    }

}
