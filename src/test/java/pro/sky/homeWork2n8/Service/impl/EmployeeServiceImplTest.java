package pro.sky.homeWork2n8.Service.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.homeWork2n8.model.Employee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceImplTest {
    private EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    private final Employee EMP = new Employee("Petar", "Petarov", 10, 1);

    @BeforeEach
    void setUp(){
        employeeService = new EmployeeServiceImpl();
    }

    @Test
    void findAll() {
        employeeService.add(EMP);
        employeeService.add(new Employee("Vova","Vovo",1,1));
        assertEquals(2, employeeService.findAll().size());

    }

    @Test
    void add() {
        assertEquals(0, employeeService.findAll().size());
        employeeService.add(EMP);
        assertEquals(1, employeeService.findAll().size());
    }

    @Test
    void remove() {
        assertEquals(0, employeeService.findAll().size());
        employeeService.add(EMP);
        assertEquals(1, employeeService.findAll().size());
        employeeService.remove(EMP);
        assertEquals(0, employeeService.findAll().size());
    }

    @Test
    void find() {
        employeeService.add(EMP);
        assertEquals(EMP, employeeService.find(EMP.getFirstName(), EMP.getLastName()));
    }
}