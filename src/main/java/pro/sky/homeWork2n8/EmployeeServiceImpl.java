package pro.sky.homeWork2n8;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Override
    public Collection<Employee> findAll() {
        List<Employee> employees = List.of();
        return employees;
    }
}
