package com.astontech.hr.repositories;

import com.astontech.hr.domain.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by CodyMoor1 on 12/5/2017.
 */
public interface EmployeeRepository extends CrudRepository <Employee, Integer> {
}
