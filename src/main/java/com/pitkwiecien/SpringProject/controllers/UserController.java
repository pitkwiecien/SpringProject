package com.pitkwiecien.SpringProject.controllers;

import com.pitkwiecien.SpringProject.models.UserDTO;
import com.pitkwiecien.SpringProject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users/")
public class UserController {
    @Autowired
    public UserRepository userRepository;

    @GetMapping
    public List<UserDTO> showUsers(){
        return userRepository.getUsers();
    }

    @PostMapping
    public int addUser(@RequestBody List<UserDTO> userDTOs){
        return userRepository.addUsers(userDTOs);
    }

    @PutMapping("{id}")
    public String putUser(){
        return "TODO updatePut";
    }

    @PatchMapping("{id}")
    public String patchUser(){
        return "TODO updatePatch";
    }

    @GetMapping("{id}")
    public UserDTO showUserById(@PathVariable("id") int id){
        return userRepository.getUserById(id);
    }

    @DeleteMapping("{id}")
    public int deleteUser(@PathVariable("id") int id){
        return userRepository.deleteUser(id);
    }
}
