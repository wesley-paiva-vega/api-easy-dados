package com.easydados.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "users")
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    @Column(unique = true)
    private  String document;

    @Column(unique = true)
    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private UserType userType;

}
