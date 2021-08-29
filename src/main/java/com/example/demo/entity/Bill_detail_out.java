package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "BILL_DETAIL_OUT")
public class Bill_detail_out {
    @Id
    @GeneratedValue
    private int id_billDetailOut;
    private int id_warehouse;
    private int id_employee;
    private int id_gas;
    private Date datetime;
    private int quantity;
}
