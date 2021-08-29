package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public Employee createEmployee(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> createEmployees(List<Employee> employees){
        return repository.saveAll(employees);
    }

    public List<Employee> findByIdStore (@PathVariable int id){
        return repository.findByIdStore(id);
    }
//
//    public List<Employee> getEmployeesByName(String employees_name){
//        return repository.findByName(employees_name);
//    }

    public Employee getEmployeeById(int id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteEmployeeById(int id) {
        repository.deleteById(id);
        return "finish remove id: " + id;
    }


    public String deleteEmployees(Employee employee) {
        repository.deleteAll();
        return "finish - delete all employee !! ";
    }

    public Employee saveJustCreateById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Employee updateEmployeeById(Employee employee) {
        Employee existingEmployee = repository.findById(employee.getId_employee()).orElse(null);
        existingEmployee.setName_employee(employee.getName_employee());
        existingEmployee.setAddress(employee.getAddress());
        existingEmployee.setAge(employee.getAge());
        existingEmployee.setPosition(employee.getPosition());
        return repository.save(existingEmployee);
    }
}
