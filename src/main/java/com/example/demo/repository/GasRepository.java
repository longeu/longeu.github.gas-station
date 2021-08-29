package com.example.demo.repository;

import com.example.demo.entity.Gas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GasRepository extends JpaRepository<Gas,Integer> {
    @Query(nativeQuery = true, value = "select wh.name_warehouse,s.name_store,wh.quantity,g.product from warehouse wh join gas g on wh.id_gas = g.id_gas join store s on s.id_store = wh.id_store")
    List<String> selectAll();
}
