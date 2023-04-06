package com.example.javacase.repository;

import com.example.javacase.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer > {
    Optional<Object> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
    Optional<User> findByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);


}
