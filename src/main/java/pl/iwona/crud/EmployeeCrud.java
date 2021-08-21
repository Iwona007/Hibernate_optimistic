package pl.iwona.crud;

import pl.iwona.entity.Employee;

import java.util.List;

public interface EmployeeCrud {


    Employee saveEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    List<Employee> findAllEmployee();
}
