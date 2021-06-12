package com.rabbitMQ.service;

import com.rabbitMQ.model.Message;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("rabbitMQSender")
public class RabbitMQSender {
    @Value("${rabbitmq.queue}")
    String queueName;
    @Value("${rabbitmq.exchange}")
    String exchange;
    @Autowired
    private AmqpTemplate rabbitTemplate;
    @Value("${rabbitmq.routingkey}")
    private String routingkey;

    public void send(Message message) {
        rabbitTemplate.convertAndSend(exchange, routingkey, message);
        System.out.println("Send msg = " + message);

    }
}
