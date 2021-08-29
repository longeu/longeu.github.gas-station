package com.example.demo.repository;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StoreRepository extends JpaRepository<Store, Integer> {
    @Query(nativeQuery = true, value = "select * from store")
    List<Store> selectAll();
//    @Query(nativeQuery = true, value = "select id_store,name_store,address from store where id_store like &?&")
//    String getStoreById(int id);
}
