package com.example.celtica.ChampionsApi.ResultatMatch;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ResultatMatch {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long id;

    int scoreLocale;
    int scoreVisiteur;

    public ResultatMatch(){}


}
