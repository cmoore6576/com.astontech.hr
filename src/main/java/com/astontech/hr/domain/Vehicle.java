package com.astontech.hr.domain;



import javax.persistence.*;


/**
* Created by CodyMoor1 on 11/13/2017.
*/
@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "VehicleId")
    private Integer id;

    @Version
    private Integer version;

    private String year;

    private String color;

    private String vehicleVin;



    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private VehicleModel vehicleModel;

    public Vehicle() {}

    public Vehicle(String vehicleVin) {
        this.setVehicleVin(vehicleVin);
    }

    public Vehicle(String vehicleName, VehicleModel vehicleModel){
        this(vehicleName);
        this.setVehicleModel(vehicleModel);
    }

    public Vehicle(String vehicleVin, VehicleModel vehicleModel, String year, String color) {
        this(vehicleVin, vehicleModel);
        this.setColor(color);
        this.setYear(year);

    }


    //region Getter/Setter
    public Integer getId() {
        return id;
    }

    public Vehicle setId(Integer id) {
        this.id = id;

        return this;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }


    public VehicleModel getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(VehicleModel vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVehicleVin() {
        return vehicleVin;
    }

    public void setVehicleVin(String vehicleVin) {
        this.vehicleVin = vehicleVin;
    }

//endregion

}
