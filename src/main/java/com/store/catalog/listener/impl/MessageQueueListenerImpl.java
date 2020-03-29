package com.store.catalog.listener.impl;

import com.omni.aurora.core.dto.FarmMessageData;
import com.store.catalog.listener.MessageQueueListener;
import lombok.extern.slf4j.Slf4j;
import org.apache.activemq.command.ActiveMQTextMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;

@Slf4j
@Service
public class MessageQueueListenerImpl implements MessageQueueListener {

    @JmsListener(destination = "queue")
    public void receive(final Message message, final FarmMessageData farmMessageData) throws JMSException {
        message.acknowledge();
        if (((ActiveMQTextMessage) message).isMessage()) {
            final String text = ((ActiveMQTextMessage) message).getText();
            log.info(text);
        }
    }
}