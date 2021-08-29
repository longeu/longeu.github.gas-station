package com.example.demo.repository;

import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    @Query(nativeQuery = true, value = "SELECT * \n" +
            "from store s join store_employee se on s.id_store = se.id_store \n" +
            "join employee e on e.id_employee = se.id_employee \n" +
            "where s.id_store like %?%")
    public List<Employee> findByIdStore(int id);
}
