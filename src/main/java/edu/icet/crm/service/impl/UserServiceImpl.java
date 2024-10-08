package edu.icet.crm.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.dto.User;
import edu.icet.crm.entity.UserEntity;
import edu.icet.crm.repository.UserRepository;
import edu.icet.crm.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    private final ObjectMapper mapper;
    @Override
    public boolean login(User user) {
        return false;
    }

    @Override
    public String register(User user) {
        repository.save(mapper.convertValue(user, UserEntity.class));
        return "ok";
    }
}
