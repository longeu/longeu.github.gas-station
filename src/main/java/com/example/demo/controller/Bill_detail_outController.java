package com.example.demo.controller;

import com.example.demo.entity.Bill_detail_in;
import com.example.demo.entity.Bill_detail_out;
import com.example.demo.repository.Bill_detail_outRepository;
import com.example.demo.service.Bill_detail_inService;
import com.example.demo.service.Bill_detail_outService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Bill_detail_outController {
    @Autowired
    Bill_detail_outService service;

    //Thêm hđơn có sẵn
    @PostMapping("/addBillOut")
    public Bill_detail_out addBillOut(@RequestBody Bill_detail_out Bdi) {
        return service.addBillOut(Bdi);
    }


    //Tìm lịch sử nhập
    @GetMapping("/HistoryBillOut/{id}")
    public List<Bill_detail_out> BillOutById(@PathVariable int id){
        return service.BillOutById(id);
    }

    //Tìm tất cả lịch sử nhập
    @GetMapping("/AllHistoryBillOut")
    public List<Bill_detail_out> BillOut(){
        return service.BillOut();
    }

    //Update hđơn theo id
    @PutMapping("/BillOut/{id}")
    public Bill_detail_out updateBillDetailOut(@RequestBody Bill_detail_out BillOut) {
        return service.updateBillDetailOut(BillOut);
    }

    //Xóa hđơn theo id
    @DeleteMapping("/BillOut/{id}")
    public String deleteBillOutById(@PathVariable int id) {
        return service.deleteBillOutById(id);
    }

    //Xóa hết hđơn
    @DeleteMapping("/BillOuts")
    public String deleteBillOuts (@RequestBody Bill_detail_out billDetailOut){
        return service.deleteBillOuts(billDetailOut);
    }
}
