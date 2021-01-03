package com.university.MedicalRecords.repositories;

import com.university.MedicalRecords.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,String> {
}
