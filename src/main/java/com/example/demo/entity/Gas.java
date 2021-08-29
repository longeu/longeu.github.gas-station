package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "GAS")
public class Gas {
    @Id
    @GeneratedValue
    private int id_gas;
    private String product;
    private int price;
    @OneToMany(mappedBy = "gases")
    private List<WhDetail> whDetailList = new ArrayList<>();
}
