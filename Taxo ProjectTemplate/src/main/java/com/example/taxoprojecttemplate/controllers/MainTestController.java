package com.example.taxoprojecttemplate.controllers;

import com.example.taxoprojecttemplate.models.Driver;
import com.example.taxoprojecttemplate.repositories.CarRepository;
import com.example.taxoprojecttemplate.repositories.DriverRepository;
import com.example.taxoprojecttemplate.repositories.ManagerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class MainTestController {
    private CarRepository carRepository;
    private DriverRepository driverRepository;
    private ManagerRepository managerRepository;
    public MainTestController(CarRepository carRepository, DriverRepository driverRepository, ManagerRepository managerRepository){
        this.carRepository = carRepository;
        this.driverRepository = driverRepository;
        this.managerRepository = managerRepository;
    }
    @GetMapping("/drivers")
    public List<Driver> driverList(){
        List<Driver> driverList = driverRepository.findAll();
        return driverList;
    }

}
