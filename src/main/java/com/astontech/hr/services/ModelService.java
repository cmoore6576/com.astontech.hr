package com.astontech.hr.services;


import com.astontech.hr.domain.VehicleModel;

import java.util.List;

/**
 * Created by CodyMoor1 on 11/14/2017.
 */
public interface ModelService {


    Iterable<VehicleModel> listAllModel();

    VehicleModel getModelById(Integer id);

    VehicleModel saveModel(VehicleModel vehicleModel );

    VehicleModel saveModelById(Integer id);


    Iterable<VehicleModel> saveModelList (Iterable<VehicleModel> modelIterable);

    void deleteModel(Integer id);

    //custom repo methods

//    VehicleModel findByModelName (String modelName);
//
//    List<VehicleModel> findAllByModelName(String modelName);
//
//    List<VehicleModel> findAllByElementNameIngoreCase(String modelName);

}
