package pro.sky.homeWork2n8;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface DepartmentService {
    Employee findEmployeeWithMaxSalary(int departmentId);

    Employee findEmployeeWithMinSalary(int departmentId);

    Map<Integer, List<Employee>> findEmployeesByDepartment();

    Collection<Employee> findEmployeesByDepartment(Integer departmentId);
}