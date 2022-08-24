package com.managepass.PasswordManager.service;

import com.managepass.PasswordManager.model.User;

import java.util.List;
import java.util.Optional;

public interface RegisterService {
    public User createNewUser(User user);
    public Optional<User> getUser(String username);
    public List<User> getAllUsers();
    public String deleteUser(String username);
    public String updateUser(User user);
}
