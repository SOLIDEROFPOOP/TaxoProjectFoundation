package com.example.taxoprojecttemplate.repositories;

import com.example.taxoprojecttemplate.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
