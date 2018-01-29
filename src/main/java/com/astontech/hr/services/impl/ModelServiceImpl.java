package com.astontech.hr.services.impl;

import com.astontech.hr.domain.Vehicle;
import com.astontech.hr.domain.VehicleModel;
import com.astontech.hr.repositories.ModelRepository;
import com.astontech.hr.services.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by CodyMoor1 on 11/14/2017.
 */
@Service
public class ModelServiceImpl implements ModelService {

    @Autowired
    private ModelRepository modelRepository;

    @Override
    public Iterable<VehicleModel> listAllModel() {return modelRepository.findAll() ;}

    @Override
    public VehicleModel getModelById(Integer id) {return modelRepository.findOne(id) ;}

    @Override
    public VehicleModel saveModel(VehicleModel vehicleModel) {
        return modelRepository.save(vehicleModel);
    }

    @Override
    public VehicleModel saveModelById (Integer id){return null;}

    @Override
    public Iterable<VehicleModel> saveModelList(Iterable<VehicleModel> modelIterable) {
        return modelRepository.save(modelIterable);
    }

    @Override
    public void deleteModel(Integer id) { modelRepository.delete(id);

    }

//    @Override
//    public VehicleModel findByModelName(String modelName) {
//        return modelRepository.findVehicleModelByModelName(modelName);
//    }
//
//    @Override
//    public List<VehicleModel> findAllByModelName(String modelName) {
//        return modelRepository.findAllByModelName(modelName);
//    }
//
//    @Override
//    public List<VehicleModel> findAllByElementNameIngoreCase(String modelName) {
//        return modelRepository.findAllByElementNameIgnoreCase(modelName);
//    }
}
