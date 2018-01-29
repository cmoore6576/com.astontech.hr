package com.astontech.hr.repositories;

import com.astontech.hr.domain.Element;
import com.astontech.hr.domain.VehicleModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by CodyMoor1 on 11/14/2017.
 */
public interface ModelRepository extends CrudRepository <VehicleModel, Integer> {

    //will auto generate the requireed code from the structer of the method name

//    VehicleModel saveModelById (Integer id);

//    VehicleModel findVehicleModelByModelName(String modelName);
//
//    List<VehicleModel> findAllByModelName (String modelName);
//
//    List<VehicleModel> findAllByElementNameIgnoreCase(String elementName);

}
