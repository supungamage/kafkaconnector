package com.supung.kafkaconnector.service;

import com.supung.kafkaconnector.model.BdeInput;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final KafkaTemplate<String, BdeInput> kafkaTemplate;
    private String topic;

    public MessageService(final KafkaTemplate<String, BdeInput> kafkaTemplate,
                          @Value(value = "${kafka.topicName}") String topic) {
        this.kafkaTemplate = kafkaTemplate;
        this.topic = topic;
    }

    public void postMessage(BdeInput message) {
        kafkaTemplate.send(topic, message);
    }
}
