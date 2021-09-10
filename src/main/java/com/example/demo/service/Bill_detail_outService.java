package com.example.demo.service;

import com.example.demo.entity.Bill_detail_in;
import com.example.demo.entity.Bill_detail_out;
import com.example.demo.entity.Employee;
import com.example.demo.entity.WhDetail;
import com.example.demo.repository.Bill_detail_outRepository;
import com.example.demo.repository.WhDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Bill_detail_outService {
    @Autowired
    Bill_detail_outRepository repository;

    @Autowired
    WhDetailRepository whDetailRepository;

    @Autowired
    WhDetailService service;


    public Bill_detail_out addBillOut( Bill_detail_out Bdo) {
        WhDetail existingWhDetail = whDetailRepository.findByWhDetailId(Bdo.getId_whdetail());

        WhDetail whDetail = service.updateWhDetail(existingWhDetail);
        whDetail.setId_whdetail(existingWhDetail.getId_whdetail());
        whDetail.setId_warehouse(existingWhDetail.getId_warehouse());
        whDetail.setId_gas(existingWhDetail.getId_gas());
        whDetail.setQuantity(existingWhDetail.getQuantity() - Bdo.getQuantity());
        return repository.save(Bdo);
    }

    public List<Bill_detail_out> BillOutById(int id){
        return repository.BillOutId(id);
    }

    public List<Bill_detail_out> BillOut(){
        return repository.findAll();
    }

    public Bill_detail_out updateBillDetailOut(Bill_detail_out billOut) {
        Bill_detail_out existingbillOut = repository.findById(billOut.getId_billDetailOut()).orElse(null);
        existingbillOut.setId_whdetail(billOut.getId_whdetail());
        existingbillOut.setQuantity(billOut.getQuantity());
        existingbillOut.setId_gas(billOut.getId_gas());
        existingbillOut.setId_employee(billOut.getId_employee());
        return repository.save(existingbillOut);
    }

    public String deleteBillOutById(int id) {
        repository.deleteById(id);
        return "remove done id: " + id;
    }

    public String deleteBillOuts(Bill_detail_out billDetailOut) {
        repository.deleteAll();
        return "finish - delete all detail !! ";
    }
}
