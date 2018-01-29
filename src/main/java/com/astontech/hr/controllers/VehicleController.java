package com.astontech.hr.controllers;

import com.astontech.hr.domain.VO.VehicleVO;
import com.astontech.hr.domain.Vehicle;
import com.astontech.hr.domain.VehicleMake;
import com.astontech.hr.services.MakeService;
import com.astontech.hr.services.ModelService;
import com.astontech.hr.services.VehicleService;
import com.sun.javafx.sg.prism.NGShape;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CodyMoor1 on 11/13/2017.
 */
@Controller
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private ModelService modelService;

    @Autowired
    private MakeService makeService;

    private Logger log = Logger.getLogger(AdminController.class);

    //this request mapping gets the JSP and displays it when someone enters the URL below
    @RequestMapping(value = "/admin/vehicles/add", method = RequestMethod.GET)
    public String adminVehicleGet(Model model){
        //clearing the form for the user(Getting that new VO after a form is submitted)
        model.addAttribute("vehicleVO", new VehicleVO());

        model.addAttribute("makeList",makeService.listAllMake());
        //warning alert is visible(This references the JSP model attribute of the warning alert)
        model.addAttribute("warningAlert","visible");
        //this returns the vehicle add JSP blank form page
        return "admin/vehicle/vehicle_add";

    }

    @RequestMapping(value = "/admin/vehicles/add", method = RequestMethod.POST)
    public String adminVehiclePost( VehicleVO vehicleVO, Model model) {
        vehicleVO.splitNewVehiceIntoArray();
        logVehicleVo(vehicleVO);
        saveVehicleModelAndMakeFromVO(vehicleVO);

        return "admin/vehicle/vehicle_add";
    }

//    //region Helper Methods
    private void saveVehicleModelAndMakeFromVO(VehicleVO vehicleVO){
        List<Vehicle> newVehicleList = new ArrayList<Vehicle>();
        for(String str : vehicleVO.getNewVehicleArray()) {
            newVehicleList.add(new Vehicle(str));
        }
        Vehicle newVehicle = new Vehicle(vehicleVO.getNewVehicle());
//        newVehicle.setVehicleName(newVehicle);
    }

    private void logVehicleVo(VehicleVO vehicleVO) {
        log.info("New Vehicle: " + vehicleVO.getNewVehicle());

        for (String str : vehicleVO.getNewVehicleArray()) {
            log.info("New Vehicle: " + str);
        }
    }
//endregion
}

