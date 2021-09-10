package com.example.demo.controller;

import com.example.demo.entity.Bill_detail_in;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Warehouse;
import com.example.demo.repository.Bill_detail_inRepository;
import com.example.demo.repository.WarehouseRepository;
import com.example.demo.service.Bill_detail_inService;
import com.example.demo.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Bill_detail_inController {
    @Autowired
    Bill_detail_inService service;

    //Thêm hđơn có sẵn
    @PostMapping("/addBillIn")
    public Bill_detail_in addBdi(@RequestBody Bill_detail_in Bdi) {
        return service.addBdi(Bdi);
    }

    //thêm hóa đơn mới
    @PostMapping("/addNewBillIn")
    public Bill_detail_in addNewBill(@RequestBody Bill_detail_in newBdi){
        return service.addNewBill(newBdi);
    }

    //Tìm lịch sử nhập
    @GetMapping("/HistoryBillIn/{id}")
    public List<Bill_detail_in> BillInById(@PathVariable int id){
        return service.BillInById(id);
    }

    //Tìm tất cả lịch sử nhập
    @GetMapping("/AllHistoryBillIn")
    public List<Bill_detail_in> BillIn(){
        return service.BillIn();
    }

    //Update hđơn theo id
    @PutMapping("/BillIn/{id}")
    public Bill_detail_in updateBillDetailIn(@RequestBody Bill_detail_in billIn) {
        return service.updateBillDetailIn(billIn);
    }

    //Xóa hđơn theo id
    @DeleteMapping("/BillIn/{id}")
    public String deleteBillInById(@PathVariable int id) {
        return service.deleteBillInById(id);
    }

    //Xóa hết hđơn
    @DeleteMapping("/BillIns")
    public String deleteBillIns (@RequestBody Bill_detail_in billDetailIn){
        return service.deleteBillIns(billDetailIn);
    }
}
