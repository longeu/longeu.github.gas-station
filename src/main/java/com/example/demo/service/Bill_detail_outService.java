package com.example.demo.service;

import com.example.demo.repository.Bill_detail_outRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Bill_detail_outService {
    @Autowired
    Bill_detail_outRepository repository;
}