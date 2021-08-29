package com.example.demo.controller;

import com.example.demo.repository.Bill_detail_outRepository;
import com.example.demo.service.Bill_detail_outService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bill_detail_outController {
    @Autowired
    Bill_detail_outService service;
}
