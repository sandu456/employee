package Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.Model.Employee;

import Repository.EmployeeRepository;
import Service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
  private EmployeeRepository employeeRepository; 

  @Override
  public Employee createEmployee(Employee employee){
    return employeeRepository.save(employee);
  }

  @Override
  public Employee getEmployeeById(long id){
    Optional<Employee> employee=employeeRepository.findById(id);
    return employee.orElse(null);
  }

  @Override
  public List<Employee> getAllEmployees(){
    return employeeRepository.findAll();
  }

  @Override
  public Employee updateEmployee(long id,Employee employee){
    if (employeeRepository.existsById(id)) {
        employee.setId(id);
        employeeRepository.save(employee);
        }
        return null;
  }

  @Override
  public void deleteEmployee(long id){
    employeeRepository.deleteById(id);
  }

}
