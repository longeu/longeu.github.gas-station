package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeeRequest {

    private String name_employee;
    private int age;
    private String position;
    private String address;

    private List<WarehouseDto> storeRequests;

}
