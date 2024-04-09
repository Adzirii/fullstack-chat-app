package com.example.chatapp.controller;

import com.example.chatapp.dto.RegisterModel;
import com.example.chatapp.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {
    private final UserService userService;

    @GetMapping("/index")
    public String chat(){
      log.info("УРАААА");
        return "index";
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/login")
    public void register(@RequestBody RegisterModel form) {
        userService.save(form);
    }

}
