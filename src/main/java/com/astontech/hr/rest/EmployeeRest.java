package com.astontech.hr.rest;

import com.astontech.hr.domain.Employee;
import com.astontech.hr.services.EmployeeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by CodyMoor1 on 12/7/2017.
 */

@RestController
@RequestMapping("/api/employee")
public class EmployeeRest {

    private Logger log = Logger.getLogger(EmployeeRest.class);

    @Autowired
    private EmployeeService employeeService;

    //returns all employees
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Iterable<Employee> getAll(){
        return employeeService.listAllEmployees();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Employee getById(@PathVariable int id){
        return employeeService.getEmployeeByID(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Employee save(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Boolean delete(@PathVariable int id){
        boolean result = false;
        try{
            employeeService.deleteEmployee(id);
            result = true;
        } catch (Exception ex){
            log.info(ex);
        }
        return result;
    }

}
