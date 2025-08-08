package com.example.demo.usercrud.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.usercrud.model.User;
import com.example.demo.usercrud.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public User saveUser(User user) {
        return userRepo.save(user);
    }

    // ✅ Get user by ID
    public User getUserById(Long id) {
        return userRepo.findById(id)
            .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }

    // ✅ Update user
    public User updateUser(Long id, User updatedUser) {
        User existingUser = getUserById(id);
        existingUser.setName(updatedUser.getName());
        existingUser.setEmail(updatedUser.getEmail());
        return userRepo.save(existingUser);
    }

    // ✅ Delete user
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }
}
