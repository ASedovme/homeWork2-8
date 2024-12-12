package pro.sky.homeWork2n8.Service.api;

import pro.sky.homeWork2n8.model.Employee;

import java.util.Collection;


public interface EmployeeService {

    Collection<Employee> findAll();
    Employee add (Employee employee);
    Employee remove (Employee employee);
    Employee find (String firstName, String lastName);

}
