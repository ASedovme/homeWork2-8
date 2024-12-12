package pro.sky.homeWork2n8.Service.impl;

import org.springframework.stereotype.Service;
import pro.sky.homeWork2n8.Exceptions.EmployeeNotFoundException;
import pro.sky.homeWork2n8.model.Employee;
import pro.sky.homeWork2n8.Service.api.EmployeeService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final List<Employee> employees = new ArrayList<>();
    @Override
    public Collection<Employee> findAll(){
        return employees;
    }

    @Override
    public Employee add(Employee employee) {
        employees.add(employee);
        return employee;
    }


    @Override
    public Employee remove (Employee employee){
        employees.remove(employee);
        return employee;
    }
    @Override
    public Employee find(String firstName, String lastName) {
        return employees.stream()
                .filter(it -> it.getFirstName().equals(firstName) && it.getLastName().equals(lastName))
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException("No such employee"));
    }
}
