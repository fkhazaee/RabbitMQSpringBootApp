package com.rabbitMQ.repositoryImpl;

import com.rabbitMQ.model.Message;
import com.rabbitMQ.repository.MessageDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MessageDaoImpl implements MessageDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    public Message addMessage(Message message) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(message);
        return message;
    }

}
