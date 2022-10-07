package com.pitkwiecien.SpringProject.controllers;

import com.pitkwiecien.SpringProject.models.UserDto;
import com.pitkwiecien.SpringProject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    public UserRepository userRepository;

    @GetMapping("/")
    public String main() {
        return "GLOWNA";
    }

    @GetMapping("/api/liczba")
    public String num() {
        return "Strona Glowna";
    }

    @GetMapping("/api/users")
    public List<UserDto> showUsers(){
        return userRepository.getUsers();
    }
}
