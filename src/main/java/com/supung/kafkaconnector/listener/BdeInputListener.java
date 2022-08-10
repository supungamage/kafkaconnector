package com.supung.kafkaconnector.listener;

import com.supung.kafkaconnector.model.BdeInput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BdeInputListener {

//    @KafkaListener(topics = "${kafka.topicName}", groupId = "${kafka.groupId}")
//    public void onMessage(String message) {
//        log.info("Received Message: " + message);
//    }

    @KafkaListener(topics = "${kafka.topicName}", containerFactory = "bdeInputKafkaListenerContainerFactory")
    public void greetingListener(BdeInput bdeInput) {
        log.info("Received Message: " + bdeInput);
    }
}
