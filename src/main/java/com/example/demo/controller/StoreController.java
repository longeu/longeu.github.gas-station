package com.example.demo.controller;

import com.example.demo.entity.Store;
import com.example.demo.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class StoreController {
    @Autowired
    StoreService service;

    @PostMapping("/addStore")
    public Store addStore(@RequestBody Store store) {
        return service.createStore(store);
    }

    @GetMapping("/Store/{id}")
    public Store findStoreById(@PathVariable int id){
        return service.getStoreById(id);
    }
    //hiện danh sách cửa hàng
    @GetMapping("/Stores")
    public List<Store> getStores(){
        return service.getStores();
    }

    //Update Warehouse theo id
    @PutMapping("/Store/{id}")
    public Store updateStore(@RequestBody Store store) {
        return service.updateStore(store);
    }

    //Xóa Store theo id
    @DeleteMapping("/Store/{id}")
    public String deleteStoreById(@PathVariable int id) {
        return service.deleteStoreById(id);
    }

    //Xóa hết Store
    @DeleteMapping("/Stores")
    public String deleteStores (@RequestBody Store store){
        return service.deleteStores(store);
    }


}
