package pro.sky.homeWork2n8;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Override
    public Collection<Employee> findAll() {
        return List.of();
    }
}
