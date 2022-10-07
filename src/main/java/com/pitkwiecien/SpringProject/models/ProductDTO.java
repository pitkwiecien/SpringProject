package com.pitkwiecien.SpringProject.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDTO {
    private int id;
    private String name;
    private float price;
    private int category;
    private String describe;
}
