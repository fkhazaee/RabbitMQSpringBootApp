//package com.rabbitMQ.service;
//
//import com.rabbitMQ.model.Message;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class RabbitMQConsumer {
//    @Autowired
//    MessageService messageService;
//
//    @RabbitListener(queues = "${rabbitmq.queue}")
//    public void recievedMessage(Message message) {
//        messageService.addMessage(message);
//        System.out.println("Recieved Message From RabbitMQ: " + message);
//
//    }
//}
