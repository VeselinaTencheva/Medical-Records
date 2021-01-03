package com.university.MedicalRecords.services;

import com.university.MedicalRecords.entities.User;
import com.university.MedicalRecords.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;


    @Override
    public User create(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User edit(long id,User user) {
        user.setId(id);
        return this.userRepository.saveAndFlush(user);
    }

    @Override
    public void delete(User user) {
        this.userRepository.delete(user);
    }

    @Override
    public User findById(long id) {
        return this.userRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("User not found"));
    }

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }
}
