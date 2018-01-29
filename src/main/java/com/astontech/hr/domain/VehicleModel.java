package com.astontech.hr.domain;

import javax.persistence.*;

/**
 * Created by CodyMoor1 on 11/13/2017.
 */
@Entity
public class VehicleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;

    private String modelName;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private VehicleMake make;


    public VehicleModel(String modelName) {
        this.modelName = modelName;
    }

    public VehicleModel(String modelName, VehicleMake make) {
        this.modelName = modelName;
        this.make = make;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public VehicleMake getMake() {
        return make;
    }

    public void setMake(VehicleMake make) {
        this.make = make;
    }
}
