package com.pitkwiecien.SpringProject.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ProductDto {
    private int id;
    private String name;
    private float price;
    private int category;
    private String describe;
}
