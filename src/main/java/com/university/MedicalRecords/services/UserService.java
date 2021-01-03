package com.university.MedicalRecords.services;

import com.university.MedicalRecords.entities.Role;
import com.university.MedicalRecords.entities.User;

import java.util.List;

public interface UserService {
    User create(User user);
    User edit(User user);
    void delete(User user);
    User findById(String id);
    List<User> findAll();
}
