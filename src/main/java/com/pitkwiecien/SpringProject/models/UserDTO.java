package com.pitkwiecien.SpringProject.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {
    private int id;
    private String name;
    private String surname;
    private String email;
    private Integer role;
    private String password;
}
