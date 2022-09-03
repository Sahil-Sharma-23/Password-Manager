package com.managepass.PasswordManager.controllers;

import com.managepass.PasswordManager.model.User;
import com.managepass.PasswordManager.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RestController
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @GetMapping("/get-all-users")
    public List<User> getAllUsers(){
        return registerService.getAllUsers();
    }

    @PostMapping(path = "/add-new-user", consumes = "application/json", produces = "application/json")
    public User createUser(@RequestBody User user){
        return registerService.createNewUser(user);
    }

    @GetMapping("/get-user")
    public Optional<User> getUser(@RequestParam Long id){
        return registerService.getUser(id);
    }

    @DeleteMapping("/delete-user")
    public String deleteUser(@RequestParam Long id){
        return registerService.deleteUser(id);
    }

    @PatchMapping("/update-user")
    public String updateUser(@RequestBody User user){
        return registerService.updateUser(user);
    }

}
