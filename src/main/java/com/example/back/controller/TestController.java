package com.example.back.controller;

import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

//    @GetMapping("/")
//    public String main(Model model) {
//        model.addAttribute("name", "Game");
//        return "index";
//    }

//    @GetMapping("/tt")
//    public String test(Model model) {
//        return "00000";
//    }

    @MessageMapping("/test")
    @SendTo("/topic/game")
    public String change(Message message) {
        System.out.print(message.getPayload() + "55555");
        return "33333";
    }

}
