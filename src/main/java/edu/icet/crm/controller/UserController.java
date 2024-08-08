package edu.icet.crm.controller;

import edu.icet.crm.dto.User;
import edu.icet.crm.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @PostMapping("/auth/login")
    public boolean login(@RequestBody User user){
        return service.login(user);
    }

    @PostMapping("/register")
    public String register(@RequestBody User user){
        return service.register(user);
    }
}
