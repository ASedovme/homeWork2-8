package pro.sky.homeWork2n8.Service.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;
import pro.sky.homeWork2n8.model.Employee;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DepartmentServiceImplTest {

    @InjectMocks
    private DepartmentServiceImpl departmentService;

    @Mock
    private EmployeeServiceImpl employeeService;

    private final Employee EMP1 = new Employee("Petar", "Petarov", 1000, 1);
    private final Employee EMP2 = new Employee("Ivan", "Ivanov", 2000, 1);
    private final Employee EMP3 = new Employee("Djon", "TriVolta", 1000, 2);
    private final Employee EMP4 = new Employee("Filip", "Pugachev", 5000, 3);

    @BeforeEach
    void setUp() {
        when(employeeService.findAll()).thenReturn(Arrays.asList(EMP1, EMP2, EMP3, EMP4));
    }

    @Test
    void findEmployeeWithMaxSalary() {
        assertEquals(2000, departmentService.findEmployeeWithMaxSalary(1).getSalary());
    }

    @Test
    void findEmployeeWithMinSalary() {
        assertEquals(1000, departmentService.findEmployeeWithMinSalary(1).getSalary());
    }

    @Test
    void findEmployeesByDepartment() {
        assertEquals(2,departmentService.findEmployeesByDepartment(1).size());
    }

    @Test
    void findAll() {
        assertEquals(3,departmentService.findEmployeesByDepartment().size());
    }
}