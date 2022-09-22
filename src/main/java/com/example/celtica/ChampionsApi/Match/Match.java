package com.example.celtica.ChampionsApi.Match;

import com.example.celtica.ChampionsApi.Calendrier.Calendrier;
import com.example.celtica.ChampionsApi.Club.Club;

import javax.persistence.*;
@Entity
@Table(name = "foot_match")
public class Match {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long id;

    @ManyToOne
    @JoinColumn(name = "calendrier_id")
    Calendrier calendrier;

    @OneToOne
    @JoinColumn(name = "club_locale")
    Club locale;

    @OneToOne
    @JoinColumn(name = "club_visiteur")
    Club visiteur;

    public Match(){}

}
