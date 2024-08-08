package edu.icet.crm.service;

import edu.icet.crm.dto.User;

public interface UserService {
    boolean login(User user);
    String register(User user);
}
