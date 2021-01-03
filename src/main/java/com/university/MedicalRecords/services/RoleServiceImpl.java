package com.university.MedicalRecords.services;

import com.university.MedicalRecords.entities.Pills;
import com.university.MedicalRecords.entities.Role;
import com.university.MedicalRecords.repositories.PillsRepository;
import com.university.MedicalRecords.repositories.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService{
    private final RoleRepository roleRepository;

    @Override
    public Role create(Role role) {
        return this.roleRepository.save(role);
    }

    @Override
    public Role edit(long id,Role role) {
        role.setId(id);
        return this.roleRepository.saveAndFlush(role);
    }

    @Override
    public void delete(Role role) {
        this.roleRepository.delete(role);
    }

    @Override
    public Role findById(long id) {
        return this.roleRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Role not found"));
    }

    @Override
    public List<Role> findAll() {
        return this.roleRepository.findAll();
    }
}
