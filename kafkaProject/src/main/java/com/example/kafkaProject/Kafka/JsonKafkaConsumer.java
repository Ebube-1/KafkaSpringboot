package com.example.kafkaProject.Kafka;

import com.example.kafkaProject.dto.User;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "firstTopicJson", groupId = "myGroup")
    public void subscribe(User user){

        LOGGER.info(String.format("Json Message recieved: %s", user.toString()));
    }
}
