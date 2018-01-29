package com.astontech.hr.services;

import com.astontech.hr.domain.Vehicle;

import java.util.List;

/**
 * Created by CodyMoor1 on 11/14/2017.
 */
public interface VehicleService {

    Iterable<Vehicle> listAllVehicles();

    Vehicle getVehicleById(Integer id);

    Vehicle saveVehicle(Vehicle vehicle);

    Vehicle saveVehicleById(Integer id);

    Iterable<Vehicle> saveVehicleList (Iterable<Vehicle> vehicleIterable);

    void deleteVehicle(Integer id);


    //custom repository methods
    Vehicle findByVehicleVin (String vehicleVin);

    List<Vehicle> findAllByVehicleVin(String vehicleVin);

    List<Vehicle> findAllByVehicleVinIgnoreCase(String vehicleVin);
}
