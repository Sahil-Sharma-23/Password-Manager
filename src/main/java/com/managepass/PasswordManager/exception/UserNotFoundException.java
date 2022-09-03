package com.managepass.PasswordManager.exception;

import com.managepass.PasswordManager.model.User;

public class UserNotFoundException extends Exception {
    private String message;

    public UserNotFoundException(){

    }
    public UserNotFoundException(String message){
        this.message = message;
    }
}
