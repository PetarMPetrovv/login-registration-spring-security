package com.peshh.loginregistrationspringsecurity.repository;
import java.util.Optional;

import com.peshh.loginregistrationspringsecurity.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String name);
}