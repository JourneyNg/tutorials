package com.baeldung.axon.querymodel;

import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Service;

import com.baeldung.axon.coreapi.events.MessageCreatedEvent;
import com.baeldung.axon.coreapi.events.MessageReadEvent;

@Service
public class MessagesEventHandler {

    @EventHandler
    public void handle(MessageCreatedEvent event) {
        System.out.println("Message received: " + event.getText() + " (" + event.getId() + ")");
    }

    @EventHandler
    public void handle(MessageReadEvent event) {
        System.out.println("Message read: " + event.getId());
    }
}