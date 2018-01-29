package com.astontech.hr.bootstrap;

import com.astontech.hr.Application;
import com.astontech.hr.domain.*;
import com.astontech.hr.repositories.ElementTypeRepository;
import com.astontech.hr.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CodyMoor1 on 11/1/2017.
 */
@Component
public class SeedData implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private ElementService elementService;


    @Autowired
    private ElementTypeService elementTypeService;


    @Autowired
    private ModelService modelService;

    @Autowired
    private MakeService makeService;


    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private EmployeeService employeeService;


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
//        generateElementAndElmentTypes();
            generateEmployee();

    }
    private void generateElementAndElmentTypes() {


        ElementType laptopType = new ElementType("LapTop");

        List<Element> elementList = new ArrayList<>();
        elementList.add(new Element("Acer"));
        elementList.add(new Element("Dell"));
        elementList.add(new Element("Samsung"));
        elementList.add(new Element("Macbook"));
        elementList.add(new Element("Asus"));

        laptopType.setElementList(elementList);


        elementTypeService.saveElementType(laptopType);

    }

    private void generateVehicle(){

        /**
         *  makeOne
         *      |___modelOne
         *      |       |___vehicleOne
         *      |       |___vehicleTwo
         *      |
         *      |___modelTwo
         *              |___vehicleThree
         *              |___vehicleFour
         *
         *  makeTwo
         *      |___modelThree
         *      |       |___vehicleFive
         *      |       |___vehicleSix
         *      |
         *      |___modelFour
         *              |___vehicleSeven
         *              |___vehicleEight
         *
         */
        //VehicleMakes
        VehicleMake makeOne = new VehicleMake("Ford");
        makeService.saveMake(makeOne);

        VehicleMake makeTwo = new VehicleMake("Toyota");
        makeService.saveMake(makeTwo);

        //Vehicle  Models
        VehicleModel modelOne = new VehicleModel("taurus", makeOne);
        modelService.saveModel(modelOne);

        VehicleModel modelTwo = new VehicleModel("focus", makeOne);
        modelService.saveModel(modelTwo);

        VehicleModel modelThree = new VehicleModel("Camry",makeTwo);
        modelService.saveModel(modelThree);

        VehicleModel modelFour = new VehicleModel ("Prius",makeTwo);
        modelService.saveModel(modelFour);

        //Vehicles
        Vehicle vehicleOne = new Vehicle("qwe123", modelOne);
        vehicleService.saveVehicle(vehicleOne);

        Vehicle vehicleTwo = new Vehicle("abc123",modelOne);
        vehicleService.saveVehicle(vehicleTwo);

        Vehicle vehicleThree = new Vehicle("asd678", modelTwo);
        vehicleService.saveVehicle(vehicleThree);

        Vehicle vehicleFour = new Vehicle("456789",modelTwo);
        vehicleService.saveVehicle(vehicleFour);

        Vehicle vehicleFive = new Vehicle("nnn111",modelFour);
        vehicleService.saveVehicle(vehicleFive);

        Vehicle vehicleSix = new Vehicle("555ghg",modelFour);
        vehicleService.saveVehicle(vehicleSix);

        Vehicle vehicleSeven = new Vehicle("777vvv",modelFour);
        vehicleService.saveVehicle(vehicleSeven);

        Vehicle vehicleEight = new Vehicle("777ccc",modelFour);
        vehicleService.saveVehicle(vehicleEight);


    }

    private void generateEmployee(){

        Employee employee = new Employee();
        employee.setFirstName("Cody");
        employee.setLastName("Moore");
        employee.setBackground("Java Developer");
        employeeService.saveEmployee(employee);

        Employee employee1 = new Employee();
        employee1.setFirstName("Bipin");
        employee1.setLastName("Butala");
        employee1.setBackground("Java Developer");
        employeeService.saveEmployee(employee1);

        Employee employee2 = new Employee();
        employee2.setFirstName("Tony");
        employee2.setLastName("Morano");
        employee2.setBackground("Java Developer");
        employeeService.saveEmployee(employee2);
    }

}
