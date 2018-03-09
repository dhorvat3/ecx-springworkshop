package io.ecx.workshop.spring.workshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import io.ecx.workshop.spring.workshop.models.User;
import io.ecx.workshop.spring.workshop.repository.UserRepository;
import io.ecx.workshop.spring.workshop.service.UserService;

public class DefaultUserServiceImpl implements UserService
{
    @Autowired
    UserRepository userRepository;

    @Override
    public User findByUsername(String username)
    {
        return null;
    }

    @Override
    public User findByEmail(String email)
    {
        return null;
    }
}
