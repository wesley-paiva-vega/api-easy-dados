package com.easydados.repositories;

import com.easydados.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User>findUserByDocument(String document);
    Optional<User>findUserById(Long id);

}
