package com.example.security.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true,
            columnDefinition = "varchar(50)")
    private String username;

    @Column(nullable = false)
    private String password;

    @ManyToMany(targetEntity = Roles.class,fetch = FetchType.EAGER)
    private Set<Roles> roles;
}
