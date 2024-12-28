package Service;

import java.util.List;

import com.example.employee.Model.Employee;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    Employee getEmployeeById(long id);
    List<Employee> getAllEmployees();
    Employee updateEmployee(long id,Employee employee);
    void deleteEmployee(long id);
    
} 
