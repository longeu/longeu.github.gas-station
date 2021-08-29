package com.example.demo.controller;

import com.example.demo.dto.GasDto;
import com.example.demo.entity.Bill_detail_in;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Gas;
import com.example.demo.service.GasService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class GasController {
    @Autowired
    GasService service;

    //hiển thị danh sách tất cả loại gas
    @GetMapping("/Gases")
    public List<String> getGases(){
        return service.getGases();
    }

    // hiển thị danh sách gas theo cửa hàng
    @GetMapping("/GasByIdStore/{id}")
    public List<String> GasByIdStore() {
        return service.GasByIdStore();
    }

    //thêm 1 loại gas
    @PostMapping("/addGas")
    public Gas addGas(@RequestBody Gas gas) {
        return service.saveGas(gas);
    }

    //Thêm danh sách gas
    @PostMapping("/addGases")
    public List<Gas> addGases(@RequestBody List<Gas> gases) {
        return service.saveGases(gases);
    }

    //Update gas theo id
    @PutMapping("/Gas/{id}")
    public Gas updateGas(@RequestBody Gas gas) {
        return service.updateGas(gas);
    }

    //Xóa gas theo id
    @DeleteMapping("/Gas/{id}")
    public String deleteGasById(@PathVariable int id) {
        return service.deleteGasById(id);
    }

    //Xóa hết gas
    @DeleteMapping("/Gases")
    public String deleteGases (@RequestBody Gas gases){
        return service.deleteGases(gases);
    }


    //Nghịch
    @GetMapping ("/GasDto")
    public List<GasDto> gasDtos(){
        return service.gasDtos().stream().map(GasDto::new).collect(Collectors.toList());
    }
}
