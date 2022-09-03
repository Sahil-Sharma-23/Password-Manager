package com.managepass.PasswordManager.exception;

public class UserAlreadyExistException extends RuntimeException{
    private String message;

    public UserAlreadyExistException(){
    }

    public UserAlreadyExistException(String message){
        super(message);
        this.message = message;
    }
}
