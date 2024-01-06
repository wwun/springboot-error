package com.william.curso.springboot.error.springbooterror.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.william.curso.springboot.error.springbooterror.exceptions.UserNotFoundException;
import com.william.curso.springboot.error.springbooterror.models.domain.User;
import com.william.curso.springboot.error.springbooterror.services.UserService;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private UserService service;

    @GetMapping     //se ejecutará por defecto cuando entre a "/app"
    public String index(){
        //int value = 100/0;
        int value = Integer.parseInt("10x");
        System.out.println(value);
        return "ok 200";
    }

    @GetMapping("/show/{id}")
    public User show(@PathVariable Long id){
        User user = service.findById(id).orElseThrow(() -> 
            new UserNotFoundException("Error, el usuario no existe"));
        System.out.println(user.getLastname());
        return user;
    }
}
