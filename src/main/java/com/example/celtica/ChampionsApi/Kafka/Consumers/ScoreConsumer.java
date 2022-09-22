package com.example.celtica.ChampionsApi.Kafka.Consumers;

import com.example.celtica.ChampionsApi.Kafka.Producers.ScoreProducer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ScoreConsumer {

    @KafkaListener(topics = ScoreProducer.topic,groupId = "mygroup")
    public void consumeFromTopic(String msg){
        System.out.println("Message to consume: "+msg);
    }
}
