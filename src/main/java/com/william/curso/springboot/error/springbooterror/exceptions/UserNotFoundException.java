package com.william.curso.springboot.error.springbooterror.exceptions;

import com.william.curso.springboot.error.springbooterror.models.domain.User;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message){
        super(message);
    }
}
