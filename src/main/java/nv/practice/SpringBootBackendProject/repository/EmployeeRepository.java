package nv.practice.SpringBootBackendProject.repository;

import nv.practice.SpringBootBackendProject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
