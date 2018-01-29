package com.astontech.hr.services;

import com.astontech.hr.domain.VehicleMake;

import java.util.List;

/**
 * Created by CodyMoor1 on 11/14/2017.
 */
public interface MakeService {

    Iterable<VehicleMake> listAllMake();

    VehicleMake getMakeById(Integer id);

    VehicleMake saveMake(VehicleMake vehicleMake);

    VehicleMake saveMakeById(Integer id);

    Iterable<VehicleMake> saveMakeList (Iterable<VehicleMake> makesIterable);

    void deleteMake(Integer id);


    //custom repository methods
//    VehicleMake findMakeByName (String makeName);
//
//    List<VehicleMake> findAllByMakeName(String makeName);
//
//    List<VehicleMake> findAllByMakeNameIgnoreCase(String makeName);




}
