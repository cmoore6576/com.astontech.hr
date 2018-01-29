package com.astontech.hr.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

/**
 * Created by CodyMoor1 on 12/5/2017.
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee extends Person{

    private String background;

    @OneToMany
    private List<Project> projects;

    public Employee(){}

    public Employee(String background) {
        this.background = background;
    }

    //region Getters/Setters

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }
    //endregion
}

