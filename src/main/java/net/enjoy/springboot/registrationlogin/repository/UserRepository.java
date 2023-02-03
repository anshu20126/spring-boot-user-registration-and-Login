package net.enjoy.springboot.registrationlogin.repository;

import net.enjoy.springboot.registrationlogin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}