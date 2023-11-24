package com.kafka.demo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {


    @KafkaListener(topics = "${kafka.topic.name}")
    public void listener(@Payload String message) {
        System.out.println("Message recevied: " + message);
    }

}
