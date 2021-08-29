package com.example.demo.service;

import com.example.demo.entity.Warehouse;
import com.example.demo.entity.WhDetail;
import com.example.demo.repository.WhDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WhDetailService {
    @Autowired
    WhDetailRepository repository;

    public WhDetail updateWhDetail(WhDetail whDetail){
        WhDetail updateWhDetail=repository.findById(whDetail.getId_whdetail()).orElse(null);
        updateWhDetail.setId_whdetail(whDetail.getId_whdetail());
        updateWhDetail.setId_warehouse(whDetail.getId_warehouse());
        updateWhDetail.setId_gas(whDetail.getId_gas());
        updateWhDetail.setQuantity(whDetail.getQuantity());
        return repository.save(updateWhDetail);
    }

    public WhDetail findByWhDetailId(int id_whdetail) {
        return repository.findByWhDetailId(id_whdetail);
    }

    public WhDetail fixWhDetail(WhDetail whDetail) {
        WhDetail existingWhDetail=repository.findById(whDetail.getId_warehouse()).orElse(null);
        existingWhDetail.setId_warehouse(whDetail.getId_warehouse());
        existingWhDetail.setId_gas(whDetail.getId_gas());
        existingWhDetail.setQuantity(whDetail.getQuantity());
        return repository.save(existingWhDetail);
    }

    public String deleteWhDetailById(int id) {
        repository.deleteById(id);
        return "finish remove id: " + id;
    }

    public String deleteWhDetails(WhDetail whDetails) {
        repository.deleteAll();
        return "finish - delete all Warehouse !! ";
    }

    public WhDetail newWhDetail(WhDetail whDetail) {
        return repository.save(whDetail);
    }
}
