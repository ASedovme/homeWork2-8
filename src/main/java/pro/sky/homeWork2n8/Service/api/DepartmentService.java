package pro.sky.homeWork2n8.Service.api;

import pro.sky.homeWork2n8.model.Employee;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    Employee findEmployeeWithMaxSalary(int departmentId);

    Employee findEmployeeWithMinSalary(int departmentId);

    Map<Integer, List<Employee>> findEmployeesByDepartment();

    List<Employee> findEmployeesByDepartment(Integer departmentId);
}