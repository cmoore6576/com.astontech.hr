package com.astontech.hr.repositories;


import com.astontech.hr.domain.Vehicle;
import com.astontech.hr.domain.VehicleMake;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by CodyMoor1 on 11/14/2017.
 */
public interface MakeRepository extends CrudRepository <VehicleMake,Integer> {

    //will auto generate the required code from the structure of the method name

//    VehicleMake saveMakeById(Integer id);

//    VehicleMake findVehicleMakeByMakeName(String makeName);
//
//    List<VehicleMake> findAllByMakeName(String makeName);
//
//    List<VehicleMake> findAllByMakeNameIgnoreCase(String makeName);
}
