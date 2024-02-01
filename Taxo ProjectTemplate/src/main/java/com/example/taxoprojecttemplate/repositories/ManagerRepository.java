package com.example.taxoprojecttemplate.repositories;

import com.example.taxoprojecttemplate.models.Driver;
import com.example.taxoprojecttemplate.models.Manager;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManagerRepository extends JpaRepository<Manager,Long> {
}
