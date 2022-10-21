package com.pitkwiecien.SpringProject.controllers;

import com.pitkwiecien.SpringProject.models.UserDTO;
import com.pitkwiecien.SpringProject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    public UserRepository userRepository;

    @GetMapping("/api/users/")
    public List<UserDTO> showUsers(){
        return userRepository.getUsers();
    }

    @PostMapping("/api/users/")
    public int addUser(@RequestBody List<UserDTO> userDTOs){
        return userRepository.addUsers(userDTOs);
    }

    @PutMapping("/api/users/updatePut/{id}")
    public String putUser(){
        return "TODO updatePut";
    }

    @PatchMapping("/api/users/updatePatch/{id}")
    public String patchUser(){
        return "TODO updatePatch";
    }

    @GetMapping("/api/users/{id}")
    public UserDTO showUserById(@PathVariable("id") int id){
        return userRepository.getUserById(id);
    }

    @DeleteMapping("/api/users/{id}")
    public int deleteUser(@PathVariable("id") int id){
        return userRepository.deleteUser(id);
    }
}
