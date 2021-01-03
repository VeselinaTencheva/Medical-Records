package com.university.MedicalRecords.services;

import com.university.MedicalRecords.entities.Role;
import com.university.MedicalRecords.entities.User;

import java.util.List;

public interface UserService {
    User create(User user);
    User edit(long id,User user);
    void delete(User user);
    User findById(long id);
    List<User> findAll();
}
