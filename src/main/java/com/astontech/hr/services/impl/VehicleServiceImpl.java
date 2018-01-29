package com.astontech.hr.services.impl;

import com.astontech.hr.domain.Vehicle;
import com.astontech.hr.repositories.VehicleRepository;
import com.astontech.hr.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by CodyMoor1 on 11/14/2017.
 */
@Service
public class VehicleServiceImpl implements VehicleService {

   @Autowired
   private VehicleRepository vehicleRepository;

    @Override
    public Iterable<Vehicle> listAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle getVehicleById(Integer id) {
        return vehicleRepository.findOne(id);
    }

    @Override
    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle saveVehicleById(Integer id) {
        return null;
    }

    @Override
    public Iterable<Vehicle> saveVehicleList(Iterable<Vehicle> vehicleIterable) {
        return vehicleRepository.save(vehicleIterable);
    }

    @Override
    public void deleteVehicle(Integer id) { vehicleRepository.delete(id);

    }

    @Override
    public Vehicle findByVehicleVin(String vehicleVin) {
        return vehicleRepository.findByVehicleVin(vehicleVin);
    }

    @Override
    public List<Vehicle> findAllByVehicleVin(String vehicleVin) {
        return vehicleRepository.findAllByVehicleVin(vehicleVin);
    }

    @Override
    public List<Vehicle> findAllByVehicleVinIgnoreCase(String vehicleVin) {
        return vehicleRepository.findAllByVehicleVin(vehicleVin);
    }
}
