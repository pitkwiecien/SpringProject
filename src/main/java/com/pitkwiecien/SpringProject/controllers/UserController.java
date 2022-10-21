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
    public String putUser(@PathVariable("id") int id, @RequestBody UserDTO newUser){
        UserDTO oldUser = userRepository.getUserById(id);
        if(oldUser != null){
            newUser.setId(oldUser.getId());
            return userRepository.putUser(newUser) == 1 ? "OK" : "ERROR";
        } else {
            return "INVALID USER ID";
        }
    }

    @PatchMapping("{id}")
    public String patchUser(@PathVariable("id") int id, @RequestBody UserDTO newUser){
        UserDTO oldUser = userRepository.getUserById(id);
        if(oldUser != null){
            newUser.setId(oldUser.getId());
            if(newUser.getName() == null) newUser.setName(oldUser.getName());
            if(newUser.getSurname() == null) newUser.setSurname(oldUser.getSurname());
            if(newUser.getEmail() == null) newUser.setEmail(oldUser.getEmail());
            if(newUser.getRole() == null) newUser.setRole(oldUser.getRole());
            if(newUser.getPassword() == null) newUser.setPassword(oldUser.getPassword());
            return userRepository.putUser(newUser) == 1 ? "OK" : "ERROR";
        } else {
            return "INVALID USER ID";
        }
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
