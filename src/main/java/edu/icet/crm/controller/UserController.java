package edu.icet.crm.controller;

import edu.icet.crm.dto.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @PostMapping("/auth/login")
    public boolean login(@RequestBody User user){
        return false;
    }

    @PostMapping("/register")
    public String register(){
        return "";
    }
}
