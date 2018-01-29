package services;

import com.astontech.hr.Application;
import com.astontech.hr.domain.Employee;
import com.astontech.hr.services.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;
/**
 * Created by CodyMoor1 on 12/6/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class})
@WebAppConfiguration
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;


    @Test
    public void EmployeeServiceSaveTest(){
        Employee employee1 = new Employee();
        employee1.setFirstName("Bipin");
        employee1.setLastName("Butala");
        employee1.setBackground("Java Developer");

        assertNull(employee1.getId());
        employeeService.saveEmployee(employee1);
        assertNotNull(employee1.getId());

        //fetch



    }
}
