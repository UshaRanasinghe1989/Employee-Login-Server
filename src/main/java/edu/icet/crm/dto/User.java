package edu.icet.crm.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private Long id;
    private String username;
    private String password;
    private String role;
    private String email;
}
