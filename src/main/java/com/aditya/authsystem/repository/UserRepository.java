package com.aditya.authsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aditya.authsystem.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
