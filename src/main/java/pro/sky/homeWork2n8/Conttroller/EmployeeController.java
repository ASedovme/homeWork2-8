package pro.sky.homeWork2n8.Conttroller;

import org.springframework.web.bind.annotation.*;
import pro.sky.homeWork2n8.Service.api.EmployeeService;
import pro.sky.homeWork2n8.model.Employee;

import java.util.Collection;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public Collection<Employee>getEmployee(){
        return employeeService.findAll();
    }
    @GetMapping("/find")
    public Employee findEmployeeByNames(@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.find(firstName, lastName);
    }

    @DeleteMapping
    public Employee delete(@RequestBody Employee employee) {
        return employeeService.remove(employee);
    }

    @PostMapping
    public Employee add (@RequestBody Employee employee){
        return employeeService.add(employee);

    }



}
