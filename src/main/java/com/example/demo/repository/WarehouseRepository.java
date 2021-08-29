package com.example.demo.repository;

import com.example.demo.entity.Warehouse;
import com.example.demo.entity.WhDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {
    @Query(nativeQuery = true, value = "Select * from warehouse where id_warehouse like %:id_warehouse% ")
    Warehouse findByWHId(int id_warehouse);
}
