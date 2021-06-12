package com.rabbitMQ.repository;

import com.rabbitMQ.model.Message;

public interface MessageDao {

    public Message addMessage(Message message);
}
