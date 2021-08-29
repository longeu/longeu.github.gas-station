package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Store;
import com.example.demo.entity.Warehouse;
import com.example.demo.entity.WhDetail;
import com.example.demo.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WarehouseController {
    @Autowired
    WarehouseService service;

    //lấy Warehouse trong bảng dựa theo id
    @GetMapping("/allWarehouse")
    public List<Warehouse> findByWareHouseId() {
        return service.findByWareHouseId();
    }

    @PostMapping("/newWarehouse")
    public Warehouse newWarehouse(@RequestBody Warehouse warehouse){
        return service.newWarehouse(warehouse);
    }

    //Update Warehouse theo id
    @PutMapping("/Warehouse/{id}")
    public Warehouse fixWarehouse(@RequestBody Warehouse warehouse) {
        return service.fixWarehouse(warehouse);
    }

    //Xóa Warehouse theo id
    @DeleteMapping("/Warehouse/{id}")
    public String deleteWarehouseById(@PathVariable int id) {
        return service.deleteWarehouseById(id);
    }

    //Xóa hết Store
    @DeleteMapping("/Warehouses")
    public String deleteWarehouses (@RequestBody Warehouse warehouses){
        return service.deleteWarehouses(warehouses);
    }
}
