package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "STORE_EMPLOYEE")
public class Store_Employee {
    @Id
    @GeneratedValue
    private int id_storeEmployee;
    private int id_store;
    private int id_employee;
}
