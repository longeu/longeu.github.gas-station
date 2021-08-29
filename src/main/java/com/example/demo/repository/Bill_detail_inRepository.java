package com.example.demo.repository;

import com.example.demo.entity.Bill_detail_in;
import com.example.demo.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Bill_detail_inRepository extends JpaRepository<Bill_detail_in,Integer> {
    @Query(nativeQuery = true, value = "Select * \n" +
            "from warehouse wh join bill_detail_in bdi on wh.id_warehouse= bdi.id_warehouse\n" +
            "where wh.id_warehouse like %?%")
    List<Bill_detail_in> BillInId(int id);
}
