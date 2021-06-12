package com.rabbitMQ.service;

import com.rabbitMQ.model.Message;
import com.rabbitMQ.repository.MessageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("MessageService")
public class MessageService {
    @Autowired
    MessageDao messageDao;

    @Transactional
    public void addMessage(Message message) {
        messageDao.addMessage(message);
    }

}
