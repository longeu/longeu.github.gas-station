package com.example.demo.entity;

import com.example.demo.dto.GasDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "WAREHOUSE")
public class Warehouse {
    @Id
    @GeneratedValue
    private int id_warehouse;
    private String name_warehouse;
    private int id_store;
//    @OneToMany (mappedBy = "Gas",cascade = CascadeType.ALL)
//    private List<Gas> gasList;
}
