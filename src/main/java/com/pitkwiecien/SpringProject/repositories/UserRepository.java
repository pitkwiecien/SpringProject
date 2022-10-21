package com.pitkwiecien.SpringProject.repositories;

import com.pitkwiecien.SpringProject.models.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<UserDTO> getUsers(){
        return jdbcTemplate.query("SELECT * FROM user", BeanPropertyRowMapper.newInstance(UserDTO.class));
    }

    public UserDTO getUserById(int id) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM user WHERE user.id=?",
                BeanPropertyRowMapper.newInstance(UserDTO.class),
                id
        );
    }

    public int addUsers(List<UserDTO> userDTOs){
        int newRows = 0;
        for (UserDTO userDTO : userDTOs) {
            newRows += jdbcTemplate.update(
                    "INSERT INTO user(name, surname, email, role, password) VALUES(?,?,?,?,?)",
                    userDTO.getName(),
                    userDTO.getSurname(),
                    userDTO.getEmail(),
                    userDTO.getRole(),
                    userDTO.getPassword()
            );
        }
        return newRows;
    }

    public int deleteUser(int id) {
        return jdbcTemplate.update("DELETE FROM user WHERE user.id=?;", id);
    }
}
