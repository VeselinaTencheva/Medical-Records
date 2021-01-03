package com.university.MedicalRecords.services;

import com.university.MedicalRecords.entities.Pills;
import com.university.MedicalRecords.entities.Role;

import java.util.List;

public interface RoleService {
    Role create(Role role);
    Role edit(long id,Role role);
    void delete(Role role);
    Role findById(long id);
    List<Role> findAll();
}
