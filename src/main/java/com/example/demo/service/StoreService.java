package com.example.demo.service;

import com.example.demo.entity.Store;
import com.example.demo.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    @Autowired
    StoreRepository repository;

    public Store createStore(Store store) {
        return repository.save(store);
    }


    public List<Store> getStores() {
        return repository.selectAll();
    }

    public Store getStoreById(int id) {
        return repository.findById(id).orElse(null);
    }


    public String deleteStoreById(int id) {
        repository.deleteById(id);
        return "finish remove id: " + id;
    }

    public Store updateStore(Store store) {
        Store existingStore = repository.findById(store.getId_store()).orElse(null);
        existingStore.setName_store(store.getName_store());
        existingStore.setAddress(store.getAddress());
        existingStore.setEmployees(store.getEmployees());
        return repository.save(existingStore);
    }

    public String deleteStores(Store stores) {
        repository.deleteAll();
        return "finish - delete all Stores !! ";
    }
}
