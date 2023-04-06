package com.example.javacase.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "roles")
@Data

public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private User.RoleName name;
    public static final User.RoleName ROLE_ADMIN = User.RoleName.ROLE_ADMIN;

    public Role() {}

    public Role(User.RoleName name) {
        this.name = name;
    }
}
