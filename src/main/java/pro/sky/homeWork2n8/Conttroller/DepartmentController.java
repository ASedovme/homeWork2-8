package pro.sky.homeWork2n8.Conttroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homeWork2n8.Service.api.DepartmentService;
import pro.sky.homeWork2n8.model.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/max-salary")
    public Employee findEmployeeWithMaxSalaryByDepartmentId(@RequestParam int departmentId) {
        return departmentService.findEmployeeWithMaxSalary(departmentId);
    }

    @GetMapping("/min-salary")
    public Employee findEmployeeWithMinSalaryByDepartmentId(@RequestParam int departmentId) {
        return departmentService.findEmployeeWithMinSalary(departmentId);
    }

    @GetMapping("/all")
    public Map<Integer, List<Employee>> findEmployees() {
        return departmentService.findEmployeesByDepartment();
    }

    @GetMapping(path = "/all", params = {"departmentId"})
    public Collection<Employee> findEmployees(@RequestParam int departmentId) {
        return departmentService.findEmployeesByDepartment(departmentId);
    }
}