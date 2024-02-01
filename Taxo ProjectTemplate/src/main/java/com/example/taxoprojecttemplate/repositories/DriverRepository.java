package com.example.taxoprojecttemplate.repositories;

import com.example.taxoprojecttemplate.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {

}
