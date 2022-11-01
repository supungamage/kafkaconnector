package com.supung.kafkaconnector.controller;

import com.supung.kafkaconnector.model.BdeInput;
import com.supung.kafkaconnector.service.MessageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final MessageService messageService;

    public MessageController(final MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping
    public String postMessage(BdeInput message) {
        messageService.postMessage(message);
        return "message pushed to kafka";
    }
}
