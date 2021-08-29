package com.example.demo.repository;

import com.example.demo.entity.Bill_detail_in;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Bill_detail_outRepository extends JpaRepository<Bill_detail_in,Integer> {
}
