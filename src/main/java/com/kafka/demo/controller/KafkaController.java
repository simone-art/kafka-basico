package com.kafka.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequiredArgsConstructor
public class KafkaController {

    //private final KafkaProducer kafkaProducer;

    @PostMapping("/messages/send")
    public ResponseEntity<String> sendMessage(@RequestBody String message) {

        //kafkaProducer.send(message);
        return ResponseEntity.ok(message);

    }
  }
