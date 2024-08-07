package com.ems.employeemanagement.repository;

import com.ems.employeemanagement.model.Employee;
import com.ems.employeemanagement.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    List<Vehicle> findVehicleByType(String vehicleType);
    List<Vehicle> findVehicleByModel(String vehicleModel);


    Optional<Vehicle> findByEmployee(Employee employee);
}