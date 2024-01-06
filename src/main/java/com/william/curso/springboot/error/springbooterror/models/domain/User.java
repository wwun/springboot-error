package com.william.curso.springboot.error.springbooterror.models.domain;

public class User {

    private Role role;

    private Long id;
    private String name;
    private String lastname;
    
    public User(Long id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }
    public User() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public Role getRole() {
        return role;
    }
    // public String getRoleName() {
    //     return role.getName();
    // }
    public void setRole(Role role) {
        this.role = role;
    }
    
}
