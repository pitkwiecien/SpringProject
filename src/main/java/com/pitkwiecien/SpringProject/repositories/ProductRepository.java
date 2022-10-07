package com.pitkwiecien.SpringProject.repositories;

import com.pitkwiecien.SpringProject.models.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<ProductDTO> getProducts(){
        return jdbcTemplate.query("SELECT * FROM product", BeanPropertyRowMapper.newInstance(ProductDTO.class));
    }
}
