package com.example.chatapp.service;

import com.example.chatapp.dto.RegisterModel;
import com.example.chatapp.model.User;
import com.example.chatapp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void save(RegisterModel registerModel){
        User user = new User();
        user.setUsername(registerModel.username());
        user.setPassword(registerModel.password());
        userRepository.save(user);
    }

    public Boolean findByUsername(String username){
        return userRepository.findByUsername(username).isPresent();

    }


}
