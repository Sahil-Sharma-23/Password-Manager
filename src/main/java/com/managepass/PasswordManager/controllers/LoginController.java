package com.managepass.PasswordManager.controllers;

import com.managepass.PasswordManager.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login-user")
    public String loginUser(@RequestParam String username, @RequestParam String password){
        return loginService.loginUser(username, password);
    }
}
