package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Store;
import com.example.demo.entity.Warehouse;
import com.example.demo.entity.WhDetail;
import com.example.demo.service.WarehouseService;
import com.example.demo.service.WhDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WhDetailController {
    @Autowired
    WhDetailService service;

    //lấy Warehouse trong bảng dựa theo id
    @GetMapping ("/WhDetail")
    public WhDetail findByWhDetailId(@RequestParam int id_whdetail) {
        return service.findByWhDetailId(id_whdetail);
    }

    @PostMapping("/newWhDetail")
    public WhDetail newWhDetail(@RequestBody WhDetail whDetail){
        return service.newWhDetail(whDetail);
    }

    //Update Warehouse theo id
    @PutMapping("/WhDetail/{id}")
    public WhDetail fixWhDetail(@RequestBody WhDetail whDetail) {
        return service.fixWhDetail(whDetail);
    }

    //Xóa Warehouse theo id
    @DeleteMapping("/WhDetail/{id}")
    public String deleteWhDetailById(@PathVariable int id) {
        return service.deleteWhDetailById(id);
    }

    //Xóa hết Store
    @DeleteMapping("/WhDetails")
    public String deleteWhDetails (@RequestBody WhDetail whDetails){
        return service.deleteWhDetails(whDetails);
    }
}
