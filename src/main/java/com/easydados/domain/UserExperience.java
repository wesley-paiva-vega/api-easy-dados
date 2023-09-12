package com.easydados.domain;

import java.util.Date;

import com.easydados.dtos.UserExperienceDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity(name = "user_experiences")
@Table(name = "user_experiences")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserExperience {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;
    private String description;
    private Date age;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id") // Nome da coluna na tabela user_experiences que será a chave estrangeira
    private User user;

    public UserExperience(UserExperienceDTO data) {
        this.age = data.age();
        this.title = data.title();
        this.description = data.description();
    }
}