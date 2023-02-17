package nv.practice.SpringBootBackendProject.model;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name = "EmployeesInfo")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_id")
    private String email;
}
