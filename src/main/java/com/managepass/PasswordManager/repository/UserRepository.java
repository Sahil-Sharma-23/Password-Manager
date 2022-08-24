package com.managepass.PasswordManager.repository;

import com.managepass.PasswordManager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
}
