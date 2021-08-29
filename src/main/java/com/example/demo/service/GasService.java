package com.example.demo.service;

import com.example.demo.entity.Gas;
import com.example.demo.repository.GasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GasService {
    @Autowired
    private GasRepository repository;

    public List<String> getGases() {
        return repository.selectAll();
    }

    public Gas saveGas(Gas gas) {
        return repository.save(gas);
    }

    public List<Gas> saveGases(List<Gas> gases) {
        return repository.saveAll(gases);
    }

    public List<String> GasByIdStore() {
        return repository.selectAll();
    }

    public Gas updateGas(Gas gas) {
        Gas existingGas = repository.findById(gas.getId_gas()).orElse(null);
        existingGas.setPrice(gas.getPrice());
        existingGas.setProduct(gas.getProduct());
        return repository.save(existingGas);
    }

    public String deleteGasById(int id) {
        repository.deleteById(id);
        return "finish remove id: " + id;
    }

    public String deleteGases(Gas gases) {
        repository.deleteAll();
        return "finish - delete all Gas !! ";
    }



    //nghịch
    public List<Gas> gasDtos() {
        return repository.findAll();
    }
}
