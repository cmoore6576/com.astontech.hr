package com.astontech.hr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by CodyMoor1 on 12/11/2017.
 */
@Controller
public class EmployeeController {

    @RequestMapping("/employee")
    public String employeePage(){

        return "employee";
    }

}
