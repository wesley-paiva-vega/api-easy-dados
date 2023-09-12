package com.easydados.domain;

import java.util.List;

import com.easydados.dtos.UserDTO;
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

    @Enumerated(EnumType.STRING)
    private UserType userType;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserExperience> userExperiences;


    public User(UserDTO data) {
        this.firstName = data.firstName();
        this.lastName = data.lastName();
        this.email = data.email();
        this.document = data.document();
        this.userType = data.userType();
    }

}
