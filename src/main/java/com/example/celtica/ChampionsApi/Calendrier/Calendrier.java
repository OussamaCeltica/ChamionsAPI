package com.example.celtica.ChampionsApi.Calendrier;

import com.example.celtica.ChampionsApi.Match.Match;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Calendrier {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long id;

    public String saison;

    @OneToMany(mappedBy = "calendrier")
    List<Match> matchs;
}
