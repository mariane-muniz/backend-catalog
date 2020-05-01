package com.store.catalog.listener.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.omni.aurora.core.dto.FarmMessageData;
import com.store.catalog.listener.MessageQueueListener;
import com.omni.aurora.core.services.EntityCatalogService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.activemq.command.ActiveMQTextMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;

@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MessageQueueListenerImpl implements MessageQueueListener {
    private final EntityCatalogService entityCatalogService;

    @JmsListener(destination = "queue")
    public void receive(final Message message) {
        if (((ActiveMQTextMessage) message).isMessage()) {
            try {
                final ObjectMapper mapper = new ObjectMapper();
                final String text = ((ActiveMQTextMessage) message).getText();
                final FarmMessageData dto = mapper.readValue(text, FarmMessageData.class);
                log.info("ActiveMQ message: " + dto.getType() + " - " + text);
                this.createEntity(dto);
                message.acknowledge();
            }
            catch (JsonProcessingException | JMSException e) {
                log.error(e.getMessage());
            }
        }
    }

    private void createEntity(final FarmMessageData dto) {
        try {
            if (dto.getAction().equals("DELETE")) {
                this.entityCatalogService.deleteEntity(dto);
            }
            else {
                this.entityCatalogService.saveEntity(dto);
            }
        }
        catch (ClassNotFoundException e) {
            log.error(e.getMessage());
        }
    }
}