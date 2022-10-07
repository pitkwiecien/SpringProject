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
}
