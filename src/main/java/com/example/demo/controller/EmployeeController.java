package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService service;

    //thêm nhiều nvien
    @PostMapping("/employees")
    public List<Employee> addEmployees(@RequestBody List<Employee> employees){
        return service.createEmployees(employees);
    }
    //thêm 1 nhân viên
    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee){
        return service.createEmployee(employee);
    }

    //Tìm nvien theo id
    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    //Tìm nvien theo cửa hàng
    @GetMapping("/employeeStore/{id}")
    public List<Employee> findByIdStore( @PathVariable int id){
        return service.findByIdStore(id);
    }

    //Update nvien theo id
    @PutMapping("/employee/{id}")
    public Employee updateEmployeeById(@RequestBody Employee employee) {
        return service.updateEmployeeById(employee);
    }

    //Xóa nvien theo id
    @DeleteMapping("/employee/{id}")
    public String deleteEmployeeById(@PathVariable int id) {
        return service.deleteEmployeeById(id);
    }

    //Xóa hết nvien
    @DeleteMapping("/employees")
    public String deleteEmployees (@RequestBody Employee employee){
        return service.deleteEmployees(employee);
    }
}
