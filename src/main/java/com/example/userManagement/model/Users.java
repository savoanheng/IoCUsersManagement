
package com.example.userManagement.model;
public class Users {
    private Long id;
    private  String username;
    private String email;

    @Override
    public String toString() {
        return "Users{" + "id=" + id + ", username=" + username + ", email=" + email + '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Users(Long id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }
    
}
