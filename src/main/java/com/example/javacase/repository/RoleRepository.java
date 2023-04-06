package com.example.javacase.repository;

import com.example.javacase.entities.ERole;
import com.example.javacase.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Object> findByName(ERole eRole);
}
