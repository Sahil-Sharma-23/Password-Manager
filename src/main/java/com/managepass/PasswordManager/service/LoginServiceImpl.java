package com.managepass.PasswordManager.service;

import com.managepass.PasswordManager.model.User;
import com.managepass.PasswordManager.repository.UserRepository;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public String loginUser(String username, String password) {

        Optional<User> optionalLoggingUser = userRepository.findById(username);
        User loggingUser = optionalLoggingUser.get();

        if (username.equals(loggingUser.getUsername())
                && password.equals(loggingUser.getPassword())){
            System.out.println("User is logged in!");
            return "USER IS LOGGED IN!";
        }
        else {
            System.out.println("Incorrect username or password!");
            return "Incorrect username or password!";
        }
    }
}
