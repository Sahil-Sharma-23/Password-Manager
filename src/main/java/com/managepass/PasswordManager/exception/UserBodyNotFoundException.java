package com.managepass.PasswordManager.exception;

public class UserBodyNotFoundException extends RuntimeException {
    private String message;

    public UserBodyNotFoundException(){}

    public UserBodyNotFoundException(String message){
        this.message = message;
    }

}
