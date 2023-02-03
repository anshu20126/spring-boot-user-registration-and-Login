package net.enjoy.springboot.registrationlogin.repository;

import net.enjoy.springboot.registrationlogin.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}