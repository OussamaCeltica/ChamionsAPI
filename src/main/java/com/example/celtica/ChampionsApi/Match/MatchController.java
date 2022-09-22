package com.example.celtica.ChampionsApi.Match;

import com.example.celtica.ChampionsApi.Kafka.Producers.ScoreProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/match")
public class MatchController {


    @Autowired
    ScoreProducer scoreProducer;

    



    @GetMapping
    public String getMatchScore(){
        scoreProducer.publichToTopic("score = USMB 2-1 USMA");

        return "USMB 2-1 USMA";
    }
}
