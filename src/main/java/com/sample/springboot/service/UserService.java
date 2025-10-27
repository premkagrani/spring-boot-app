package com.sample.springboot.service;

import com.sample.springboot.document.MongoUser;
import com.sample.springboot.entity.User;
import com.sample.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


        // 🔹 Field Injection with @Autowired
        @Autowired
        private UserRepository userRepository;

        public List<User> getAllUsers() {
            return userRepository.findAll();
        }

        public User createUser(User user) {
            return userRepository.save(user);
        }

    public User updateUser(Long id, User updatedUser) {
            return userRepository.findById(id)
                    .map(existing -> {
                        existing.setName(updatedUser.getName());
                        existing.setEmail(updatedUser.getEmail());
                        return userRepository.save(existing);
                    })
                    .orElseThrow(() -> new RuntimeException("User not found"));
        }
    }

