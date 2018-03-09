package io.ecx.workshop.spring.workshop.service;

import io.ecx.workshop.spring.workshop.models.User;

public interface UserService
{
    User findByUsername(String username);
    User findByEmail(String email);
}
