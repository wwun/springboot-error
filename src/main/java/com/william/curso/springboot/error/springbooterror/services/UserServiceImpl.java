package com.william.curso.springboot.error.springbooterror.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.william.curso.springboot.error.springbooterror.models.domain.User;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private List<User> users;

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public Optional<User> findById(Long id) {
        Optional<User> user = users.stream().filter( usr -> usr.getId().equals(id)).findFirst();
        
        //return Optional.ofNullable(user);   //devuelve user si existe o null si no.
        return user;
    }


}
