package com.astontech.hr.repositories;

import com.astontech.hr.domain.Vehicle;
import com.astontech.hr.domain.VehicleModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by CodyMoor1 on 11/14/2017.
 */
public interface VehicleRepository extends CrudRepository<Vehicle, Integer>{

    //will auto generate the requireed code from the structer of the method name

    Vehicle findByVehicleVin(String vehicleVin);


    List<Vehicle> findAllByVehicleVin (String vehicleVin);

    List<Vehicle> findAllByVehicleVinIgnoreCase(String vehicleVin);
}
