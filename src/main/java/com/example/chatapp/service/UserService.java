package com.example.chatapp.service;

import com.example.chatapp.dto.RegisterModel;
import com.example.chatapp.model.User;
import com.example.chatapp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void save(RegisterModel registerModel){
        User user = new User();
        user.setUsername(registerModel.username());
        user.setPassword(registerModel.password());
        userRepository.save(user);
        log.info("Успешно сохранил");
    }

    public Boolean findByUsername(String username){
        return userRepository.findByUsername(username).isPresent();

    }


}
