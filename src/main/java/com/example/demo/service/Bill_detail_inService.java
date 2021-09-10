package com.example.demo.service;

import com.example.demo.entity.Bill_detail_in;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Warehouse;
import com.example.demo.entity.WhDetail;
import com.example.demo.repository.Bill_detail_inRepository;
import com.example.demo.repository.WarehouseRepository;
import com.example.demo.repository.WhDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class Bill_detail_inService {
    @Autowired
    Bill_detail_inRepository repository;
    @Autowired
    WhDetailRepository whDetailRepository;
    @Autowired
    WhDetailService service;


    public Bill_detail_in addNewBill(Bill_detail_in newBdi) {
        return repository.save(newBdi);
    }

    public Bill_detail_in addBdi( Bill_detail_in Bdi) {
        WhDetail existingWhDetail = whDetailRepository.findByWhDetailId(Bdi.getId_whdetail());

        WhDetail whDetail = service.updateWhDetail(existingWhDetail);
        whDetail.setId_whdetail(existingWhDetail.getId_whdetail());
        whDetail.setId_warehouse(existingWhDetail.getId_warehouse());
        whDetail.setId_gas(existingWhDetail.getId_gas());
        whDetail.setQuantity(existingWhDetail.getQuantity() + Bdi.getQuantity());
        return repository.save(Bdi);
    }

    public List<Bill_detail_in> BillInById(int id){
        return repository.BillInId(id);
    }

    public List<Bill_detail_in> BillIn(){
        return repository.findAll();
    }

    public Bill_detail_in updateBillDetailIn(Bill_detail_in billIn) {
        Bill_detail_in existingbillIn = repository.findById(billIn.getId_billDetailIn()).orElse(null);
        existingbillIn.setId_whdetail(billIn.getId_whdetail());
        existingbillIn.setQuantity(billIn.getQuantity());
        existingbillIn.setId_gas(billIn.getId_gas());
        existingbillIn.setId_employee(billIn.getId_employee());
        return repository.save(existingbillIn);
    }

    public String deleteBillInById(int id) {
        repository.deleteById(id);
        return "remove done id: " + id;
    }

    public String deleteBillIns(Bill_detail_in billDetailIn) {
        repository.deleteAll();
        return "finish - delete all detail !! ";
    }
}
