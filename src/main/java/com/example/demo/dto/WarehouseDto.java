package com.example.demo.dto;

import com.example.demo.entity.Warehouse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class WarehouseDto {
    private String name_warehouse;

    public WarehouseDto (Warehouse warehouse){
        this.setName_warehouse(warehouse.getName_warehouse());
    }
}
