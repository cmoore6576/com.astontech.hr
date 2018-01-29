package com.astontech.hr.services.impl;

import com.astontech.hr.domain.Vehicle;
import com.astontech.hr.domain.VehicleMake;
import com.astontech.hr.repositories.MakeRepository;
import com.astontech.hr.services.MakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by CodyMoor1 on 11/14/2017.
 */
@Service
public class MakeServiceImpl implements MakeService{


    @Autowired
    private MakeRepository makeRepository;

    @Override
    public VehicleMake saveMakeById (Integer id){return null;}

    @Override
    public Iterable<VehicleMake> listAllMake() {return makeRepository.findAll();}

    @Override
    public VehicleMake saveMake (VehicleMake vehicleMake){return makeRepository.save(vehicleMake);}

    @Override
    public Iterable<VehicleMake> saveMakeList (Iterable<VehicleMake> makeIterable){
        return makeRepository.save(makeIterable);

    }

    @Override
    public void deleteMake(Integer id){
        makeRepository.delete(id);
    }


//    @Override
//    public List<VehicleMake> findAllByMakeName(String makeName) {
//        return makeRepository.findAllByMakeName(makeName);
//    }


    @Override
    public VehicleMake getMakeById(Integer id) {
        return makeRepository.findOne(id);
    }

//    @Override
//    public VehicleMake findMakeByName(String makeName) {return makeRepository.findVehicleMakeByMakeName(makeName);}
//
//    @Override
//    public List<VehicleMake> findAllByMakeNameIgnoreCase(String makeName) {
//        return makeRepository.findAllByMakeNameIgnoreCase(makeName);
//    }
}
