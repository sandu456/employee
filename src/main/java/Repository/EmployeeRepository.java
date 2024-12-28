 package Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.employee.Model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee,Long> {

    
}