package edu.icet.crm.service.impl;

import edu.icet.crm.dto.User;
import edu.icet.crm.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public boolean login(User user) {
        return false;
    }

    @Override
    public String register(User user) {
        return null;
    }
}
