package com.example.taxoprojecttemplate;

import com.example.taxoprojecttemplate.models.Car;
import com.example.taxoprojecttemplate.models.Driver;
import com.example.taxoprojecttemplate.models.Manager;
import com.example.taxoprojecttemplate.repositories.CarRepository;
import com.example.taxoprojecttemplate.repositories.DriverRepository;
import com.example.taxoprojecttemplate.repositories.ManagerRepository;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoaderInit implements CommandLineRunner {
    private final DriverRepository driverRepository;
    private final ManagerRepository managerRepository;
    private final CarRepository carRepository;
    public DataLoaderInit(DriverRepository driverRepository, ManagerRepository managerRepository, CarRepository carRepository) {
        this.driverRepository = driverRepository;
        this.managerRepository = managerRepository;
        this.carRepository = carRepository;
    }
    @Override
    public void run(String... args) {
//        // Insert sample data for drivers
//        Driver driver1 = new Driver();
//        driver1.setFirstName("John");
//        driver1.setLastName("Doe");
//        driver1.setId(1L);
//
//        Driver driver2 = new Driver();
//        driver2.setFirstName("Jane");
//        driver2.setLastName("Smith");
//        driver2.setId(2L);
//
//        // Insert sample data for managers
//        Manager manager1 = new Manager();
//        manager1.setFirstName("Manager");
//        manager1.setLastName("One");
//        manager1.setId(1L);
//
//        Manager manager2 = new Manager();
//        manager2.setFirstName("Manager");
//        manager2.setLastName("Two");
//        manager2.setId(2L);
//
//        // Insert sample data for cars
//        Car car1 = new Car();
//        car1.setBrand("Toyota");
//        car1.setModel("Camry");
//        car1.setId(1L);
//
//        Car car2 = new Car();
//        car2.setBrand("Honda");
//        car2.setModel("Civic");
//        car2.setId(2L);
//        driverRepository.save(driver1);
//        driverRepository.save(driver2);
//        managerRepository.save(manager1);
//        managerRepository.save(manager2);
//        carRepository.save(car1);
//        carRepository.save(car2);
    }
}
