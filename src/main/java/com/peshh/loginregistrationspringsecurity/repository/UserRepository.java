package com.peshh.loginregistrationspringsecurity.repository;

import com.peshh.loginregistrationspringsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);

    boolean existsByEmail(String email);

    boolean existsByUserName(String username);


        Optional<User> findByUsername(String username);

}