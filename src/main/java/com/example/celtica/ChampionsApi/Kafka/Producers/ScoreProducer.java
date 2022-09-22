package com.example.celtica.ChampionsApi.Kafka.Producers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ScoreProducer {

    public static final String topic="scoreTopic";

    @Autowired
    private KafkaTemplate<String,String> kafkaTemp;

    public void publichToTopic(String msg){
        System.out.println("Message to send: "+msg);
        kafkaTemp.send(topic,msg);
    }
}
