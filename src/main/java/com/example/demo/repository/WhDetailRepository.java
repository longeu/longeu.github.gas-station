package com.example.demo.repository;

import com.example.demo.entity.Warehouse;
import com.example.demo.entity.WhDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface WhDetailRepository extends JpaRepository<WhDetail, Integer> {
    @Query(nativeQuery = true, value = "Select * from whdetail where id_whdetail like %:id_whdetail% ")
    WhDetail findByWhDetailId(int id_whdetail);
}
