package com.astontech.hr.services;

import com.astontech.hr.domain.Employee;

/**
 * Created by CodyMoor1 on 12/5/2017.
 */
public interface EmployeeService {

    Iterable<Employee>listAllEmployees();

    Employee getEmployeeByID(Integer id);

    Employee saveEmployee(Employee employee);

    Iterable<Employee> saveEmployeeList (Iterable<Employee> employeeIterable);

    void deleteEmployee(Integer id);
}
