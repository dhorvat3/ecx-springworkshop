package io.ecx.workshop.spring.workshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.ecx.workshop.spring.workshop.models.User;

public interface UserRepository extends JpaRepository<User, Integer>
{
    User findByUsername(String username);
    User findByEmail(String email);
}
