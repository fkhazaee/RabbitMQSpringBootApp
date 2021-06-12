package com.rabbitMQ.controller;

import com.rabbitMQ.model.Message;
import com.rabbitMQ.service.MessageService;
import com.rabbitMQ.service.RabbitMQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping(value = "/api")
public class MessageController {

    @Autowired
    MessageService messageService;
    @Autowired
    RabbitMQSender rabbitMQSender;

    @PostMapping("/putmessage")
    public String putMessage(@ModelAttribute("message") Message message) {
        rabbitMQSender.send(message);
        return "Message sent to the RabbitMQ Successfully";
    }


    @GetMapping("/home")
    public ModelAndView home(Model model) {

        model.addAttribute("message", new Message());
        ModelAndView mav = new ModelAndView("messageDetails");
        return mav;
    }
}

