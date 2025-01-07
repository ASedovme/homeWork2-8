package pro.sky.homeWork2n8.Conttroller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homeWork2n8.Service.api.DepartmentService;
import pro.sky.homeWork2n8.model.Employee;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/department")
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;

    @GetMapping("/{departmentId}/employees")
    public List<Employee> employees(@PathVariable Integer departmentId){
      return departmentService.findEmployeesByDepartment(departmentId);
    }

    @GetMapping("/{departmentId}/salary/min")
    public Employee min(@PathVariable Integer departmentId){
        return departmentService.findEmployeeWithMinSalary(departmentId);
    }

    @GetMapping("/{departmentId}/salary/max")
    public Employee max(@PathVariable Integer departmentId){
        return departmentService.findEmployeeWithMaxSalary(departmentId);
    }

    @GetMapping("/employees")
    public Map<Integer, List<Employee>> findEmployeesByDepartment(){
        return departmentService.findEmployeesByDepartment();
    }

}
