package com.example.demo.repository;


import com.example.demo.entity.Bill_detail_out;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Bill_detail_outRepository extends JpaRepository<Bill_detail_out,Integer> {
    @Query(nativeQuery = true, value = "Select * \n" +
            "from warehouse wh join bill_detail_out bdo on wh.id_warehouse= bdo.id_warehouse\n" +
            "where wh.id_warehouse like %?%")
    List<Bill_detail_out> BillOutId(int id);
}
