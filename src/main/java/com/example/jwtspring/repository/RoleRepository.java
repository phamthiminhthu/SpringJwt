package com.example.jwtspring.repository;

import com.example.jwtspring.common.ERole;
import com.example.jwtspring.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    @Query("select r from Role r where r.name = :name")
    Optional<Role> findByName(ERole name);
}
