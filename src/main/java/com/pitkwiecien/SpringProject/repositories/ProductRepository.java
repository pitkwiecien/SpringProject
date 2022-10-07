package com.pitkwiecien.SpringProject.repositories;

import com.pitkwiecien.SpringProject.models.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<ProductDto> getProducts(){
        return jdbcTemplate.query("SELECT * FROM product", BeanPropertyRowMapper.newInstance(ProductDto.class));
    }
}
