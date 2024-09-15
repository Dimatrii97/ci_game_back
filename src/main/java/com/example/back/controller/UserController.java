package com.example.back.controller;

import com.example.back.useCase.SaveUsersByRoom;
import lombok.AllArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class UserController {

    private final SaveUsersByRoom saveUsersByRoom;

    @MessageMapping("user/save")
    public boolean saveUsers() {
        saveUsersByRoom.execute();
    }



}
