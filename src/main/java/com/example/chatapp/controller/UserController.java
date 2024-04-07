package com.example.chatapp.controller;

import com.example.chatapp.dto.RegisterModel;
import com.example.chatapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody RegisterModel form) {

        if (userService.findByUsername(form.username()) != null) {
            return "success";
        } else {
            return "error";
        }
    }

}
