package com.example.demo.service;

import com.example.demo.entity.Store;
import com.example.demo.entity.Warehouse;
import com.example.demo.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class WarehouseService {
    @Autowired
    WarehouseRepository repository;
    public Warehouse updateWarehouse(Warehouse wareHouse){
        Warehouse updateWarehouse=repository.findById(wareHouse.getId_warehouse()).orElse(null);
        updateWarehouse.setId_warehouse(wareHouse.getId_warehouse());
        updateWarehouse.setName_warehouse(wareHouse.getName_warehouse());
        updateWarehouse.setId_store(wareHouse.getId_store());
        return repository.save(updateWarehouse);
    }

    public List<Warehouse> findByWareHouseId() {
        return repository.findAll();
    }

    public Warehouse fixWarehouse(Warehouse warehouse) {
        Warehouse existingWarehouse=repository.findById(warehouse.getId_warehouse()).orElse(null);
        existingWarehouse.setId_warehouse(warehouse.getId_warehouse());
        existingWarehouse.setName_warehouse(warehouse.getName_warehouse());
        existingWarehouse.setId_store(warehouse.getId_store());
        return repository.save(existingWarehouse);
    }

    public String deleteWarehouseById(int id) {
        repository.deleteById(id);
        return "finish remove id: " + id;
    }

    public String deleteWarehouses(Warehouse warehouses) {
        repository.deleteAll();
        return "finish - delete all Warehouse !! ";
    }

    public Warehouse newWarehouse(Warehouse warehouse) {
        return repository.save(warehouse);
    }
}
