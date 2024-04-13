package com.peshh.loginregistrationspringsecurity.repository;

import com.peshh.loginregistrationspringsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String username, String email);

    boolean existsByEmail(String email);

    boolean existsByUserName(String username);
}