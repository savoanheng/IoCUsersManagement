package com.example.userManagement.service;
import com.example.userManagement.model.Users;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private List<Users> users = new ArrayList<>();

    public List<Users> getAllUsers() {
        return users;
    }

    public Users getUserById(Long id) {
        return users.stream().filter(
  user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    public void addUser(Users user) {
        users.add(user);
    }

    public void updateUser(Long id, Users updatedUser) {
        for (int i = 0; i < users.size(); i++) {
            Users user = users.get(i);
            if (user.getId().equals(id)) {
                users.set(i, updatedUser);
                return;
            }
        }
    }

    public void deleteUser(Long id) {
        users.removeIf(user -> user.getId().equals(id));
    }

    public void addUsers(Users user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
