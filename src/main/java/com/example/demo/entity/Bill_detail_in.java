package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Calendar;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "BILL_DETAIL_IN")
public class Bill_detail_in {
    @Id
    @GeneratedValue
    private int id_billDetailIn;
    private int id_whdetail;
    private int id_employee;
    private int id_gas;
    private Calendar datetime = Calendar.getInstance();
    private int quantity;
}
